package com.adu;

import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adu.service.UserService;

import com.adu.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class TestUserService {
  @Autowired
  private UserService userService;

  @Test
  public void hasMatchUser(){
    boolean b1 = userService.hasMatchUser("admin","admin");
    System.out.println(b1);
    boolean b2 = userService.hasMatchUser("admin","Hello");
    System.out.println(b2);
    assertTrue(b1);
    assertFalse(b2); 
  }
}
