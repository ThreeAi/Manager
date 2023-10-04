package com.etalon.manager.contorllers;

import com.etalon.manager.models.Family;
import com.etalon.manager.services.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class FamiliesController {
    private final FamilyService familyService;

    @GetMapping("/")
    public String families(Model model) {
        model.addAttribute("families", familyService.list());
        return "families";
    }

    @GetMapping("/family/{id}")
    public String familyInfo(@PathVariable Long id, Model model) {
        model.addAttribute("family", familyService.getFamilyById(id));
        return "family_info";
    }
    @PostMapping("/family/create")
    public String createFamily(Family family){
        familyService.saveFamily(family);
        return "redirect:/";
    }

    @PostMapping("/family/delete/{id}")
    public String deleteFamily(@PathVariable Long id) {
        familyService.deleteFamily(id);
        return "redirect:/";
    }
}
