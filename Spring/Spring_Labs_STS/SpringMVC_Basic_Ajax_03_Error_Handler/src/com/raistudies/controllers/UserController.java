package com.raistudies.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raistudies.domain.JsonResponse;
import com.raistudies.domain.User;

@Controller
public class UserController {
	private List<User> userList = new ArrayList<User>(); 
	
	@RequestMapping(value="/AddUser.htm",method=RequestMethod.GET)
	public String showForm(){
		return "AddUser";
	}
	
	@RequestMapping(value="/AddUser.htm",method=RequestMethod.POST)
	public @ResponseBody JsonResponse addUser(@ModelAttribute(value="user") User user, BindingResult result ){
		System.out.println(user.getName() + " / " + user.getEducation());
		JsonResponse res = new JsonResponse();
		ValidationUtils.rejectIfEmpty(result, "name", "Name can not be empty.");
		ValidationUtils.rejectIfEmpty(result, "education", "Educatioan not be empty");
		if(!result.hasErrors()){
			userList.add(user);
			res.setStatus("SUCCESS");
			res.setResult(userList);
		}else{
			
			res.setStatus("FAIL");
			res.setResult(result.getAllErrors());
		}
		//System.out.println(res);
		return res;
	}

}
