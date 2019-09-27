package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.User;
import edu.hubu.learn.service.UserService;
import edu.hubu.learn.entity.Piano;
import edu.hubu.learn.service.PianoService;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private PianoService pianoService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/user")
    public ModelAndView user() {
        ModelAndView mav = new ModelAndView();
        User user = userService.getUser(1l);
        mav.addObject("user", user);
        mav.setViewName("user");
        return mav;
    }

    @RequestMapping("/piano")
    public ModelAndView piano() {
        ModelAndView mav = new ModelAndView();
        Piano piano = pianoService.getPiano(1l);
        mav.addObject("piano", piano);
        mav.setViewName("piano");
        return mav;
    }
}