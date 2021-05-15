package com.SpringValidationApi;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class UserController {

	 @RequestMapping("/hello")  
	    public String display(Model m)  
	    {  
	        m.addAttribute("user", new User());  
	        return "registration";  
	    }  
	    @RequestMapping("/hello1")  
	    public String submitForm( @Valid @ModelAttribute("user") User e, BindingResult br)  
	    {  
	        if(br.hasErrors())  
	        {  
	            return "registration";  
	        }  
	        else  
	        {  
	        return "final";  
	        }  
	    }  
	
}
