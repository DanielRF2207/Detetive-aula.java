package br.senac.detetive;

public class FormsDetetive {

	public static void main(String[] args) {
		System.out.println("Responda 'sim' ou 'não' para as seguintes perguntas:");
		System.out.println("Telefonou para a vítima?");
		boolean resposta1 = true;
		System.out.println("Esteve no local do crime?");
		boolean resposta2 = true;
		System.out.println("Mora perto da vítima?");
		boolean resposta3 = true;
		System.out.println("Devia para a vítima?");
		boolean resposta4 = true;
		System.out.println("Já trabalhou com a vítima?");
		boolean resposta5 = true;

		if (resposta1 && resposta2 && resposta3 && resposta4 && resposta5) {
			System.out.println("Você é o assassino!");
		} else if (resposta1 && resposta2) {
			System.out.println("Você é considerado suspeito.");
		} else if (resposta1 || resposta2 || resposta3 || resposta4 || resposta5) {
			System.out.println("Você é considerado cúmplice.");
		} else {
			System.out.println("Você é inocente.");
		}
	}
}
