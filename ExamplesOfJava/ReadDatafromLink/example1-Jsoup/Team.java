package getdatafromURL.example1;

public class Team {


	private int position;
	private String name;
	private int totalMatch;
	private int won;
	private int drawn;
	private int Lost;
	private int goalsFor;
	private int goalsAgainst;
	private int goalsDifference;
	private int points;
	public Team(int position, String name, int totalMatch, int won, int drawn, int lost, int goalsFor, int goalsAgainst,
			int goalsDifference,int points) {
		super();
		this.position = position;
		this.name = name;
		this.totalMatch = totalMatch;
		this.won = won;
		this.drawn = drawn;
		Lost = lost;
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
		this.goalsDifference = goalsDifference;
		this.points = points;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMatch() {
		return totalMatch;
	}
	public void setTotalMatch(int totalMatch) {
		this.totalMatch = totalMatch;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getDrawn() {
		return drawn;
	}
	public void setDrawn(int drawn) {
		this.drawn = drawn;
	}
	public int getLost() {
		return Lost;
	}
	public void setLost(int lost) {
		Lost = lost;
	}
	public int getGoalsFor() {
		return goalsFor;
	}
	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
	}
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst = goalsAgainst;
	}
	public int getGoalsDifference() {
		return goalsDifference;
	}
	public void setGoalsDifference(int goalsDifference) {
		this.goalsDifference = goalsDifference;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Team [position=" + position + ", name=" + name + ", totalMatch=" + totalMatch + ", won=" + won
				+ ", drawn=" + drawn + ", Lost=" + Lost + ", goalsFor=" + goalsFor + ", goalsAgainst=" + goalsAgainst
				+ ", goalsDifference=" + goalsDifference + ", points=" + points + "]";
	}



}
