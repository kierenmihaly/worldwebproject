package spring.web.user;

/*import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;*/
import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.domain.User;


@Controller
@RequestMapping("/user/*")
public class UserController {

	//////////////////////////////////////////
	// Field
	/*
	 * @Autowired
	 * 
	 * @Qualifier("userService") private UserService userService;
	 */
	
	/*
	 * @Value("#{contextProperties['pageSize']}") int pageSize;
	 * 
	 * int page01;
	 * 
	 * @Value("#{contextProperties['page']?:10}") int page02;
	 */
	
	// Con
	public UserController() {
		System.out.println("TestCOntoroller default con call ");
		/*
		 * System.out.println("pageSize: "+pageSize);
		 * System.out.println("page01:"+page01); System.out.println("page02:"+page02);
		 */
	}

	//////////////////////////////////////
	
	@RequestMapping("testView")
	public ModelAndView testView() {
		return new ModelAndView("/test/testView.jsp");
	}
	
	
	/*
	 * @RequestMapping(value="xml/{value}",method=RequestMethod.GET) public
	 * ModelAndView abc ( @PathVariable String value ) {
	 * 
	 * System.out.println("value:"+value );
	 * System.out.println("pageSize: "+pageSize);
	 * System.out.println("page01:"+page01); System.out.println("page02:"+page02);
	 * System.out.println();
	 * 
	 * return new ModelAndView("/test/testView.jsp"); }
	 * ///////////////////////////////////////
	 * 
	 * @RequestMapping(value="json/{id}", method=RequestMethod.GET)
	 * 
	 * public ModelAndView def( @PathVariable String id) {
	 * 
	 * System.out.println("id:"+id ); System.out.println("pageSize: "+pageSize);
	 * System.out.println("page01:"+page01); System.out.println("page02:"+page02);
	 * System.out.println();
	 * 
	 * return new ModelAndView("/test/testView.jsp"); }
	 */

	//////////////////////////////////////////

	// ´Ü¼ø Navigation
	/*
	 * @RequestMapping(value = "/logonAction.do", method = RequestMethod.GET) public
	 * String logonAction() {
	 * 
	 * System.out.println("[LogonAction() method=RequestMethod.GET start.]");
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.setViewName("/logon.do");
	 * 
	 * System.out.println("[LogonAction() method=RequestMethod.GET end.]\n");
	 * 
	 * return "/logon.do"; }
	 */

	/*
	 * @RequestMapping(value="/{userId}", method = RequestMethod.POST) public
	 * ModelAndView getUser(@PathVariable String userId) { User user = new User();
	 * user.setUserId(userId); return new ModelAndView("/test/testView.jsp",
	 * "user",user); }
	 */

	@RequestMapping(value="getUser/{userId}", method = RequestMethod.GET)
	public ModelAndView getUser(@PathVariable String userId) {
		
		System.out.println();
		System.out.println(userId);
		User user = new User();
		user.setUserId(userId);
		return new ModelAndView("/test/testView.jsp","user", user);
	}

	////////////////

	@RequestMapping(value="getUser/{userId}", method = RequestMethod.POST)
	public ModelAndView getUser(@PathVariable String userId,
									@ModelAttribute("user")User user) {
		System.out.println();
		System.out.println(userId);
		System.out.println(user);
		user.setUserId(userId);
		
		return new ModelAndView("/test/testView.jsp");
	}


}// end of class