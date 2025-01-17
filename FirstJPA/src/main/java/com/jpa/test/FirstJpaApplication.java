package com.jpa.test;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class FirstJpaApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("Arun");
//		user.setCity("madhya Pradesh");
//		user.setStatus("I am python Programmer");
//		User user2 = userRepository.save(user);
		
//		System.out.println(user2);
		
//		User user = new User();
//		user.setName("vir");
//		user.setCity("Ahmedabad");
//		user.setStatus("Android Developer");
//		
//		User user1 = new User();
//		user1.setName("bhaumik");
//		user1.setCity("bhavnagar");
//		user1.setStatus("ios Developer");
		
//		way1 insert data
//		ArrayList<User> ar = new ArrayList<User>();
//		ar.add(user);
//		ar.add(user1);
//		
//		Iterable<User> saveAll = userRepository.saveAll(ar);
//		saveAll.forEach(u ->{
//			System.out.println(u);
//		});
		
//		way2
//		List<User> list = List.of(user,user1);
//		Iterable<User> saveAll = userRepository.saveAll(list);
//		saveAll.forEach(u ->{
//			System.out.println(u);
//		});
//		System.out.println("Done");
		
		// for update or findById
//		Optional<User> optional = userRepository.findById(2);
//		User user2 = optional.get();
//		user2.setName("java");
//		User result = userRepository.save(user2);
//		System.out.println(result);
		
		// get all data
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(i -> System.out.println(i));
		
		// for delete
//		userRepository.deleteById(15);
//		System.out.println("done");
		
		// for count
//		long count = userRepository.count();
//		System.out.println(count);
		
//		List<User> byName = userRepository.findByName("viru");
//		byName.forEach(b -> System.out.println(b));
		
//		List<User> users = userRepository.findByNameAndCity("viru", "ahmedabad");
//		users.forEach(a->System.out.println(a));
		
//		List<User> byFirstLetter = userRepository.findByNameStartingWith("b");
//		byFirstLetter.forEach(s->System.out.println(s));
		
//		List<User> byNameEndingWith = userRepository.findByNameEndingWith("h");
//		byNameEndingWith.forEach(s->System.out.println(s));
		
//		List<User> byCityStartingWith = userRepository.findByCityStartingWith("ahmedabad");
//		byCityStartingWith.forEach(a -> System.out.println(a));
		
//		List<User> byCityEndingWith = userRepository.findByCityEndingWith("r");
//		byCityEndingWith.forEach(a -> System.out.println(a));
		
//		List<User> allUser = userRepository.getAllUsers();
//		allUser.forEach(a -> System.out.println(a));
		
//		List<User> byNameContaining = userRepository.findByNameContaining("u");
//		byNameContaining.forEach(a -> System.out.println(a));
		
//		List<User> userByName = userRepository.getUserByName("viru");
//		userByName.forEach(p -> System.out.println(p));
		
		List<User> userByNameAndCity = userRepository.getUserByNameAndCity("java", "bhavnagar");
		userByNameAndCity.forEach(c -> System.out.println(c));
	}

}
