package com.fis.spring.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 对ip做hash处理
 * @author XiaoLu.Su 
 * @Date Oct 16, 2019
 */
public class IpHash {

	static Map<String,Integer> ipMap = new HashMap<>();
	static{
		ipMap.put("192.168.1.2", 1);
		ipMap.put("192.168.1.20", 2);
		ipMap.put("192.168.1.123", 3);
		ipMap.put("192.168.1.62", 4);
	}
	
	public String ipHash(String clientIp){
		Map<String,Integer> ipServerMap = new ConcurrentHashMap<>();
		ipServerMap.putAll(ipMap);
		
		 Set<String> ipset=ipServerMap.keySet();
		
		ArrayList<String> iplist=new ArrayList<String>();
		iplist.addAll(ipset);
		
		int hashCode = clientIp.hashCode();
		int serverListSize = iplist.size();
		int pos = hashCode%serverListSize;
		
		return iplist.get(pos);
	}
	public static void main(String args[]){
		IpHash ipHash = new IpHash();
		String serverName = ipHash.ipHash("192.168.0.100");
		System.out.println(serverName);
	}
}
