package com.sahan.cohort5.service;

import com.sahan.cohort5.dao.MobileRepository;
import com.sahan.cohort5.model.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.MonitorInfo;
import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepository mobileRepository;

    /**
     * Fetching all mobiles
     * @return List<Mobile>
     */
    public List<Mobile> getAll(){
        return mobileRepository.findAll();
    }

    /**
     * Fetch an item by ID
     * @param id
     * @return
     */
    public Mobile getItem(int id){
        if (mobileRepository.findById(id).isPresent()){
            return mobileRepository.findById(id).get();
        } else {
            return null;
        }
    }

    /**
     * Add an Item
     * @param mobile
     * @return
     */
    public boolean addItem(Mobile mobile){
        if (mobile != null) {
            mobileRepository.save(mobile);
            return true;
        } else {
            return false;
        }
    }


}
