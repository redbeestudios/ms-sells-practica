package com.redbee.mssellspractica.application.port.in;

import lombok.Builder;
import lombok.Value;
import com.redbee.mssellspractica.domain.Seed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface CreateSeedCommand {

    Seed createSeed(Command command);

    @Value
    @Builder
    class Command {
        BigDecimal amount;
        LocalDateTime date;
    }
}

