package org.csu.sparrowbrand.service.impl;

import org.csu.sparrowbrand.domain.Donate;
import org.csu.sparrowbrand.persistence.DonateMapper;
import org.csu.sparrowbrand.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateServiceImpl implements DonateService {

    @Autowired
    private DonateMapper donateMapper;

    @Override
    public List<Donate> getDonateListByUsername(String username) {
        return donateMapper.getDonateListByUsername(username);
    }

    //@Override
    //public Donate getDonateByUsername(String username) {
    //    return donateMapper.getDonateByUsername(username);
    //}
}
