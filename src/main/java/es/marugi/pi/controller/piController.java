package es.marugi.pi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class piController {

@GetMapping("/pi")
public String hello(@RequestParam(value = "decimals", defaultValue = "5") Integer decimals) {
    
    String piStr = Double.toString(Math.PI) ;
    return String.format("pi:%s", piStr);

}
    
}
