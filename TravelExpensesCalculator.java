/*
4. Travel expenses 
Create a GUI application that calculates and displays the total travel expenses of a business person on a trip. 
Here is the information that the user must provide: 
•	Number	of	days	on	the	trip 
•	Amount	of	airfare,	if	any 
•	Amount	of	car	rental	fees,	if	any 
•	Number	of	miles	driven,	if	a	private	vehicle	was	used 
•	Amount	of	parking	fees,	if	any 
•	Amount	of	taxi	charges,	if	any 
•	Conference	or	seminar	registration	fees,	if	any 
•	Lodging	charges,	per	night 

The company reimburses travel expenses according to the following policy: 
•	$37	per	day	for	meals 
•	Parking	fees,	up	to	$10.00	per	day 
•	Taxi	charges	up	to	$20.00	per	day 
•	Lodging	charges	up	to	$95.00	per	day 
•	If	a	private	vehicle	is	used,	$0.27	per	mile	driven 

The application should calculate and display the following: 
•	Total	expenses	incurred	by	the	business	person 
•	The	total	allowable	expenses	for	the	trip 
•	The	excess	that	must	be	paid	by	the	business	person,	if	any 
•	The	amount	saved	by	the	business	person	if	the	expenses	are	under	the	total	allowed
*/
import java.awt.event.*;
import javax.swing.*;

public class TravelExpensesCalculator extends JFrame
{
   private JLabel lDay,lAirfare,lCar,lMile,lParking,lTaxi,lConference,lLodging, meal,parking,taxi,lodging,mile;
   private JTextField tDay,tAirfare,tCar,tMile,tParking,tTaxi,tConference,tLodging,tmeal,tparking,ttaxi,tlodging,tmile;

   private JButton calculations;
   private JPanel panel;
   
   private final double MealsPerDay = 37;
   private final double ParkingPerDay = 10;
   private final double LodgingPerDay = 95;
   private final double DrivenPerMile = 0.27;
   
   private final int MaxWidth = 300;
   private final int MaxHeight = 600;
   
   public TravelExpensesCalculator()
   {
       setTitle("Travel Expense Calculator");
       setSize(MaxWidth,MaxHeight);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       buildPanel();
       add(panel);
       setVisible(true);
   }
   
 
   private void buildPanel()
   {
       lDay = new JLabel("How many days you traveled: ");
       tDay = new JTextField(10);
       
       lAirfare = new JLabel("Airfare fees: $ ");
       tAirfare = new JTextField(10);
       
       lCar = new JLabel("Car rental fees: $");
       tCar = new JTextField(10);
       
       lMile = new JLabel("Number of miles:  ");
       tMile = new JTextField(10);
       
       lParking = new JLabel("Parking fees: $ ");
       tParking = new JTextField(10);
       
       lTaxi = new JLabel("Taxi charges: $ ");
       tTaxi = new JTextField(10);
       
       lConference = new JLabel("Conference fees: $ ");
       tConference = new JTextField(10);
       
       lLodging = new JLabel("Lodging fees per night: $ ");
       tLodging = new JTextField(10);
       
       meal = new JLabel("Meals per day: $"+ MealsPerDay);
       parking = new JLabel("Parking fee per day: $"+ ParkingPerDay);
       taxi = new JLabel("Lodging charges per day: $"+ LodgingPerDay);
       lodging = new JLabel("Lodging charges per day: $"+LodgingPerDay);
       mile = new JLabel("Chargers per mile: $"+ DrivenPerMile); 
       
       calculations = new JButton("Display the details");
       
       panel = new JPanel();
       
       calculations.addActionListener(new ListenerToCalculateTravelExpenses());
       
       panel.add(lDay);
       panel.add(tDay);
       panel.add(lAirfare);
       panel.add(tAirfare);
       
       panel.add(lCar);
       panel.add(tCar);
       panel.add(lParking);
       panel.add(tParking);
       
       panel.add(lTaxi);
       panel.add(tTaxi);
       panel.add(lConference);
       panel.add(tConference);
       
       panel.add(lLodging);
       panel.add(tLodging);
       
       panel.add(meal);
       panel.add(parking);
       panel.add(taxi);
       panel.add(lodging);
       panel.add(mile);
       panel.add(calculations);   
   }
   
   private class ListenerToCalculateTravelExpenses implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double totalExpences;
         double allowedExpences;
         
         double days = Integer.parseInt(tDay.getText());
         double d1 = Double.parseDouble(tAirfare.getText());
         double d2 = Double.parseDouble(tCar.getText());
         double d3 = Double.parseDouble(tMile.getText());
         double d4 = Double.parseDouble(tParking.getText());
         double d5 = Double.parseDouble(tTaxi.getText());
         double d6 = Double.parseDouble(tConference.getText());
         double d7 = Double.parseDouble(tLodging.getText());
         
         totalExpences = d1 + d2 + (d3 * DrivenPerMile) + d4 + d5 + (d7 * days);
         allowedExpences = (MealsPerDay + ParkingPerDay + LodgingPerDay) * days + d3 * DrivenPerMile;
         
         if(totalExpences > allowedExpences)
            JOptionPane.showMessageDialog(null, "Total expenses by business person: $" + totalExpences
                                               +"\nAllowalble expenses for the trip: $" + allowedExpences
                                               +"\nExpenses must be paid by business person: $" + (totalExpences - allowedExpences) );
         else
            JOptionPane.showMessageDialog(null, "Total expenses by business person: $" + totalExpences
                                               +"\nAllowalble expenses for the trip: $" + allowedExpences
                                               +"\nAmount saved by business person: $" + (-totalExpences + allowedExpences) );

      }
   }
   public static void main(String[] args)
   {
      new TravelExpensesCalculator();
   }
}