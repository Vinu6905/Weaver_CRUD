package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.Weaver_dao;
import Dto.Weaver;

@Component
public class Weaver_Service {

	@Autowired
	Weaver weaver;
	
	@Autowired
	Weaver_dao dao;
	
	@RequestMapping("loadweaver")
	public ModelAndView loadweaver(){
		ModelAndView andView=new ModelAndView("Insertdata.jsp");
//		andView.setViewName("Insertdata.jsp");
		andView.addObject("Weaver" , weaver);
		return andView;	
	}
	
	
	@PostMapping("saveweaver")
	public ModelAndView saveweaver(@ModelAttribute Weaver weaver){
		
		dao.save(weaver);
		
		ModelAndView andView=new ModelAndView("Home.jsp");
		andView.addObject("msg" ,"Data Added Sucessfully");
		return andView;
	}
	
	
	
	@GetMapping("fetchall")
	public ModelAndView fetch() {
		ModelAndView andView=new ModelAndView("Result.jsp");
//		andView.addObject("list" ,dao.fetch());
		 List<Weaver>list=dao.fetch();
		 if(list.isEmpty()){
			 andView.addObject("msg" ,"Data Not Found Please Insert The Data");
			 andView.addObject("Homee.jsp");
		 }
		 else{
			 andView.addObject("list" , list);
			 andView.addObject("Result.jsp");
		 }
		return andView;
	}

	
	public ModelAndView delete(int id) {
		ModelAndView andView=new ModelAndView("Result.jsp");
		dao.delete(id);
		List<Weaver>list=dao.fetch();
		if(list.isEmpty()){
			andView.addObject("msg" , "Data Not Found");
			andView.addObject("Home.jsp");
		}
		else{
			andView.addObject("list", list);
			andView.addObject("msg" ,"Data Deleted Successfully");
		}
		return andView;
	}

	public ModelAndView editweaver(int id) {
		ModelAndView andView=new ModelAndView("Edit.jsp");
		andView.addObject("weaver" ,dao.find(id));
		return andView;
	}

	public ModelAndView updateweaver(Weaver weaver) {
		dao.update(weaver);
		ModelAndView andView=new ModelAndView("Home.jsp");
		andView.addObject("list" ,dao.fetch());
		andView.addObject("msg" , "Date Updated Successfully");	
		return andView;
	}

	
}
