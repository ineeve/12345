package portoJazz;

import portoJazz.Cities.City;

/**
 * Comboios de Portugal Agency
 */
public class CPAgency extends Agency{

    public CPAgency(){
        super("Comboios de Portugal");
    }

    public Ticket sellSpecialTicket(City city){
        return new SpecialTicket(getBaseTicketPrice(), city, getName());
    }
}