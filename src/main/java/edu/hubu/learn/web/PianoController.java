package edu.hubu.learn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import edu.hubu.learn.entity.Piano;
import edu.hubu.learn.service.PianoService;

@Controller
@RequestMapping("/piano")
public class PianoController {

   
    @Autowired
    private PianoService pianoService;
    @RequestMapping("/{id}")
    public ModelAndView piano(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Piano piano = pianoService.getPiano(id);
        mav.addObject("piano", piano);
        mav.setViewName("piano");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView piano() {
        ModelAndView mav = new ModelAndView();
        List<Piano> pianos = pianoService.getPianos();
        mav.addObject("pianos", pianos);
        mav.setViewName("pianos");
        return mav;
    }
    
@RequestMapping("/add")
public ModelAndView addPiano() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("piano_add");
    return mav;
}

@RequestMapping("/do_add")
public ModelAndView doAddPiano(Piano piano) {
    pianoService.addPiano(piano);
    ModelAndView mav = new ModelAndView("redirect:/piano/list");
    return mav;
}
}