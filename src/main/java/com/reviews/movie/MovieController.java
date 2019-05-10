package com.reviews.movie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	
	@RequestMapping("/movienames")
	public String printMovieName() {
		return "Avengers: Endgame";
	}
}
