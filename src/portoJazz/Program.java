package portoJazz;

import java.util.HashSet;

import portoJazz.Cities.Lisboa;

public class Program {
    private static Float money;
    private static HashSet<Ticket> ticketsSold;
    private static Agency agency1;
    private static Agency agency2;
    private static Agency website;
    private static CPAgency CP;
    
    public Program(){
        setMoney(0f);
        ticketsSold = new HashSet<>();
        agency1 = new Agency("agency1");
        agency2 = new Agency("agency2");
        website = new Agency("website");
        CP = new CPAgency();
    }

    public static void main(String[] args){
        new Program();
        addTicketSold(agency1.sellTicket());
        addTicketSold(CP.sellSpecialTicket(new Lisboa()));
        addTicketSold(CP.sellTicket());
        addTicketSold(agency2.sellTicket());
        addTicketSold(website.sellTicket());
    }

    /**
     * Add a ticket that was sold to the system
     */
    public static void addTicketSold(Ticket ticket){
        ticketsSold.add(ticket);
        increaseMoney(ticket.getPrice());
        System.out.println(Program.getSellMessageInEnglish(ticket));
    }

    public static boolean wasTicketSold(Ticket ticket){
        return ticketsSold.contains(ticket);
    }

	/**
	 * @return the money
	 */
	public static Float getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public static void setMoney(Float money) {
		Program.money = money;
    }

    public static void increaseMoney(Float increment){
        if (increment > 0){
            Program.money += increment;
        }
    }
    
    public static String getSellMessageInPortuguese(Ticket ticket){
		return "Parabéns! Comprou o bilhete " + ticket.getHash() + "na bilheteira " + ticket.getAgencyName();
	}
	public static String getSellMessageInSpanish(Ticket ticket){
		return "Felicitaciones! Compró el billete " + ticket.getHash() + "en la taquilla " + ticket.getAgencyName();
	}
	public static String getSellMessageInEnglish(Ticket ticket){
		return "Congrats! Ticket " + ticket.getHash() + " was bought on " + ticket.getAgencyName();
	}
}