package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    byte tentativa = 3;
    
    for (byte i = 0; i <= tentativa; i++) {
      if (i == 3) {
        System.out.println("Não foi possível conectar.");
        break;
      }
      
      if (!conectou()) {
        System.out.println("Tentando conexão.");
      } else {
        System.out.println("Conectado!");
        break;
      }
    }
    
    
    
    
    
        
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
