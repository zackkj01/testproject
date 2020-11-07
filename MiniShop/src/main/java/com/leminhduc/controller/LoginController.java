package com.leminhduc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 

 
@Controller
public class LoginController {
    private static final Logger logger = Logger.getLogger(LoginController.class.getName());
 
    @Autowired
    UserService userService;
 
    /**
     * show login
     * 
     * @author realtut
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        logger.info("Request Login.");
        ModelAndView view = new ModelAndView("login");
        Users loginBean = new Users();
        view.addObject("loginBean", loginBean);
        logger.info("Open login page.");
        return view;
    }
 
    /**
     * execute login
     * 
     * @author realtut
     * @param request
     * @param response
     * @param loginBean
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("loginBean") Users loginBean) {
        ModelAndView view = null;
        if (userService.isUsers(loginBean.getUsername(), loginBean.getPassword())) {
            request.setAttribute("loggedInUser", loginBean.getUsername());
            view = new ModelAndView("welcome");
        } else {
            request.setAttribute("message", "Invalid ussename or password!");
            view = new ModelAndView("login");
        }
        return view;
    }
}
