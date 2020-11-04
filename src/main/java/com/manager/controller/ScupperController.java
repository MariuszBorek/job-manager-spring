package com.manager.controller;

import com.manager.model.Scupper;
import com.manager.service.ScupperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tools/scuppers")
@CrossOrigin("*")
public class ScupperController {

    private final ScupperService scupperService;

    public ScupperController(ScupperService scupperService) {
        this.scupperService = scupperService;
    }

    @GetMapping("/check")
    public Scupper countScuppers(@RequestParam final String roofArea,
                                 @RequestParam final String scupperSideX,
                                 @RequestParam final String scupperSideY,
                                 @RequestParam final String bottomScupperLevelOverRoof,
                                 @RequestParam final String waterLevel) {
        return scupperService.countScuppers(roofArea,
                scupperSideX,
                scupperSideY,
                bottomScupperLevelOverRoof,
                waterLevel);
    }

    @GetMapping
    public List<Scupper> findAll() {
        return scupperService.getScuppers();
    }

    @PostMapping
    public Scupper addScupper(@RequestBody final Scupper scupper) {
        return scupperService.addScupper(scupper);
    }

}
