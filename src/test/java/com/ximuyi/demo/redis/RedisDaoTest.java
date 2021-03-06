package com.ximuyi.demo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisDaoTest {

	public static Logger logger = LoggerFactory.getLogger(RedisDaoTest.class);

	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisDao redisDao;

	@Test
	public void testRedis(){
		redisDao.set("name","forezp");
		redisDao.set("age","11");
		logger.info(redisDao.get("name"));
		logger.info(redisDao.get("age"));
	}
}
