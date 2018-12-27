package com.mzbloc.elasticsearch.service;

import com.alibaba.fastjson.JSONObject;
import com.mzbloc.elasticsearch.ElsdemoApplication;
import com.mzbloc.elasticsearch.entity.ClienteEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ElsdemoApplication.class)
public class ElasticsearchServiceApplicationTests {

	@Autowired
	private ClienteService elsService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findCliente(){
		ClienteEntity clienteEntity = elsService.findCliente("AWfpEwTqgyaPzbMDrVzZ");
		System.out.println("aaaaaaaaaaaaa==============="+ JSONObject.toJSONString(clienteEntity));
	}

}

