package Lesson8;

public enum Months {

	January(31, Seasons.Winter), February(28, Seasons.Winter), March(31, Seasons.Spring), April(30, Seasons.Spring),
	May(31, Seasons.Spring), June(30, Seasons.Summer), July(31, Seasons.Summer), August(31, Seasons.Summer),
	September(30, Seasons.Autumn), October(31, Seasons.Autumn), November(30, Seasons.Autumn), December(31, Seasons.Winter);


	int NumberOfDays;
	Seasons seasons;
	
	Months(int NamberOfDays,Seasons seasons ){
		this.NumberOfDays=NamberOfDays;
		this.seasons=seasons;
	}

	public int getNumberOfDays() {
		return NumberOfDays;
	}

	public Seasons getSeasons() {
		return seasons;
	}


	
}
