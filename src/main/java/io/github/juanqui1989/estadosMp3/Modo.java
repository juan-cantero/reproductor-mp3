package io.github.juanqui1989.estadosMp3;

public interface Modo {
  String reproducir(int numeroCancion);
  String pausar();
  void parar();
}
