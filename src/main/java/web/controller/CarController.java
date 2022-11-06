package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDAO;
import web.models.Car;
import web.service.CarService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String getAllCars(@RequestParam(value = "count", required = false, defaultValue = "5") int size, Model model) {
        // получим всех тачки из ДАО и передадим на отображение в представление
        model.addAttribute("cars", carService.getCars(size));
        return "cars";
    }

    @GetMapping("/new")
    public String newCar(@ModelAttribute("car") Car car) {
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("car") Car car) {
        carService.save(car);
        return "redirect:/cars";
    }


}
