package com.geluxe.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numeros) {

		int numerosLength = numeros.length;
		int numAux = 0;

		for (int i = 0; i < numerosLength; i++) {
			for (int j = 1; j < (numerosLength - i); j++) {
				if (numeros[j - 1] > numeros[j]) {
					numAux = numeros[j - 1];
					numeros[j - 1] = numeros[j];
					numeros[j] = numAux;

				}
			}
		}

		return numeros;
	}
}
