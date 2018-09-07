package coid.bca.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/hello")
	public String getAll() {
		System.out.println(jdbcTemplate.queryForObject(
				"SELECT COUNT(*) FROM user", Long.class));
		return "login";
	}
}
