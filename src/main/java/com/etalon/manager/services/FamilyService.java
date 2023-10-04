package com.etalon.manager.services;

import com.etalon.manager.models.Family;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FamilyService {
    private List<Family> families = new ArrayList<>();
    private long ID = 0;

    {
        families.add(new Family(++ID, "firstFamily", "this is first example"));
        families.add(new Family(++ID, "secondFamily", "this is second example"));
    }

    public List<Family> list() {return families;}

    public void saveFamily(Family family) {
        family.setId(++ID);
        families.add(family);
    }

    public void deleteFamily (Long id) {
        families.removeIf(family -> family.getId().equals(id));
    }

    public Family getFamilyById(Long id) {
        for (Family family : families) {
            if (family.getId().equals(id)) return family;
        }
        return null;
    }
}
