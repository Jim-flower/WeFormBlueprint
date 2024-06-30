package org.cores.Materiekern.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/m-core/")
public class SpectatorController {

    @GetMapping("/feedback")
    public String feedback(@RequestParam String collection){

        return collection;
    }
}
