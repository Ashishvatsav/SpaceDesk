package com.spacedesk.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spacedesk.model.Desk;
import com.spacedesk.repository.DeskRepository;

@RestController
@RequestMapping("/desks")
public class DeskController {

    @Autowired
    private DeskRepository deskRepository;

    @PostMapping
    public Desk createDesk(@RequestBody Desk desk) {
        return deskRepository.save(desk);
    }

    @GetMapping
    public List<Desk> getAllDesks() {
        return deskRepository.findAll();
    }
}
