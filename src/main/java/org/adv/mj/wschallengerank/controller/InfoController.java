package org.adv.mj.wschallengerank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
@CrossOrigin(origins = "**")
public class InfoController {

    @Value("${build.version}")
    String version;

    @GetMapping
    public String getVersion() {
        return version;
    }
}
