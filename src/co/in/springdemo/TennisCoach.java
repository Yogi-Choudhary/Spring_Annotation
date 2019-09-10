package co.in.springdemo;

import org.springframework.stereotype.Component;

@Component("thatsillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

}
