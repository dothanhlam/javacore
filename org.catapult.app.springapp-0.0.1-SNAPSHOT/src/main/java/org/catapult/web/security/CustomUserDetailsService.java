package org.catapult.web.security;

import java.util.ArrayList;
import java.util.List;

import org.catapult.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = getUserDetail(username);
		System.out.println(username);
		org.springframework.security.core.userdetails.User userDetail = new org.springframework.security.core.userdetails.User(
				user.getUsername(), user.getPassword(), true, true, true, true, getAuthorities(user.getRole()));
		return userDetail;
	}

	public List<GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		if (role.intValue() == 1) {
			authList.add(new SimpleGrantedAuthority("user"));
			authList.add(new SimpleGrantedAuthority("admin"));
		} else if (role.intValue() == 2) {
			authList.add(new SimpleGrantedAuthority("user"));
		}
		return authList;
	}

	public User getUserDetail(String username) {
		if (!mongoTemplate.collectionExists(User.class)) {
			mongoTemplate.createCollection(User.class);
			User admin = new User();
			admin.email = "admin@testdomain.com";
			admin.username = "admin";
			admin.password = "4efe081594ce25ee4efd9f7067f7f678a347bccf2de201f3adf2a3eb544850b465b4e51cdc3fcdde";
			admin.firstName = "Lam";
			admin.lastName = "Do";
			admin.role = 1;
			mongoTemplate.insert(admin);
		}

		MongoOperations mongoOperation = (MongoOperations) mongoTemplate;
		User user = mongoOperation.findOne(new Query(Criteria.where("username")
				.is(username)), User.class);
		System.out.println(user.toString());
		return user;
	}
}
