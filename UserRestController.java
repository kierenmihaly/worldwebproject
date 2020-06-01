package com.model2.mvc.web.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model2.mvc.common.Page;
import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.User;
import com.model2.mvc.service.user.UserService;

//과거엔 rest가 없었는데 common-servlet에서 mvc.annotation-driven으로 캡슐화를 
//해버려서 rest가 따로 있는거 현업에는 아직 rest가 없는 곳도 있지만 rest있는게 최신임 
//==> 회원관리 RestController
@RestController
@RequestMapping("/user/*")
public class UserRestController {
	
	///Field
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	//setter Method 구현 않음
		
	public UserRestController(){
		System.out.println(this.getClass());
	}
	
	@RequestMapping( value="json/getUser/{userId}", method=RequestMethod.GET )
	public User getUser( @PathVariable String userId ) throws Exception{
		
		System.out.println("/user/json/getUser : GET");
		
		//Business Logic
		return userService.getUser(userId);
	}

	@RequestMapping( value="json/login", method=RequestMethod.POST )
	public User login(	@RequestBody User user,
									HttpSession session ) throws Exception{
	
		System.out.println("/user/json/login : POST");
		//Business Logic
		System.out.println("::"+user);
		User dbUser=userService.getUser(user.getUserId());
		
		if( user.getPassword().equals(dbUser.getPassword())){
			session.setAttribute("user", dbUser);
		}
		
		return dbUser;
	}
	
	@RequestMapping( value="json/addUser", method=RequestMethod.POST)
	public Map <String,Object> addUser( @RequestBody User user)
								throws Exception{
		
		Map <String, Object> map = new HashMap<String, Object>();
		String message = "환영합니다 "+user.getUserName()+"님!";
		if(userService.addUser(user)==0){
			message = "잘못입력 했습니다 ";
			map.put("message", message);
		
		return map;
		}
	}
		
	@RequestMapping( value = "json/updateUser", method=RequestMethod.POST)
	public User updateUser(	@RequestBody User user) throws Exception{
		
		userService.updateUser(user);
		
		return userService.getUser(user.getUserId());
	}
	
	
	@RequestMapping( value = "json/checkDuplication", method=RequestMethod.POST)
	public Map<String, Object> checkDuplication (@RequestBody User user) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", userService.checkDuplication(user.getUserId()));
		map.put("userId", user.getUserId());
		
		return map;
		
	}
	
	@RequestMapping( value = "json/checkDuplication", method=RequestMethod.POST)
	public User listUser ( @RequestBody User user) throws Exception {
		
		userService.listUser(user);
		
		return userService.getUser(user.getUserId());
	}
	
}