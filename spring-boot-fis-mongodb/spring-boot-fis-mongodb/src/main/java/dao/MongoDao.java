package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.fis.xiaolu.mongo.entity.Mongo;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Oct 17, 2019
 */
@Component
public class MongoDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void save(Mongo m){
		mongoTemplate.save(m);
	}
	
	public Mongo findByName(String name){
		Query query = new Query(Criteria.where("name").is(name));
		Mongo m = mongoTemplate.findOne(query, Mongo.class);
		return m;
	}
	
	public void updateFistOne(Mongo m){
		Query query = new Query(Criteria.where("id").is(m.getId()));
		Update update = new Update().set("name", m.getName()).set("age", m.getAge());
		mongoTemplate.updateFirst(query, update, Mongo.class);
	}
	
	public void updateAll(Mongo m){
		Query query = new Query(Criteria.where("age").is(m.getAge()));
		Update update = new Update().set("name", m.getName()).set("age", m.getAge());
		mongoTemplate.updateMulti(query, update, Mongo.class);
	}
	
	public void deleteById(Mongo m){
		Query query = new Query(Criteria.where("id").is(m.getId()));
		mongoTemplate.remove(query , Mongo.class);
	}
	
}
