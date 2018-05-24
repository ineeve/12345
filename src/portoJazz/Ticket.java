package portoJazz;

public class Ticket {

    /**
     * Price of the ticket
     */
    private Float price;

    /**
     * Ticket unique identifier
     */
	private String hash;

	/**
	 * Name of the agency that sold the ticket
	 */
	private String agencyName;

    public Ticket(Float price, String agencyName){
        setPrice(price);
		setHash(HashGenerator.generateHash());
		setAgencyName(agencyName);
    }

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
    }

	/**
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * @return the agencyName
	 */
	public String getAgencyName() {
		return agencyName;
	}

	/**
	 * @param agencyName the agencyName to set
	 */
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

}