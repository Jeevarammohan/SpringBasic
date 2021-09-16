package com.shrishti.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PropertySource("classpath:application.properties")
public class Trainer {
	private Integer trainerId;
	private String trainerName;

	public Integer getTrainerId() {
		return trainerId;
	}
	@Value("${course.trainerId}")
	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}
	@Value("${course.trainerName}")
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + "]";
	}

}
