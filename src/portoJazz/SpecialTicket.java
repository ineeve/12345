package portoJazz;

import portoJazz.Cities.City;

public class SpecialTicket extends Ticket{

    private City fromCity;

    public SpecialTicket(Float price, City from, String agencyName){
        super(price + from.getExtraPrice(), agencyName);
        setFromCity(from);
    }

	/**
	 * @return the fromCity
	 */
	public City getFromCity() {
		return fromCity;
	}

	/**
	 * @param fromCity the fromCity to set
	 */
	public void setFromCity(City fromCity) {
		this.fromCity = fromCity;
	}
}