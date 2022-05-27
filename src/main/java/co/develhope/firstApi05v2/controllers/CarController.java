package co.develhope.firstApi05v2.controllers;

import co.develhope.firstApi05v2.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("")
    public String getCar(){
        return new CarDTO("Nissan","Skyline", 450000.00).toString();
    }

    @PostMapping("")
    public void postCar(@Valid @RequestBody CarDTO car, HttpServletResponse response){
        System.out.println("Posted car: " + car.toString());
        response.setStatus(201);
    }
}
