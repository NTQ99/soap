package uet.soa.soap;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestSumController {

	@RequestMapping("/")
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

}