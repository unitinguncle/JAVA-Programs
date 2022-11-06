package day05;


class Sports {
	public String getName() {
		return "Sports";
	}
	public String getNumberOfTeamMembers(){
		return "Each team has n players in sports";
	}
}

class Soccer extends Sports {
	@Override
	public String getName() {
		return "Badmintion";
	}
	@Override
	public String getNumberOfTeamMembers(){
		return "In "+ getName() + ", each team has 2 players.";
	}
}

public class OverridingTakeHome {

	public static void main(String[] args) {
		Soccer obj = new Soccer();
		System.out.println(obj.getNumberOfTeamMembers());
	}

}
