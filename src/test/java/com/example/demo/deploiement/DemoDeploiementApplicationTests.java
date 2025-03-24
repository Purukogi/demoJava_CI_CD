package com.example.demo.deploiement;

import com.example.demo.deploiement.service.BanqueService;
import com.example.demo.deploiement.service.ServiceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoDeploiementApplicationTests {

	@Autowired
	BanqueService banqueService;

	@Test
	void contextLoads() {
	}

	@Test
	void rg12346(){
		//cas 789
		ServiceResponseDTO response789 = banqueService.debit(6000);
		assertEquals("789", response789.code);
		assertEquals("solde insufisant", response789.message);
		//cas 207
		ServiceResponseDTO response207 = banqueService.debit(1200);
		assertEquals("207", response207.code);
		assertEquals("prelevement effectue avec succes", response207.message);
	}

}
