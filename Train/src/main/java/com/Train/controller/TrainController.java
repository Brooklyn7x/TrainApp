package com.Train.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Train.Entity.eTrain;
import com.Train.Service.TrainServiceInterface;



@RestController
public class TrainController {

    @Autowired
    private TrainServiceInterface ti;

    @PostMapping("createTrainInfo")
    public String creatTrainData(@RequestBody eTrain et) {
		System.out.println(et.getName() + et.getArrivalTime()+ et.getDestTime()+et.getTrainNo()+et.getSourceSt());;
		ti.createTrainService(et);
        return "1 row inserted";
    }

    @GetMapping("viewalltrain")
    public List<eTrain> viewallTrain() {
        return ti.viewallService();
    }

}
