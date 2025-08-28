package com.esfe.cleanapp.domain.port.in;

/** Caso de uso: comprobar que la base de datos responde. */
public interface CheckDbHealthUseCase {
    boolean isHealthy();
}
