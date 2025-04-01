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
		System.out.println();
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
		
		System.out.print("\n\nEnter customer given amount : ");
		double cash = input.nextDouble();
		
		int change = (int)(cash - price) ;
		
		System.out.println("\n+-----------------+-------------------+");
		System.out.println("|    Net Amount   |   "+price+"          |");
		System.out.println("+-----------------+-------------------+");
		System.out.println("|    Cash         |   "+cash+"         |");
		System.out.println("+-----------------+-------------------+");
		System.out.println("|    Change       |   "+change+"            |");
		System.out.println("+-----------------+-------------------+");
		
		int note5000 =0;
		int note2000 =0;
		int note1000 =0 ;
		int note500  =0;
		int note100  =0;
		int note50   =0;
		int note20   = 0;
		int note10   = 0;
		int note5   = 0;
		int note2   = 0;
		int note1   = 0;
		
		int no5000 =0;
		int no2000 =0;
		int no1000 =0 ;
		int no500  =0;
		int no100  =0;
		int no50   =0;
		int no20   = 0;
		int no10   = 0;
		int no5   = 0;
		int no2   = 0;
		int no1   = 0;
		
		note5000 = change / 5000;
		no5000 = change%5000;
		
		note2000 = no5000/2000;
		no2000 = change%2000;
		
		note1000 = no2000/1000;
		no1000 = change%1000;
		
		note500 = no1000/500;
		no500 = change%500;
		
		note100 = no500/100;
		no100 = change%100;
		
		note50 = no100/50;
		no50 = change%50;
		
		note20 = no50/20;
		no20 = change%20;
		
		note10 = no20/10;
		no10 = change%10;
		
		note5 = no10/5;
		no5 = change%5;
		
		note2 = no5/2;
		no2 = change%2;
		
		note1 = no2/1;
		
		int notes = note5000+note2000+note1000+note500+note100+note50+note20;
		int coins = note10+note5+note2+note1;
		
		System.out.println("+\n-----------------+-------------+");
		System.out.println("|      Value      |      No     |");
		System.out.println("+-----------------+-------------+");
		System.out.println("|     Rs.5000     |     "+note5000+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.2000     |     "+note2000+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.1000     |     "+note1000+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.500      |     "+note500+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.100      |     "+note100+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.50       |     "+note50+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.20       |     "+note20+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.10       |     "+note10+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.5        |     "+note5+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.2        |     "+note2+"       |");
		System.out.println("|-----------------|-------------|");
		System.out.println("|     Rs.1        |     "+note1+"       |");
		System.out.println("+-----------------|-------------+");
		System.out.println("|   No Of Notes   |     "+notes+"       |");
		System.out.println("+-----------------|-------------+");
		System.out.println("|   No Of Coins   |     "+coins+"       |");
		System.out.println("+-----------------|-------------+");
		
		
	} 
}
