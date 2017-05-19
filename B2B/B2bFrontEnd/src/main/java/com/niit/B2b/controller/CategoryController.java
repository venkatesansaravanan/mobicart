package com.niit.B2b.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.modeldao.Categorydao;
import com.niit.modeldto.Category;
import com.niit.modeldto.Product;
@Controller
public class CategoryController 
{
	@Autowired
	Categorydao categorydao;
	@RequestMapping("Category")
	public String showCategoryPage(Model m)
	{
		List<Category> list=categorydao.displayAll();
		m.addAttribute("categorylist",list);		
		return "Category";
	}
	@RequestMapping(value="CategoryAddition",method=RequestMethod.GET)
	public String addCategory(@RequestParam("categoryid") int categoryid,@RequestParam("categoryname") String categoryname,@RequestParam("categorydesc") String categorydesc,Model m)
	{	
		Category category=new Category();
		category.setCategoryid(categoryid);
		category.setCategoryname(categoryname);
		category.setCategorydesc(categorydesc);
		
		categorydao.addCategory(category);;
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("categorylist",list);
		
		return "Category";
	}
	
	
	
	@RequestMapping(value="/deleteCategory/{categoryid}",method=RequestMethod.GET)
	public String deleteCategory(@PathVariable("categoryid") int catid,Model m)
	{
		categorydao.deleteCategory(categoryid);
		List<Category> list=categorydao.displayAll();
		m.addAttribute("categorylist",list);
		return "Category";
	}
	@RequestMapping(value="/updateCategory/{categoryid}",method=RequestMethod.GET)
	public String readyUpdate(@PathVariable("categoryid")int categoryid,Model m)
	{
		Category category1=new Category();
		category1.setCatid(categoryid);
		Category category=categorydao.getCategoryById(categoryid);
		m.addAttribute(category);
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("categorylist",list);
		
		return "UpdateCategory";
	}
	
	@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
	public String updateCategory(@ModelAttribute("category") Category category,Model m)
	{
		categorydao.updateCategroy(category);
		
		Category category1 = new Category();
		m.addAttribute(category1);
		
		List<Category> list=categorydao.displayAll();
		m.addAttribute("categorylist",list);
		
		return "redirect:/Category";
	}
	
}
