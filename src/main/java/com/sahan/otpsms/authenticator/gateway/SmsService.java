package com.sahan.otpsms.authenticator.gateway;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public interface SmsService {
    void send(String phoneNumber, String message);
}
