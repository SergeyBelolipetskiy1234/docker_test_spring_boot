package com.example.dockerForRepository.controllers;


import com.example.dockerForRepository.model.Car;
import com.example.dockerForRepository.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> list = carService.getList();

        model.addAttribute("cars", carService.getOfCar(list, count));
        return "cars";
    }
}

