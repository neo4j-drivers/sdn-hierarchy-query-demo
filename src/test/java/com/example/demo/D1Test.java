package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@Import(ContainerConfig.class)
@ActiveProfiles("d1")
public class D1Test {

	@Test
	void contextBoots() {
	}
}
