package com.saber.jdbctemplate;

import com.saber.jdbctemplate.service.TestService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateApplicationTests {

  @Autowired
  private TestService testService;

  @Before
  public void setUp() {
    // 准备，清空user表
    testService.deleteAllUsers();
  }

  @Test
  public void test() throws Exception {
    // 插入5个用户
    testService.create("a", 1);
    testService.create("b", 2);
    testService.create("c", 3);
    testService.create("d", 4);
    testService.create("e", 5);
    // 查数据库，应该有5个用户
    Assert.assertEquals(5, testService.getAllUsers().intValue());
    // 删除两个用户
    testService.deleteByName("a");
    testService.deleteByName("e");
    // 查数据库，应该有5个用户
    Assert.assertEquals(3, testService.getAllUsers().intValue());
  }
}
