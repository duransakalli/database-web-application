package in.duransakalli.springmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.duransakalli.springmybatis.dao.EmployeeMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeMapper mapper;
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println(mapper.getAllEmployees());
		return "list-employees";
	}

}
