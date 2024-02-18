package edu.sbcc.cs105;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// Set total number of tickets for selling.

		System.out.print("Please input the number of tickets you want to sell: ");

		Scanner in = new Scanner(System.in);

		int totalTicketNumber = in.nextInt();

		TicketSeller seller = new TicketSeller(totalTicketNumber);

		// main loop for user interface.

		while (totalTicketNumber > 0) {

		// input each purchase.

			System.out.print("Input requested tickets: ");

		int ticketBuy = in.nextInt();

		// call the method of requestTicket().

		int ticketRemain = seller.requestTickets(ticketBuy);

		// check the return from requestTicket().

		// if return is -1, print "Too many tickets requested"

		if (ticketRemain < 0) {

			System.out.println("Too many tickets requested, please try again.");

		// if return positive number, process purchase and print results.

		} else {

			totalTicketNumber = ticketRemain;

		if (totalTicketNumber > 0) {

			System.out.printf("Thank you for your purchase. There are %d tickets remaining.\n",

		totalTicketNumber);

		// if all tickets are sold, print "no tickets remaining".

		} else if (totalTicketNumber == 0) {

		System.out.printf("Thank you for your purchase. There are no tickets remaining.\n");

		}

			}

			}

		// After all tickets are sold, get buyer number and print it.

		int buyer = seller.getNumberOfBuyers();

		System.out.printf("You have had %d buyers.\n", buyer);

		in.close();

		}

		
	}


