package com.redbee.mssellspractica.application.port.out;

import com.redbee.mssellspractica.domain.Seed;

import java.util.UUID;

public interface NotificationRepository {

    void notify(Seed seed, UUID notificationId);
}
