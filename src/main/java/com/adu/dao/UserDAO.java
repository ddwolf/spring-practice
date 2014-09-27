package com.adu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.adu.User;
@Repository
public class UserDAO{

  @Autowired
  JdbcTemplate jdbcTemplate;

  public int getMatchCount(String userName, String password){
    String sql = "select count(*) from t_user where user_name=? and password=?";
    return jdbcTemplate.queryForInt(sql, new Object[]{userName, password});
  }

  public User findUserByUserName(final String userName) {
        String sql = "select * from t_user where user_name=?";
    final User user = new User();
    jdbcTemplate.query(sql, new Object[]{userName},
      new RowCallbackHandler(){
        public void processRow(ResultSet rs){
	  try{
	  final int userId = rs.getInt("user_id");
          final int credits = rs.getInt("credits");
          user.setUserId(userId);
	  user.setUserName(userName);
	  user.setCredits(credits);
	  } catch(SQLException e){
	    System.out.println(e.getMessage());
	  }
	}
      });
    return user;
  }

  public void updateLoginInfo(User user){
    String sql = "update t_user set last_visit=? , last_ip=? , credits = ? where user_id=?";
    jdbcTemplate.update(sql, new Object[]{user.getLastVisit(), user.getLastIp(), user.getCredits(), user.getUserId()});
  }
}
