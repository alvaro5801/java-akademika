package com.coda_fofos.java_akademika;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaAkademikaApplicationTests {

	@Test
	void contextLoads() {
	}

	// Testa o método principal da aplicação
	@Test
	void applicationMain() {
		JavaAkademikaApplication.main(new String[] {});
	}

	// Ver se endpoint protegido retorna 401 Unauthorized sem autenticação
	@Test
	void shouldReturnUnauthorizedWhenNotAuthenticated() throws Exception {
		// Faz GET para um endpoint qualquer que não seja /auth/**
		mockMvc.perform(get("/api/disciplinas"))
				.andExpect(status().isUnauthorized());
	}

}
