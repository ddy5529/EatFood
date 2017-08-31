package com.ddy.EatFood;

import com.ddy.EatFood.Controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class EatFoodApplicationTests {

	/*
	* 使用MockServletContext来构建一个空的WebApplicationContext，这样我们创建的HelloController就可以在@Before函数中创建并传递到MockMvcBuilders.standaloneSetup（）函数中。
	* @author :翟永超
	* */
	private MockMvc mvc;
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void getHello() throws Exception {
		/*
		* 在这个方法体内是比较拦截下的‘/say2’请求返回的内容是否是"Hello World"
		* */
		mvc.perform(MockMvcRequestBuilders.get("/say2").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello World")));
	}

	@Test
	public void contextLoads() {
	}

}
