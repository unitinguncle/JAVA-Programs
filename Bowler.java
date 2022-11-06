package day04;

public class Bowler {

	private String name;
	private int wickets;
	private int matches;
	private int balls_bowled;
	private int runs_conceded;
	
	public Bowler() {
		this.name = "";
		this.wickets = 0;
		this.matches = 0;
		this.balls_bowled = 0;
		this.runs_conceded = 0;
	}

	public Bowler(String name, int wickets, int matches, int balls_bowled,
			int runs_conceded) {
		this.name = name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	}
	
	public boolean checkInput(){
		if(wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0){
			System.out.println("Error");
			return false;
		}
		else if(matches == 0 && (balls_bowled > 0 || runs_conceded > 0)){
			System.out.println("Error");
			return false;
		}
		else 
			return true;
	}
	
	public void computeBowlingAverage(){
		if(checkInput()){
			double avg = (double)runs_conceded / (double)wickets;
			System.out.println("Name: " + name);
			System.out.println("bowling_avg=" + avg);
		}
	}
	
	public void showStatistics(){
		if(checkInput()){
			System.out.println("name = \"" + name + "\",");
			System.out.println("wickets = " + wickets + ",");
			System.out.println("matches = " + matches + ",");
			System.out.println("balls_bowled = " + balls_bowled + ",");
			System.out.println("runs_conceded " + runs_conceded);
		}
	}
	
	public void computeStrikeRate(){
		if(checkInput()){
			double strike_rate = (double)runs_conceded / (double)balls_bowled;
			System.out.println("Name: " + name);
			System.out.println("Strike_rate=" + strike_rate);
		}
	}

}

package day04;

public class Testing {

	
	public static void main(String[] args) {
		Bowler b1 = new Bowler("Sachin", 10, 5, 750, 463);
		b1.computeBowlingAverage();
		System.out.println();
		b1.computeStrikeRate();
		System.out.println();
		b1.showStatistics();
	}

}

