package com.sahan.otpsms.authenticator.gateway;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Sahan Nimesha on 2022 - Jan
 * In IntelliJ IDEA
 */
public class SmsServiceFactory {


        private static final Logger LOG = Logger.getLogger(String.valueOf(SmsServiceFactory.class));

        public static SmsService get(Map<String, String> config) {
            if (Boolean.parseBoolean(config.getOrDefault("simulation", "false"))) {
                return (phoneNumber, message) ->
                        LOG.warning(String.format("***** SIMULATION MODE ***** Would send SMS to %s with text: %s", phoneNumber, message));
            } else {
                return new AwsSmsService(config);
            }
        }

    }

