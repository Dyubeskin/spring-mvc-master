package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import web.config.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

    @Controller
    public class  CarController {
        private final CarServiceImp carServiceImp;

        public CarController(CarServiceImp carServiceImp) {
            this.carServiceImp = carServiceImp;
        }

        @GetMapping(value = "/cars")
        public String printCars(@RequestParam (value = "count") int count, ModelMap model) {
            model.addAttribute("cars", carServiceImp.ListOfCars(count));
            return  "cars";
        }

    }
