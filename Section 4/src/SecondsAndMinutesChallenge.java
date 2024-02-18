//	03.26.2021
//	Challenge Completed Successfully On our Own

public class SecondsAndMinutesChallenge {

	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";			//example of global variable, 'final' meaning the value of var can't be changed
	
	public static void main(String[] args) {

		getDurationString(65, 45);
		getDurationString(3945);

	}//end main

	public static void getDurationString(int minutes, int seconds) {

		if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {						//validating parameters' value
			int totalSeconds = (minutes * 60) + seconds;							//getting total of seconds
			int remainingSeconds = totalSeconds % 60;								//calculating remaining seconds
			int totalMinutes = minutes + (seconds / 60);							//converting seconds to minutes for total minutes
			int remainingMinutes = totalMinutes % 60;								//calculating remaining minutes
			int totalHours = (totalSeconds) / 3600;									//calculating total hours using seconds
			//doing the bonus part of the challenge below for the output
			String myHours = totalHours + "h ";										//converting our hours to a String -> "#h" # - being the num of hours
			if(totalHours < 10) {
				myHours = "0" + myHours;											//adding the '0' in the front as described in the bonus
			}//end if
			String myMinutes = remainingMinutes + "m ";								//converting our minutes to a String -> "#m" # - being the num of minutes
			if(remainingMinutes < 10) {
				myMinutes = "0" + myMinutes;										//adding the '0' in the front as described in the bonus
			}//end if
			String mySeconds = remainingSeconds + "s ";								//converting our seconds to a String -> "#s" # - being the num of seconds
			if(remainingSeconds < 10) {
				mySeconds = "0" + mySeconds;										//adding the '0' in the front as described in the bonus
			}//end if
			System.out.println(myHours + myMinutes + mySeconds);					//output
		} else {
			System.out.println(INVALID_VALUE_MESSAGE);								//output if 'if' statement not true
		}//end if-else

	}//end getDurationString

	public static void getDurationString(int seconds) {

		if(seconds >= 0) {															//validating 'seconds' value
			int secondsToMinutes = seconds / 60;									//calculating minutes from 'seconds' value
			int remainginSeconds = seconds % 60;									//calculating remaining seconds
			getDurationString(secondsToMinutes, remainginSeconds);					//passing values into initial method for calculations/output
		} else {
			System.out.println(INVALID_VALUE_MESSAGE);								//output if 'if' statement resulted in not true
		}//end if-else

	}//end getDurationString

}//end class
