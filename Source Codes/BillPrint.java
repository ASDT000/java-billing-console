import java.util.*;
class BillPrint{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====================================================================================\n");
		
		System.out.println("__          __  _                             _          _ __  __            _");
		System.out.println("\\ \\        / / | |                           | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ____ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/  __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|");
		System.out.println("   \\  /\\  /  __/ |  (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\____\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println();
		System.out.println("=====================================================================================");
		
		System.out.print("\nEnter Customer Phone Number - ");
		String customerPhoneNumber = input.next();
		System.out.print("\nEnter Customer Name         - ");
		String customerName = input.next();
		
		System.out.println("\n\n=====================================================================================");
		
		System.out.print("\nBasmathi Qty(Kg) - ");
		int basmathi=input.nextInt();
		System.out.print("\nDhal     Qty(Kg) - ");
		int dhal=input.nextInt();
		System.out.print("\nSuger    Qty(Kg) - ");
		int suger=input.nextInt();
		System.out.print("\nHigland  Qty     - ");
		int higland=input.nextInt();
		System.out.print("\nYoghurt  Qty     - ");
		int yoghurt=input.nextInt();
		System.out.print("\nFlour    Qty(Kg) - ");
		int flour=input.nextInt();
		System.out.print("\nSoap     Qty     - ");
		int soap=input.nextInt();
		
		final double basmathiPrice =250;
		final double dhalPrice = 180;
		final double sugerPrice = 150;
		final double higlandPrice = 1200;
		final double yoghurtPrice =50 ;
		final double flourPrice = 120;
		final double soapPrice = 160;
		
		double basmathiTot = basmathi * basmathiPrice  ;
		double dhalTot = dhal * dhalPrice  ;
		double sugerTot = suger * sugerPrice  ;
		double higlandTot = higland * higlandPrice  ;
		double yoghurtTot = yoghurt * yoghurtPrice  ;
		double flourTot = flour * flourPrice  ;
		double soapTot = soap * soapPrice  ;
		
		
		double total = basmathiTot + dhalTot + sugerTot  + higlandTot  + yoghurtTot + flourTot + soapTot;
		double discount = total * 0.1;
		
		double price = total - discount;
		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|                _   __  __          _____ _______              |");
		System.out.println("|               (_) |  \\/  |   /\\   |  __ \\__   __|             |");
		System.out.println("|                _  | \\  / |  /  \\  | |__) | | |                |");
		System.out.println("|               | | | |\\/| | / /\\ \\ |  _  /  | |                |");
		System.out.println("|               | | | |  | |/ ____ \\| | \\ \\  | |                |");
		System.out.println("|               |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                |");
		System.out.println("|                    225,Galle Road,Panadura.                   |");
		System.out.println("|                                                               |");
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|                       # Tel   : "+customerPhoneNumber+"                    |");
		System.out.println("|                       # Name  : "+customerName+"                         |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.println("|                 |    Qty      |   unit price  |    Price      |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.println("| # Basmathi      |     "+basmathi+"      |       "+basmathiPrice+"   |       "+basmathiTot+"  |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # Dhal          |     "+dhal+"       |       "+dhalPrice+"   |       "+dhalTot+"   |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # Suger         |     "+suger+"       |       "+sugerPrice+"   |       "+sugerTot+"   |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # Highland      |     "+higland+"       |       "+higlandPrice+"  |       "+higlandTot+"  |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # Yoghurt       |     "+yoghurt+"       |       "+yoghurtPrice+"    |       "+yoghurtTot+"   |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # flour         |     "+flour+"       |       "+flourPrice+"   |       "+flourTot+"   |");
		System.out.println("|                 |             |               |               |");
		System.out.println("| # Soap          |     "+soap+"       |       "+soapPrice+"   |       "+soapTot+"   |");
		System.out.println("|                 |             |               |               |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.println("|                               |  Total        |       "+total+"  |");
		System.out.println("+                               +---------------+---------------+");
		System.out.println("|                               |  discount(10%)|        "+discount+"  |");
		System.out.println("+                               +---------------+---------------+");
		System.out.println("|                               |  Price        |       "+price+"  |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.println();
		System.out.println();
		System.out.println("Copyright (c) 2024 AS DINUSHKA THARIDU");
		
		
		
	} 
}
