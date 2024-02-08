package com.gk.jinkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Calcul {
	
	@GetMapping("/oppose/{x}")
    public int opposeDeX(@PathVariable int x) {
        return -x;
    }
	
	
	 @GetMapping("/puissance2/{x}")
	    public int xPuissance2(@PathVariable int x) {
	        return x * x;
	    }

}
