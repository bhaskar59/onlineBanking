package com.onlineBanking.Controller;

import java.sql.Date;

import javax.servlet.annotation.WebServlet;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.onlineBanking.Dao.UserDao;
import com.onlineBanking.Service.UserService;
import com.onlineBanking.Service.Impl.UserServiceImpl;
import com.onlineBanking.entity.UserDetails;

@Controller
@Path("/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
		@POST
		@Path("/add")
		public Response addUser(
			@FormParam("username") String username,
			@FormParam("email_id") String email_id,
			@FormParam("password") String password) {
			
			/*ApplicationContext context =
			    	   new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});

			UserService userService = (UserService)context.getBean("userService");*/
			
			UserDetails userDetails =new UserDetails();
			userDetails.setUsername(username);
			userDetails.setEmailId(email_id);
			userDetails.setPassword(password);
			userDetails.setCreatedBy(1);
			userDetails.setCreatedDate(new Date(0));
			userDetails.setLastModifiedBy(1);
			userDetails.setLastModifiedDate(new Date(0));
			
			
			userService.insertUserDetails(userDetails);

			return Response.status(200)
				.entity("addUser is called, name : " + username + ", email_id : " + email_id)
				.build();

		}

}
