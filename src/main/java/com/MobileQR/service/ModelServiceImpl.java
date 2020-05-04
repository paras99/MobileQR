package com.MobileQR.service;

import com.MobileQR.model.MobileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ModelServiceImpl implements ModelService{


    @Override
    public MobileModel getProduct(int pid) {
        List<MobileModel> mylist = new ArrayList();
        mylist.add(new MobileModel(1, "Bowl", 20));
        mylist.add(new MobileModel(2, "glasses", 10));
        mylist.add(new MobileModel(3, "books", 40));
        mylist.add(new MobileModel(4, "Laptops", 50));
        mylist.add(new MobileModel(5, "Rings", 5));
        mylist.add(new MobileModel(6, "bottles", 0));

        for (MobileModel mob : mylist) {
            if (mob.getPid() == pid &&  mob.getPqty() !=0) {
                return mob;
            }


        }
        return null;
    }



}
