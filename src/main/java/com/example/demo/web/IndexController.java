package com.example.demo.web;

import java.util.List;
import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @Autowired
  private PersonService personService;

  @RequestMapping("/")
  public String showIndex(Model model) {
    List<Person> personList = personService.loadAll();

    model.addAttribute("personList", personList);

    return "index"; // return index.html Template
  }
}
