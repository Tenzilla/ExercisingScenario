public class ExercisingScenario{
	
	int reps;
	int sets;
	int weights;
	int daysInTheWeek;
	int weeksInTheMonth;


	public ExercisingScenario(int repsDone, int setsComplete, int poundsLifted, int days, int weeks) {
		reps = repsDone;
		sets = setsComplete;
		weights = poundsLifted;
		daysInTheWeek = days;
		weeksInTheMonth = weeks;
		
		System.out.println("I will be calculating how much many times I will have worked out by the end of the month!");

	}
	public int workoutCalculation() {
		int setsPlusOneTest = sets + 1; 
		return setsPlusOneTest;
	
	}
	
	public int totalAmount() {
		
		int weeklyAmount = sets * daysInTheWeek;
		
		int totalAmount = weeklyAmount * weeksInTheMonth;
		
		return totalAmount;
	}
	

public void reps(int repsInSet, int setsToComplete) {
		
	System.out.println("It's not much but I will be working out this much in reps and sets:");
		
		
	}
	   // WOW so by naming the method toString, I can return the object totalWorkout in main method!
	public String toString() {
		return "This is a calculation of how much I work out within a month if I follow my schedule.";
	}
	
	public String helloMeathead(int daysWorkedOut) {
		String youAMeathead = "You're a meathead";
		return youAMeathead;
		
	}
	
	public static void main(String[] args){
		
		ExercisingScenario totalWorkout = new ExercisingScenario(15, 3, 30, 6, 4);
		
		System.out.println("\n" + "I can do about " + totalWorkout.reps + " reps in " + 
		totalWorkout.sets + " sets right now.");
		
		int workoutSetsTest = totalWorkout.workoutCalculation();
		System.out.println("HERE IS THE TEST: " + workoutSetsTest);
		
		int totalWorkoutDone = totalWorkout.totalAmount();
		
		System.out.println("\n" + "By the end of the month, I will have done: " + totalWorkoutDone + " sets!");
		
		System.out.println(totalWorkout);
			//Here, I print the totalWorkout object which toString method has been done!
		
		
		String meatHead = totalWorkout.helloMeathead(7);
		System.out.println(meatHead);
		// I can also do System.out.println(totalWorkout.helloMeathead(7)); instead of the one above.
		//Like below:
		//System.out.println(totalWorkout.helloMeathead(7));
		
		if (totalWorkoutDone < 100){
			System.out.println("I'm not working out hard enough, I need to do more!!!");

		}

		else{

			System.out.println("Whoa nice! You're definitely gonna get a lot of gains!");

		}
    }
}