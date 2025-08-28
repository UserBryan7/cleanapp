package com.esfe.cleanapp.domain.port.out;

/** Puerto de salida: operación mínima de 'ping' (SELECT 1). */
public interface SqlHealthPort {
    boolean ping() throws Exception;
}

