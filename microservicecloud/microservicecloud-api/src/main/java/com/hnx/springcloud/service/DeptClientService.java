package com.hnx.springcloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hnx.springcloud.entities.Dept;


//针对哪一个微服务开启面向接口的feignclient
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
	
	  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	  public Dept get(@PathVariable("id") long id);
	 
	  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	  public List<Dept> list();
	 
	  @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	  public boolean add(Dept dept);


}
