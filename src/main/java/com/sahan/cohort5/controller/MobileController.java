package com.sahan.cohort5.controller;

import com.sahan.cohort5.model.Mobile;
import com.sahan.cohort5.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @GetMapping
    public List<Mobile> getAllItems(){
        return mobileService.getAll();
    }

    @GetMapping("/{id}")
    public Object getItem(@PathVariable("id") int id){
        if (mobileService.getItem(id) != null){
            return mobileService.getItem(id);
        } else {
            Map<String,String> msg = new HashMap<>();
            msg.put("ERROR", "Invalid ID");
            return msg;
        }
    }

    @PostMapping
    public Map<String,String> addItem(@RequestBody Mobile mobile){
        Map<String,String> msg = new HashMap<>();
         if(mobileService.addItem(mobile)){
             msg.put("MESSAGE", "SUCCESSFUL");
         } else {
             msg.put("MESSAGE", "Invalid data");
         }
         return msg;
    }

}
