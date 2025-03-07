package org.generation;

import java.util.Scanner; // Importe la clase Scanner 

/**
 * Este programa simula el juego de "piedra, papel o tijeras" entre dos jugadores.
 * Los jugadores introducen sus elecciones y el programa determina el ganador o si hay un empate.
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Falto System.in para ingresar datos

		String j1, j2; // Declarar 2 variables: j1 y j2

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Cambie 1, por dos
		/* Scanner s2 = new Scanner(); */ // No es necesario volver a declararla
		j2 = s.nextLine();

		if (j1.equals(j2)) { // Le quite el doble parentesis y oara comparar dos objetos se
								// utiliza .equals()
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) { // Lo mismo de .equals()
					g = 1;
				}
				break; // Faltaba break para switch

			case "papel":
				if (j2.equals("piedra")) { // Lo mismo de  .equals()
					g = 1;
				} // Fataba cerrar
				break; // Faltaba break para switch

			case "tijeras": // Tijeras en plural 
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}

			System.out.println("Gana el jugador " + g);

		}

		s.close(); // Faltaba cerrar el objeto Scanner

	}
}