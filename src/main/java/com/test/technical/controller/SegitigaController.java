package com.test.technical.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegitigaController {

	Scanner scanner = new Scanner(System.in);
	int angka = scanner.nextInt();
	
		
	private int generateSegitiga (int angka) {
		
		for (int i = 0; angka<i; i++) {
			if (angka != 0) {
				System.out.print(angka);
				
				for (int j = 0; j<i; j++) {
					System.out.print("0");
				}
			} else {
				System.out.print("Tidak Boleh input 0");
			}
		
		}
		
		return angka;
	}
	
	private int validateBilGanjil (int angka) {
		
			if (angka%2 != 0) {
				System.out.println("angka bukan ganjil");
			}else {
				System.out.println("angka ganjil");
			}
		
		return angka;
	}
	
	private int validateBilPrima (int angka) {
		
		int hitungPrima = (int) (Math.pow(2, angka)) - 1; 
		
		if (String.valueOf(angka).equals(String.valueOf(hitungPrima))) {
			System.out.println("Bilangan Prima");
		}else {
			System.out.println("Bukan Bilangan Prima");
		}
		
		
		return angka;
	}
}
