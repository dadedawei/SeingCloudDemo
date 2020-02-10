package com.hnx.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
//@AllArgsConstructor	//全参构造参数
@NoArgsConstructor	//空参构造参数
@Data	//生成get set
@Accessors(chain = true) 	//链式风格
public class Dept implements Serializable{ // Dept(Entity) orm mysql->Dept(table) 类表关系映射

	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
	
}
