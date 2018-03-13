package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//禁用mongoAutoConfiguration,开启自动配置
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class TextDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(TextDemoApplication.class, args);
		// 关闭banner启动文字
		SpringApplication application = new SpringApplication(TextDemoApplication.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}
}
