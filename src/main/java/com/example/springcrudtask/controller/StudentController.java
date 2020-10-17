package com.example.springcrudtask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springcrudtask.model.Student;
import com.example.springcrudtask.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService objStudentService;

	@RequestMapping("/home")
	public String viewHomePage(Model model) {
		List<Student> listStudents = objStudentService.getAllStudentList();
		model.addAttribute("listStudents", listStudents);
		return "school";
	}

	@RequestMapping("/addstudent")
	public String addStudentPage(Model model) {
		Student objStudent = new Student();
		model.addAttribute("objStudent", objStudent);

		return "add_student";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public String saveNewStudent(@ModelAttribute("objStudent") Student objStudent) {
		objStudentService.createStudent(objStudent);

		return "redirect:/home";
	}

	@RequestMapping("/editstudent/{id}")
	public ModelAndView editStudentPage(@PathVariable(name = "id") int id) {
		ModelAndView objModelAndView = new ModelAndView("edit_student");
		Student objStudent = objStudentService.getStudentById(id);
		objModelAndView.addObject("objStudent", objStudent);

		return objModelAndView;
	}

	@RequestMapping("/deletestudent/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		objStudentService.deleteStudentById(id);
		return "redirect:/home";
	}
}
