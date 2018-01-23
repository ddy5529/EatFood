package com.ddy.EatFood.Jpa;

import com.ddy.EatFood.Model.Entity.Administrator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class JpaTest {

//    @Autowired
//    private AdministratorRepository administratorRepository;

    @Test
    public void AdministratorRoleTest(){
        Administrator administrator =new Administrator();
        administrator.setAccount("ddy");
        administrator.setPassword("ddy");
        administrator.setUsername("ddy");

//        administratorRepository.findAll();
//        administratorRepository.save(administrator);
    }
}
