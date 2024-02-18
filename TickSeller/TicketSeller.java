package edu.sbcc.cs105;

public class TicketSeller {
	private final int MAXIMUM_TICKET_ALLOWED = 4;

	public final static int TOO_MANY_TICKETS_REQUESTED = -1;

	private int totalTicket;

	private int buyerNumber;

	

	public TicketSeller(int initialTicketAllotment) {

	totalTicket = initialTicketAllotment;

	}

	


	public int requestTickets(int ticketRequest) {

		int ticketLeft;

		if (ticketRequest > MAXIMUM_TICKET_ALLOWED || totalTicket - ticketRequest < 0) {

			ticketLeft = TOO_MANY_TICKETS_REQUESTED;

	} else {

		totalTicket -= ticketRequest;

		ticketLeft = totalTicket;

		buyerNumber++;

	}

	return ticketLeft;

	}

	
	public int getNumberOfBuyers() {

	return buyerNumber;

	}

	}

