package org.csu.sparrowbrand.service;

import org.csu.sparrowbrand.domain.Donate;

import java.util.List;

public interface DonateService {

    List<Donate> getDonateListByUsername(String username);

    //Donate getDonateByUsername(String username);
}
