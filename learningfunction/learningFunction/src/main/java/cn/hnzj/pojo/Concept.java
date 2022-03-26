package cn.hnzj.pojo;

public class Concept {
	private int id;
	private String number;

	/**
	 * Title: Description:
	 * 
	 * @param number
	 */
	public Concept(String number) {
		super();
		this.number = number;
	}

	/**
	 * Title: Description:
	 * 
	 * @param id
	 * @param number
	 */
	public Concept(int id, String number) {
		super();
		this.id = id;
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/*
	 * (non-Javadoc) Title: toString Description:
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IdentityCard [id=" + id + ", number=" + number + "]";
	}
}
