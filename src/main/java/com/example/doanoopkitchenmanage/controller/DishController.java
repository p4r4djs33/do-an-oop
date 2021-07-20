package com.example.doanoopkitchenmanage.controller;


import com.example.doanoopkitchenmanage.model.Dish;
import com.example.doanoopkitchenmanage.service.dish.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DishController {
    @Autowired
    DishService dishService;


    @GetMapping("/dishes")
    public ModelAndView dishes(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/dishes/dishes");
        Page<Dish> listDish = dishService.findAll(pageable);
        modelAndView.addObject("dishes", listDish);
        return modelAndView;
    }

}
