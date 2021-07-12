package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.UserRepository;
import com.example.model.User;

@SpringBootApplication
public class BootJpaTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootJpaTestApplication.class, args);
		
		UserRepository bean = context.getBean(UserRepository.class);
		
		User user = new User();
		
		user.setName("John2");
		user.setCity("Jkarta");
		user.setStatus("Mobile Developer");
		
		 User userData= bean.save(user);
		 
		 System.out.println(userData.getName());
		 //Deletes the entity with the given id.
		 bean.deleteById(3);
		 
		 System.out.println("Deleted Successfully");
	}

}
