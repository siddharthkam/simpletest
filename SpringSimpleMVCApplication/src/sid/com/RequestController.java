package sid.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestController 
{
	@RequestMapping("/add")
	public ModelAndView methodadd(@RequestParam("t1")  int i,@RequestParam("t2") int j)
	{
		System.out.println("hiii one");
		
		ModelAndView mv=new ModelAndView();
		
		int result=i+j;
		mv.addObject("result",result);
		mv.setViewName("welcome");
		return mv;

	}
	
	@RequestMapping("/login")
	public String Loginpage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logincheck")
	public ModelAndView logincheckadd(@RequestParam("username") String username,@RequestParam("userpass") String pass)
	{
		ModelAndView vm=new ModelAndView();
		if(username.equals("sid")   && pass.equals("sid") )
		{
			vm.addObject("result", "Welcome to here");
			vm.setViewName("student");
		}
		else
		{
			vm.addObject("result", "Error while login");
			vm.setViewName("welcome");

		}
		return vm;
	}
	
	
}
