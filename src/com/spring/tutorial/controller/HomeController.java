package com.spring.tutorial.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutorial.model.Employee;
import com.spring.tutorial.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class HomeController
{
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ModelAndView getEmployee(@PathVariable Integer id){
		ModelAndView mav =  new ModelAndView("home"); //name of jsp page to be displayed
		List<Employee> emp = employeeService.findById(id);
		mav.addObject("emp",emp);
		return mav;
	}
    /*//@GetMapping("/")
	@GetMapping(produces = {"application/json"})
    //public String homeInit(Locale locale, Model model) {
	//public ResponseEntity<String> homeInit(@RequestParam(required = false) String filter) {
	public String homeInit(@RequestParam(required = false) String filter) {
        //return new ResponseEntity<>("{\"Message\":\"Successful\"}", new HttpHeaders(), HttpStatus.OK);
		return "{\"Message\":\"Successful\"}";
    }*/
	
	/*@PostMapping(consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<String> postHandler(
			@RequestBody String input){
		return new ResponseEntity<>(input, new HttpHeaders(), HttpStatus.CREATED);
		
	}*/
}
