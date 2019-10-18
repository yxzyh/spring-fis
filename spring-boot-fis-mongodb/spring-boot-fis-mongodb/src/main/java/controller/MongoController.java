package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fis.xiaolu.mongo.entity.Mongo;

import dao.MongoDao;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Oct 17, 2019
 */
@RestController
public class MongoController {
	
	@Autowired
	MongoDao mongoDao;

	@RequestMapping("save")
	public void save(HttpServletRequest request,@RequestParam Mongo m){
		mongoDao.save(m);
	}
	
	@RequestMapping("search")
	public Mongo findMongoByName(HttpServletRequest request,@RequestParam String name){
		return mongoDao.findByName(name);
	}
	
	@RequestMapping("update")
	public void updateById(HttpServletRequest request,@RequestParam Mongo m){
		mongoDao.updateFistOne(m);
	}
	
	@RequestMapping("delete")
	public void delete(HttpServletRequest request,@RequestParam Mongo m){
		mongoDao.deleteById(m);
	}
	
}
