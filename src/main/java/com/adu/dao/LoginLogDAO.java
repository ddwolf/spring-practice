package com.adu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.adu.LoginLog;
@Repository
public class LoginLogDAO{
  
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void insertLoginLog(LoginLog loginLog) throws Exception{
    String sql = "insert into t_login_log(user_id, ip, login_datetime) values (?, ?, ?)";
    Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
    jdbcTemplate.update(sql, args);
  }
}
