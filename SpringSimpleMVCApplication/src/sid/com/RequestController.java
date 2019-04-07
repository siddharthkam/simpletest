package sid.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController 
{
	@RequestMapping("/add")
	public String methodadd()
	{
		System.out.println("hiii one");
		return "welcome.jsp";
	}
}
