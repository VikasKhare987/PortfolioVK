package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        // You can customize these details
        model.addAttribute("name", "Vikas Arvind Khare");
        model.addAttribute("title", "Senior Software Engineer");
        model.addAttribute("about", "This is Vikas Khare having 3+ years of overall experience and 2.5 years of experience as software engineer . I am currently working with LTIMindtree Mumbai.\r\n"
        		+ "I have 2+ years of experience in Core Java, J2EE , Hibernate, Spring, Spring Boot,\r\n"
        		+ "RestFul WebServices, GIT, JIRA, MySql DataBase. I'm a passionate developer who loves building web apps. ");
        model.addAttribute("projects", new String[]{"Agriculture Information Management System (AIMS) /r/n", "QAD technology stack transition /r/n", "HSBC Banking Dvelopment"});
        model.addAttribute("skills", new String[]{"Java Languages\r\n"
        		+ ":\r\n"
        		+ "Java\r\n"
        		+ "Framework Tools\r\n"
        		+ ":\r\n"
        		+ "Spring Framework\r\n"
        		+ "ORM Tool\r\n"
        		+ ":\r\n"
        		+ "Hibernate\r\n"
        		+ "Servers\r\n"
        		+ ":\r\n"
        		+ "Tomcat\r\n"
        		+ "IDE & Tools\r\n"
        		+ ":\r\n"
        		+ "Eclipse, Maven\r\n"
        		+ "Web design\r\n"
        		+ ":\r\n"
        		+ "HTML, XML, JavaScript\r\n"
        		+ "Database\r\n"
        		+ ":\r\n"
        		+ "MySql\r\n"
        		+ "Operating System\r\n"
        		+ ":\r\n"
        		+ "Windows Family", });
        model.addAttribute("email", "kharevikas987@gmail.com");

        return "index";
    }
}
