package org.com.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employeeManagement/portal")
public class EmployeePortalController {

	@RequestMapping("/index")
	public void index() {
		
	}
}
