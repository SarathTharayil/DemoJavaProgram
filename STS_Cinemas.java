import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STS_Cinemas
{
public static void main(String[]args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String movie,st;
int quantity,F=0;
int i=0;
int date,catg,sum=0;
int bvrg,tot_bvrg;
int snck,amt,tot_snck,fd,tot_fd,d,tot_d;
String size;
char ch;
String ans="STS";
String ans2="quit";
do{
System.out.println("*********************WELCOME TO STS CINEMAS************************");
System.out.println("*******************************************************************");
System.out.println();
System.out.println("Choose your Movie");
int list[]=new int[6];
int cost[]=new int[6];
System.out.println("<<<<----Enter the Name of the Nearest Town---->>>>");
System.out.println("_________________________________________________________________________");
String city=br.readLine();
System.out.println();
System.out.println();
System.out.println("STS Theaters is Everywhere around you,including "+city);
System.out.println("___________________________________________________________________");
System.out.println("1.STS Blockbusters "+city);
System.out.println("2.STS Full HD Blockbusters "+city);
catg=Integer.parseInt(br.readLine());
System.out.println();
System.out.println();
System.out.println("Mobile or Internet Booking is also Applicable");
System.out.println("For Mobile Booking,contact +91 1729 from your Mobile(Premium rates Apply)");
System.out.println("For Internet Booking,visit http://www.stscinemas.com");
System.out.println();
System.out.println();
System.out.println("Catch the Latest Movies now playing at STS Cinemas near you");
System.out.println("___________________________________________________________");
System.out.println();
System.out.println("Enter the Correct Number for your Selected Date");
System.out.println("1.Thursday,20 June[2013]");
System.out.println("2.Friday,21 June[2013]");
System.out.println("3.Saturday,22 June[2013]");
System.out.println("4.Sunday,23 June[2013]");
System.out.println("5.Monday,24 June[2013]");
System.out.println("6.Tuesday,25 June[2013]");
System.out.println("7.Wednesday,26 June[2013]");
date=Integer.parseInt(br.readLine());
System.out.println();
System.out.println();
System.out.println("Please Enter the Number of tickets");
quantity=Integer.parseInt(br.readLine());
System.out.println();
if(catg==1)
{
System.out.println("*****Now Showing*****");
System.out.println("Movie Name\tShow Timings");
System.out.println();
System.out.println("AMAZING SPIDER-MAN[English](U/A)\t10:15 am,1:00 pm,4:00 pm,9:15 pm");
System.out.println("MAN OF STEEL[English](U/A)\t12:15 pm,4:00 pm,6:15 pm");
System.out.println("AFTER EARTH[English](U)\t3:20 pm");
System.out.println("ABCD[Malayalam](U)\t6:15,9:20");
System.out.println("YE JAWANI HE DIWANI[Hindi](U)\t10:00 am,12:45 pm,1:05 pm,3:20 pm,6:20 pm,9:05 pm");
System.out.println("ANKUR ARORA MURDER[Hindi](U/A)\t10:30 am,12:45 pm,1:05 pm,4:00 pm,6:20 pm");
System.out.println("HONEY BEE[Malayalam](U)\t10:00 am,12:45 pm,9:45 pm");
System.out.println("FAST AND FURIOUS 5[English](U/A)\t10:00 am,12:45 pm,9:45 pm");
System.out.println("MAN Of STEEL 3D[English](U/A)\t1:00 pm,4:05 pm");
System.out.println("UP&DOWN[Malayalam](U)\t1:20 pm");
System.out.println("SOUND THOMA[Malayalam](U)\t4:20");
System.out.println("THIYYAVALE SEYYANAM KUMARU[Tamil](U/A)\t11:00 am");
System.out.println("AARYA 2[Telugu](A)\t9:45 pm");
System.out.println("MOORU GUTTU ONDHU SULLU[Kannada](U)\t3:40 pm");
System.out.println("AFTER EARTH 3D[English](U)\t1:20 pm");
System.out.println("JULIE AND JULIA[Kannada](A)\t10:00 am");
System.out.println("VILLAGE LO VINAYAKUDU[Telugu](U)\t10:00 am,3:20 pm");
System.out.println("VIVA FRANKA[Spanish](U/A)\t10:00");
System.out.println();
System.out.println("Enter the Name for your Selected Movie");
movie=br.readLine();
cost[i]=110;
sum=sum+110;
System.out.println("The Total Cost is Rs."+(quantity*110));
System.out.println("Your Seat Number(s) is(are) ");
for(i=1;i<=quantity;i++)
{
System.out.println(17+i);
}
}
else if(catg==2)
{
System.out.println("*****Now Showing*****");
System.out.println("Movie Name\tShow Timings");
System.out.println();
System.out.println("AMAZING SPIDER-MAN[English](U/A)\t10:15 am,1:00 pm,4:00 pm,9:15 pm");
System.out.println("MAN OF STEEL[English](U/A)\t12:15 pm,4:00 pm,6:15 pm");
System.out.println("AFTER EARTH[English](U)\t3:20 pm");
System.out.println("ABCD[Malayalam](U)\t6:15,9:20");
System.out.println("YE JAWANI HE DIWANI[Hindi](U)\t10:00 am,12:45 pm,1:05 pm,3:20 pm,6:20 pm,9:05 pm");
System.out.println("ANKUR ARORA MURDER[Hindi](U/A)\t10:30 am,12:45 pm,1:05 pm,4:00 pm,6:20 pm");
System.out.println("HONEY BEE[Malayalam](U)\t10:00 am,12:45 pm,9:45 pm");
System.out.println("FAST AND FURIOUS 5[English](U/A)\t10:00 am,12:45 pm,9:45 pm");
System.out.println("MAN Of STEEL 3D[English](U/A)\t1:00 pm,4:05 pm");
System.out.println("UP&DOWN[Malayalam](U)\t1:20 pm");
System.out.println("SOUND THOMA[Malayalam](U)\t4:20");
System.out.println("THIYYAVALE SEYYANAM KUMARU[Tamil](U/A)\t11:00 am");
System.out.println("AARYA 2[Telugu](A)\t9:45 pm");
System.out.println("MOORU GUTTU ONDHU SULLU[Kannada](U)\t3:40 pm");
System.out.println("AFTER EARTH 3D[English](U)\t1:20 pm");
System.out.println();
System.out.println("Select your Movie");
movie=br.readLine();
cost[i]=150;
sum=sum+150;
System.out.println("The Total cost is Rs."+(quantity*150));
System.out.println("Your Seat Number/s is/are");
for(i=1;i<=quantity;i++);
{
System.out.println(86+i);
}
}
else
System.out.println("The Number to be Entered should be either 1 or 2");
System.out.println("COMING SOON");
System.out.println("Check out the Upcoming Releases");
System.out.println("*******************************");
System.out.println("IRON MAN 3[English]");
System.out.println("TWILIGHT SAGA BLOOD MOON[English]");
System.out.println("HARRY POTTER AND THE DEATHLY HALLOWS PART 2[English]");
System.out.println();
System.out.println("To Quit,Enter STS");
ans=br.readLine();
}
while(!(ans.equalsIgnoreCase("sts")));
System.out.println("*********Thank You***********");
do{
System.out.println("WELCOME TO THE SNACK BAR OF STS!!!!!!!!");
System.out.println();
System.out.println();
System.out.println("STALL 1");
System.out.println("Beverages\n");
System.out.println("CHILLED");
System.out.println("-------");
System.out.println("1.Coca Cola");
System.out.println("2.Sprite");
System.out.println("3.Fruity");
System.out.println("4.Pepsi[Diet]");
System.out.println("5.Seven Up");
System.out.println("6.Cold Coffee");
System.out.println("7.Ice Tea");
System.out.println("8.Chocolate Krushers");
System.out.println("9.Strawberry Krushers");
System.out.println("10.Lemon n' Ice Tea");
System.out.println();
System.out.println("PIPING HOT DRINKS");
System.out.println("-----------------");
System.out.println("11.Tea [Regular]");
System.out.println("12.Hot Lemon Tea");
System.out.println("13.Espresso");
System.out.println("14.Cafe mocha");
System.out.println("15.Cappuccino");
System.out.println("16.Cafe Latte");
System.out.println("17.Irish Coffee");
System.out.println();
System.out.println("Choose your Beverage by entering the Number");
bvrg=Integer.parseInt(br.readLine());
System.out.println("Enter the Number of Beverages that You want to Buy");
tot_bvrg=Integer.parseInt(br.readLine());
if(bvrg>=1 && bvrg<=7)
{
System.out.println("Total Cost is Rs."+(tot_bvrg*45));
}
else if(bvrg>=8 && bvrg<=10)
{
System.out.println("Total Cost is Rs."+(tot_bvrg*55));
}
else if(bvrg>=11 && bvrg<=12)
{
System.out.println("Total Cost is Rs."+(tot_bvrg*65));
}
else if(bvrg>=13 && bvrg<=17)
{
System.out.println("Total Cost is Rs."+(tot_bvrg*75));
}
System.out.println();
System.out.println("STALL 2");
System.out.println("Quick Bites");
System.out.println("18.Pop Corn[Regular]");
System.out.println("19.Pop Corn[Cheese]");
System.out.println("20.Pop Corn[Caramel]");
System.out.println("21.Pop Corn[Tangy Tomato]");
System.out.println("22.Veg Samosa");
System.out.println("23.Veg Puff");
System.out.println("24.Veg Quiche");
System.out.println("25.Veg Pizza");
System.out.println("26.Veg Croissant");
System.out.println("27.Veg Burger");
System.out.println("28.French Fries");
System.out.println("29.Chicken Puff Roll");
System.out.println("30.Multi Grain Chicken Sandwitch");
System.out.println("31.Foccaccia Chicken Sandwitch");
System.out.println("32.Chicken Submarine");
System.out.println("Choose your Snack by Entering the Number");
snck=Integer.parseInt(br.readLine());
System.out.println("Enter the Total Number of Snacks you want to Buy");
tot_snck=Integer.parseInt(br.readLine());
if(snck>=18 && snck<=21)
{
System.out.println("Enter 'S' for Small,'M' for Medium and 'L' for Large Packs");
size=br.readLine();
if(size.equalsIgnoreCase("S"))
{
amt=tot_snck*45;
System.out.println("Total Cost is Rs."+amt);
}
else if(size.equalsIgnoreCase("M"))
{
amt=tot_snck*55;
System.out.println("Total Cost is Rs."+amt);
}
else if(size.equalsIgnoreCase("L"))
{
amt=tot_snck*65;
System.out.println("The Total Cost is Rs."+amt);
}
}
else if(snck>=22 && snck<=23)
{
amt=tot_snck*40;
System.out.println("Total Cost is Rs."+amt);
}
else if(snck>=24 && snck<=25)
{
amt=tot_snck*65;
System.out.println("Total Cost is Rs."+amt);
}
else if(snck>=26 && snck<=27)
{
amt=tot_snck*75;
System.out.println("Total Cost is Rs."+amt);
}
else if(snck==28)
{
amt=tot_snck*35;
System.out.println("Total Cost is Rs."+amt);
}
else if(snck>=29 && snck<=31)
{
amt=tot_snck*95;
System.out.println("Total Cost is Rs."+amt);
}
else if(snck==32)
{
amt=tot_snck*105;
System.out.println("Total Cost is Rs."+amt);
}
System.out.println("\n\n");
System.out.println("STALL 3");
System.out.println("Main Course");
System.out.println();
System.out.println("33.Pav Bhaji");
System.out.println("34.Channa Batura");
System.out.println("35.Schezwan Fried Rice");
System.out.println("36.Chicken Biriyani");
System.out.println("37.Chicken Noodles");
System.out.println("Choose your Main Course by entering the Number");
fd=Integer.parseInt(br.readLine());
System.out.println("Enter the Total Number of Items you want to Order");
tot_fd=Integer.parseInt(br.readLine());
if(fd==33 || fd==34)
{
amt=tot_fd*46;
System.out.println("Total Cost is Rs."+amt);
}
else if(fd==35)
{
amt=tot_fd*60;
System.out.println("Total Cost is Rs."+amt);
}
else if(fd==36 || fd==37)
{
amt=tot_fd*86;
System.out.println("Total Cost is Rs."+amt);
}
System.out.println("Are you Interested in Proceeding to the 4th Stall?(Desserts)Enter y to Proceed.");
st=br.readLine();
if(st.equalsIgnoreCase("Y"))
{
System.out.println("Melting Moments[Desserts]");
System.out.println("38.Banana Chocolte Mousse");
System.out.println("39.Banana Caramel Pie");
System.out.println("40.Chocolate Caramel Brownie");
System.out.println("41.Chocolate Doughnut");
System.out.println("42.Marble Cake");
System.out.println("43.Mocha Magic");
System.out.println("44.Black Forest Gateaux");
System.out.println();
System.out.println("Choose your Dessert by entering the Number");
d=Integer.parseInt(br.readLine());
System.out.println("Enter the Total Number of items you wants to Order.");
tot_d=Integer.parseInt(br.readLine());
if(d==38 || d==39)
{
System.out.println("Total Cost is Rs."+(tot_d*55));
}
else if(d==40 || d==41)
{
System.out.println("Total Cost is Rs."+(tot_d*45));
}
else if(d==42)
{
System.out.println("Total Cost is Rs."+(tot_d*60));
}
else if(d== 43 || d==44)
{
System.out.println("Total Cost is Rs."+(tot_d*65));
}
}
System.out.println("To Quit, Enter QUIT");
ans2=br.readLine();
}
while((ans.equalsIgnoreCase("QUIT")));
System.out.println("Thank You.Visit Again");
System.out.println();
System.out.println();
System.out.println();
System.out.println("CANCELLATION OF TICKETS");
System.out.println("-----------------------");
System.out.println("If you want to Cancel,enter '1' else enter '2'");
int pr=Integer.parseInt(br.readLine());
if(pr==1)
{
System.out.println("You Have Chosen to Cancel the Tickets.");
cancel();
}
else if(pr==2)
{
System.out.println("You Have Chosen not to Cancel the Tickets");
System.out.println("Thank You");
}
else
System.out.println("Invalid Choice");
}
public static void cancel()throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int catg,quantity,seat_no;
String date,movie,shw_time;
System.out.println("In which Category would you like to Cancel the Tickets");
System.out.println("1.STS Blockbusters");
System.out.println("2.STS HD Blockbusters");
catg=Integer.parseInt(br.readLine());
switch(catg)
{
case 1:System.out.println("STS [Ordinary]"); 
System.out.println("Enter the date of Cancellation");
date=br.readLine();
System.out.println("Please enter the Time of the Movie you want to Cancel");
movie=br.readLine();
System.out.println("Please enter the Show Timings");
shw_time=br.readLine();
System.out.println("Please enter the Quantity of Tickets");
quantity=Integer.parseInt(br.readLine());
System.out.println("Please enter the Seat Number");
seat_no=Integer.parseInt(br.readLine());
System.out.println();
System.out.println("Your Tickets Have been Succesfully Cancelled");
break;
case 2:System.out.println("STS HD");
System.out.println("Enter the date of Cancellation");
date=br.readLine();
System.out.println("Please enter the Time of the Movie you want to Cancel");
movie=br.readLine();
System.out.println("Please enter the Show Timings");
shw_time=br.readLine();
System.out.println("Please enter the Quantity of Tickets");
quantity=Integer.parseInt(br.readLine());
System.out.println("Please enter the Seat Number");
seat_no=Integer.parseInt(br.readLine());
System.out.println();
System.out.println("Your Tickets Have been Succesfully Cancelled");
break;
}
}
}