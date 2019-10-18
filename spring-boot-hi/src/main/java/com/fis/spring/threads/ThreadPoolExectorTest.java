package com.fis.spring.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Oct 16, 2019
 */
public class ThreadPoolExectorTest {

	/**
	 * 用一句话描述这个方法的作用
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个可以缓存的线程。
		//ExecutorService cachedThreadPool = Executors.newFixedThreadPool(5);
		// ScheduledExecutorService  scheduledThreadPool = Executors.newScheduledThreadPool(3);
		 ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
		for(int i = 0;i < 10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			final int  index = i;
			singleThreadPool.execute(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName() + "正在被执行的i值是：" + index) 	;
				}
				
			});
	
		}

	}

}
