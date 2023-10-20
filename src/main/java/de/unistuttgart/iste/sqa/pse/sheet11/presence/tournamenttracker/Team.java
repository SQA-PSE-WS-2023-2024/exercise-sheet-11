/**
 * 
 */
package de.unistuttgart.iste.sqa.pse.sheet11.presence.tournamenttracker;

/**
 * Represents a sports team. 
 * 
 * @author andrevanhoorn
 *
 */
public class Team {
	private final String name;

	/**
	 * Creates a new team with the given name;
	 * 
	 * @param name
	 */
	public Team(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of this team.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	
}