package kk.it.array.datastructure.arrayproblems;

public class DVD {
	private String filmName;
	private int releasedYear;
	private String actorName;

	public DVD(String filmName, int releasedYear, String actorName) {
		this.filmName = filmName;
		this.releasedYear = releasedYear;
		this.actorName = actorName;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	@Override
	public String toString() {
		return "DVD{" +
				"filmName='" + filmName + '\'' +
				", releasedYear=" + releasedYear +
				", actorName='" + actorName + '\'' +
				'}';
	}
}
