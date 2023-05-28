package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Dao.Weaver_dao;
import Dto.Weaver;
import service.Weaver_Service;

@Controller
public class Weaver_controller {

	@Autowired
	Weaver weaver;
	
	@Autowired
	Weaver_dao dao;
	
	@Autowired
	Weaver_Service service;
	
	@RequestMapping("loadweaver")
	public ModelAndView loadweaver(){
		return service.loadweaver();
	}
	@PostMapping("saveweaver")
	public ModelAndView saveweaver( @ModelAttribute Weaver weaver){

		return service.saveweaver(weaver);
	}
	
	@GetMapping("fetchall")
	public ModelAndView fetch(){
		return service.fetch();
	}
	
	@GetMapping("delete")
	public ModelAndView delete(@RequestParam int id){
		return service.delete(id);
	}
	
	@GetMapping("edit")
	public ModelAndView editweaver(@RequestParam int id){
		return service.editweaver(id);
	}
	
	@PostMapping("updateweaver")
	public ModelAndView updateweaver(@ModelAttribute Weaver weaver){
		ModelAndView andView=new ModelAndView("Edit.jsp");
		return service.updateweaver(weaver);
	}
}

