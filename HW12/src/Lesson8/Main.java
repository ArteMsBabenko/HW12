
/*
 * LOGOS IT Academy. Java Core Console Application.
*/
package Lesson8;

import java.util.*;


/**
 * @author Artem Babenko.
 * @since Java 1.8
 * @version 1.1  22.April.2022
*/



public class Main {
	
	/* display the application menu on the console */
	static void menu () {
		System.out.println();
		System.out.println("Enter 1 to check if this month exists");
		System.out.println("Enter 2 to display all months with the same rock time");
		System.out.println("Enter 3 to display all months with the same number of days");
		System.out.println("Enter 4 to display all months with fewer days");
		System.out.println("Enter 5 to display all months with many days");
		System.out.println("Enter 6 to display the next season");
		System.out.println("Enter 7 to display the previous season");
		System.out.println("Enter 8 to display all months with an even number of days");
		System.out.println("Enter 9 to display all months with an odd number of days");
		System.out.println("Enter 0 to check whether the number of days in the entered month is even");
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		ArrayList <Months> MonthsList = new ArrayList <Months>(); 
		for (Months MonthsValue : Months.values()) {
			MonthsList.add(MonthsValue);
		}
		
		ArrayList <Seasons> SeasonsList = new ArrayList <Seasons>(); 
		for (Seasons SeasonsValue : Seasons.values()) {
			SeasonsList.add(SeasonsValue);
		}
		
		 
		/* creates an infinite cycle that calls the menu method */
		while (true) {
			
			menu();
			
			/* takes the values from the scanner and runs the corresponding case */
			switch (scanner.nextInt()) {
			
			case 1 : {
				
				System.out.println("Check if this month exists");
				System.out.println("Enter the month");
				String months1 = scanner.next().toUpperCase();
				
				boolean flag = true;
				
								
				if(flag==true) {
					System.out.println("This month exist");
				}else 
					System.out.println("This month doesn't exist");
				break;
			}
			 
			case 2 : {
				
			     System.out.println(" Output of all months with the entered season ");
			     System.out.println("Enter the time of year");
			     String seasons2 = scanner.next().toUpperCase();
					
				 boolean flag = false;
				 
				 for(Months months: MonthsList) {
					 if (months.getSeasons().name().equalsIgnoreCase(seasons2)) {
						 flag=true;
					 }
				 }
				if (flag=true) {
					System.out.println("Season " + seasons2 + " next months:");
					for (Months months2:MonthsList) {
						if (months2.getSeasons().toString().equalsIgnoreCase(seasons2)) {
							System.out.println(months2);
						}
					}
				}
				if (flag=false) {
					System.out.println("There are no such months");
				}
				break;
			}
			
			case 3 : {
			System.out.println("Output of all months with the entered number of days");
		     System.out.println("Enter the number of days");
		     int NumberOfDays3 = scanner.nextInt();
		      
		     boolean flag = false;
		     
	         for(Months months:MonthsList) {
	        	 if (months.getNumberOfDays()==NumberOfDays3) {
	        		 flag = true;
	        	 }
	           }
	         if (flag=true) {
	        	 System.out.println("Number of days"+NumberOfDays3+" have the following months");
	        	 
	        	 for (Months months2:MonthsList) {
						if (months2.getNumberOfDays()==NumberOfDays3) {
							System.out.println(months2); 
			  }
	        }
	     }
	         if (flag == false)
					System.out.println("There are no such months");
	         
	         break;
			}
			
			case 4 :{
				
				System.out.println("Withdrawal of all months with the least number of days");
			     System.out.println("Enter the number of days");
			     int NumberOfDays4 = scanner.nextInt();
				
			     boolean flag = false;
			     
		         for(Months months:MonthsList) {
		        	 if (months.getNumberOfDays()==NumberOfDays4 && NumberOfDays4 > 30 ) {
		        		 flag = true;
		        	 }
		         }
				
		         if (flag=true) {
		        	 System.out.println("The least number of days"+NumberOfDays4+" have the following months");
		        	 
		        	 for (Months months2:MonthsList) {
							if (months2.getNumberOfDays()<NumberOfDays4) {
								System.out.println(months2); 
				  }
		        }
		     }
		         if (flag == false)
						System.out.println("There are no such months");
		         
		         break;  
		         
			}
			
			case 5 : {
				System.out.println("Withdrawal of all months with the largest number of days");
			     System.out.println("Enter the number of days");
			     int NumberOfDays5 = scanner.nextInt();
			      
			     boolean flag = false;
			     
		         for(Months months:MonthsList) {
		        	 if (months.getNumberOfDays()==NumberOfDays5 && NumberOfDays5 <30) {
		        		 flag = true;
		        	 }
		           }
				
		         if (flag=true) {
		        	 System.out.println("The largest number of days"+NumberOfDays5+" have the following months");
		        	 
		        	 for (Months months2:MonthsList) {
							if (months2.getNumberOfDays()>NumberOfDays5) {
								System.out.println(months2);    
			}
		       }
		         }
		         if (flag == false)
									System.out.println("There are no such months");
					         
					         break;  
		        	 }
			
			case 6 : {
				System.out.println("Withdrawal of the next season ");
			     System.out.println("Enter the time of year");
			     String season6 = scanner.next().toUpperCase();
			     
                 boolean flag = false;
			     
		         for(Seasons seasons : SeasonsList) {
		        	 if (seasons.name().equalsIgnoreCase(season6)) {
		        		 flag = true;
		        	 }
		           }
				
		         if (flag=true) {
		        	 System.out.println("The next season");
		        	 
		             Seasons seasons2 = Seasons.valueOf(season6);
		             int i = seasons2.ordinal();
		             
		             if(i == (SeasonsList.size() -1)) {
		            	 i = 0;
		            	 System.out.println(SeasonsList.get(i));
		             } else {
		            	 System.out.println(SeasonsList.get(i+1));
		             }
		         }
		         if(flag == false) {
		        	 System.out.println("Such a time does not exist");
		         }
		         break;
			}
			
			case 7 : {
				System.out.println("Withdrawal of the next season");
			     System.out.println("Enter the time of year");
			     String season7 = scanner.next().toUpperCase();
			     
			     boolean flag = false;
			     
			     for(Seasons seasons : SeasonsList) {
			    	 if (seasons.name().equalsIgnoreCase(season7)) {
			    		 flag = true;
			    	 }
			     }
			     if (flag == true) {
			    	 System.out.println("The previous season");
			    	 Seasons seasons2 = Seasons.valueOf(season7);
			    	 int i = seasons2.ordinal();
			    	 
			    	 if( i== 0) {
			    		 i = (SeasonsList.size() -1);
			    		 System.out.println(SeasonsList.get(i));
			    	 } else {
			    		 System.out.println(SeasonsList.get(i - 1));
			    	 }
			     }
			     if (flag == false) {
			    	 System.out.println("There is no such season");
			     }
			     break;
			}
			
			case 8 : {
				System.out.println("Withdrawal of a month with an even number of days ");
				
				for(Months months:MonthsList) {
		        	 if (months.getNumberOfDays()% 2==0) {
		        		 System.out.println("months");
		        	 }
		           }
				break;
			}
			
			case 9: {
               System.out.println("Withdrawal of a month with an odd number of days");
				
				for(Months months:MonthsList) {
		        	 if (months.getNumberOfDays()% 2 != 0) {
		        		 System.out.println("months");
		        	 }
		           }
				break;
				
			}
			 
			case 0 : {
				System.out.println("Check if this month has an even number of days");
				System.out.println("Enter the month");
			    String months0 = scanner.next().toUpperCase();
			     
			     boolean flag = false;
			     
			     if (flag == true) {
			    	 Months month = Months.valueOf(months0);
			    	 
			    	 if(month.getNumberOfDays() % 2 == 0) {
			    		 System.out.println("This month has an even number of days" + month.getNumberOfDays());
			    	 }else {
			    		 System.out.println("This month has an odd number of days" + month.getNumberOfDays());
			    	 }
			     }
			     if (flag == false) {
			    	 System.out.println("There is no such month");
			     }
			     break;
			}
			
			
			
			}
		}
	}


}
