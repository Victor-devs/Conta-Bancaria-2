package com.banco3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cliente;
		String agencia;
		String conta;
		BigDecimal saldo = BigDecimal.valueOf(2000);
		BigDecimal depositar;
		BigDecimal sacar;
		BigDecimal valor = null;
		BigDecimal saque = null;
		char letra;

		System.out.println("Digite o nome do cliente: ");
		cliente = scan.next();
		System.out.println("Digite a agencia: ");
		agencia = scan.next();
		System.out.println("Digite a conta: ");
		conta = scan.next();
		System.out.println("Saldo da conta: " + saldo);

		System.out.println("Deseja fazer saque ou deposito? Digite S para saque ou D para deposito, "
				+ "digite qualquer outra letra para sair");
		letra = scan.next().charAt(0);

		if (letra == 'd' || letra == 'D') {

			System.out.println("Digite o valor a ser depositado: ");
			valor = scan.nextBigDecimal();
			saldo = saldo.add(valor);
		} else if (letra == 's' || letra == 'S') {
			System.out.println("Digite o valor que deseja sacar: ");
			valor = scan.nextBigDecimal();
			saldo = saldo.subtract(valor);
		} else {
			System.out.println("Operação encerrada! ");
		}

		System.out.println("Seu saldo agora é de R$ " + saldo + " reais");

	}
}
