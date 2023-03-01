package ado1;

import java.util.Scanner;

public class Ado{ 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vetor jogos;
    Vetor notas;

    System.out.print(
        "------------ SISTEMA DE RANQUEAMENTO DE JOGOS --------------------------------\nQuantos jogos voce quer ranquear?: ");

    int tamanho = 0;
    tamanho = Integer.parseInt(sc.nextLine());
    String nota;
    String jogo;
    jogos = new Vetor(tamanho);
    notas = new Vetor(tamanho);

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Jogo " + i + ": ");
      jogo = sc.nextLine();
      System.out.print("Nota: ");
      nota = sc.nextLine();
      try {
        jogos.adiciona(jogo);
        notas.adiciona(nota);
      } catch (Exception e) {
        e.printStackTrace();
      }

    }
    System.out.println("Jogos -> " + jogos.toString() + "\nNotas -> " + notas.toString());

  }
}