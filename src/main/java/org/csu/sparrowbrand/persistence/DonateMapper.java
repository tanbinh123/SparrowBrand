package org.csu.sparrowbrand.persistence;

import org.csu.sparrowbrand.domain.Donate;

import java.util.List;

public interface DonateMapper {

    //List<Donate> getDonateListByDonateId(String categoryId);

    List<Donate> getDonateListByUsername(String username);

    //Donate getDonateByUsername(String username);
}
