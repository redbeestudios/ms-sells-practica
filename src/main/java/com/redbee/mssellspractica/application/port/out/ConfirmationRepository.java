package com.redbee.mssellspractica.application.port.out;

import com.redbee.mssellspractica.domain.Seed;

import java.util.UUID;

public interface ConfirmationRepository {

    void save(Seed seed, UUID uuid);

    Seed findById(String id);
}
