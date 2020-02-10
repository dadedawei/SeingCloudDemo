package com.hnx.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule
{
  @Bean
  public IRule myRule()
  {
   //return new RandomRule();//Ribbon默认是轮询，我自定义为随机
	  return new RandomRule_ZY();	//自定义每台机器被访问5次
  }
}