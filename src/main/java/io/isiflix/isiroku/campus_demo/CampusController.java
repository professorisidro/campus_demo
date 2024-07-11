package io.isiflix.isiroku.campus_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CampusController {

	@GetMapping("/campus")
	public String sayHelloCampusParty() {
		return "Boa Tarde Campus Pareeeeeeeeee!!! oooooOOOOOOOOOooooOOOOOo ";
	}
}
