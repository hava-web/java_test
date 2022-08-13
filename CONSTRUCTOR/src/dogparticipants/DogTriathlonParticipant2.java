package dogparticipants;

public class DogTriathlonParticipant2 
{
private final int num_events;
private static int totalCumulativeScrore = 0;
private String name;
private int obedienceScore;
private int comformationScrore;
private int agilityScore;
private int total;
private double avg;
private boolean doScoresAgree;
  public DogTriathlonParticipant2(String name, int numEnvent, int score1, int score2, int score3)
  {
	this.name = name;
	num_events = numEnvent;
	obedienceScore = score1;
	comformationScrore = score2;
	agilityScore = score3;
	if (num_events == 0) {
		avg = 0;
	}
	else {
		avg = total / num_events; 
	}
	int totalNot0 = 0;
	if (score1 != 0 ) {
		totalNot0 = + 1;
	}
	if (score2 != 0 ) {
		totalNot0 = + 1;
	}
	if (score3 != 0 ) {
		totalNot0 = + 1;
	}
	if (numEnvent == totalNot0) {
		doScoresAgree = true;
	}
	else {
		doScoresAgree = false;
	}
	if (doScoresAgree) {
		obedienceScore = score1;
		comformationScrore = score2;
		agilityScore = score3;
	}
	else {
		obedienceScore = 0;
		comformationScrore = 0;
		agilityScore = 0;
	}
  }
  public void display()
  {
	System.out.println("\nNotice! Number of events for"+ name +"does not agree with scores reported.");
	System.out.println(name + " participated in " + num_events + " envents and has averages score of "+ avg);
	System.out.println("" + name + " has a total of score of "+ total + " bring the total cumulative score to " + totalCumulativeScrore);
  }
}
