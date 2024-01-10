package com.lizhi.bs;

import org.dromara.easyes.starter.register.EsMapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * @author <a href="https://github.com/lizhe-0423">lizhi</a>
 */
@SpringBootApplication
@MapperScan("com.lizhi.bs.mapper.mp")
@EsMapperScan("com.lizhi.bs.mapper.es")
public class BsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsApplication.class, args);
	}

}
