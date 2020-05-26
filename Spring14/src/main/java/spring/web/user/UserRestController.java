package spring.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.domain.User;

@RestController
	@RequestMapping("/user/*")
	public class UserRestController {
		//Field
		//con
		public UserRestController() {
			System.out.println("::UserRestCOntroller default Con call");
		}
		
		@RequestMapping(value="json/{value}", method=RequestMethod.GET)
		public Map getUser( @PathVariable String value,
								@RequestParam("name") String name,
								@RequestParam("age") int age) throws Exception{
			System.out.println();
			System.out.println(value);
			System.out.println(name);
			System.out.println(age);
			
			User user = new User();
			user.setUserId("AAA");
			user.setUserName("BBB");
			user.setAge(100);
			System.out.println(user);
			
			Map map = new HashMap();
			map.put("user", user);
			map.put("message","ok");
			
			return map;
								
	}
	
	
		@RequestMapping(value="json/get/User/{value}", method=RequestMethod.POST)
		
			public Map getUser( @PathVariable String value,
									@RequestBody User user) throws Exception{
				System.out.println();
				System.out.println("[FROM Client data]");
				System.out.println(value);
				System.out.println("1:"+user);
				
				System.out.println("[ToCLient Data]");
				User returnuser = new User();
				returnuser.setUserId("AAA");
				returnuser.setUserName("BBB");
				System.out.println("2:"+returnuser);
				
				Map map = new HashMap();
				map.put("user", user);
				map.put("message","ok");
				
				return map;
									
		}
	
}
