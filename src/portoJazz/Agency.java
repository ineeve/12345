package portoJazz;

/**
 * Represents a Ticket Office
 */
public class Agency {
    private String name;
    private Float baseTicketPrice;
    
    public Agency(String name){
        setName(name);
        setBaseTicketPrice(8.5f);
    }

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
    }
    
    /**
     * Sell a ticket to the festival
     */
    public Ticket sellTicket(){
        return new Ticket(getBaseTicketPrice(),getName());
    }

	/**
	 * @return the baseTicketPrice
	 */
	public Float getBaseTicketPrice() {
		return baseTicketPrice;
	}

	/**
	 * @param baseTicketPrice the baseTicketPrice to set
	 */
	public void setBaseTicketPrice(Float baseTicketPrice) {
		this.baseTicketPrice = baseTicketPrice;
	}
}