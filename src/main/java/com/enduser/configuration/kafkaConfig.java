package com.enduser.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.enduser.constatnt.AppConstants;

@Configuration
public class kafkaConfig {

	public static final Logger LOGGER = LoggerFactory.getLogger(kafkaConfig.class);

	@KafkaListener(topics = AppConstants.LOCATION_UPDATE, groupId = AppConstants.GROUP_ID)
	public void updateLocation(String value) {

		LOGGER.info(value);

	}

}
