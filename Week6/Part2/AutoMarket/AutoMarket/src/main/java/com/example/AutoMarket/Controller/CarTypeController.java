package com.example.AutoMarket.Controller;

import com.example.AutoMarket.Entity.CarType;
import com.example.AutoMarket.Service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carType")
public class CarTypeController {

    @Autowired
    private CarTypeService carTypeService;

    @GetMapping
    public List<CarType> findAll(){
        return carTypeService.getAllCarType();
    }

    @PostMapping
    public ResponseEntity<String> add(@RequestBody CarType carType){
        return carTypeService.addCarType(carType);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return carTypeService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody CarType carType){
        return carTypeService.updateCarType(id, carType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        return carTypeService.deleteCarType(id);
    }
}