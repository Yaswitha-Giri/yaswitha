package com.yas;
import java.util.ArrayList;
public class Airport extends Flight  {
	private Address address;
	static ArrayList<Flight> flist=new ArrayList<>();
	static ArrayList<Traveller> tlist=new ArrayList<>();
	int index=0;
	
	
	public static boolean addFlight(Flight flight)
	{
		flist.add(flight);
		return true;
	}
	public ArrayList<Flight> searchFlightBySourceAndDestination(String source,String destination)
	{
		for(int i=0;i<flist.size();i++)
		{
			if ( flist.contains(source) && flist.contains(destination))
			    return flist;
		
		}
		return null;
	}
	public boolean bookTicket(Traveller traveller)
	{
		for(int i=0;i<flist.size();i++)
		{
			if((flist.get(i)).getId()==Traveller.getFlightId() &&((flist.get(i)).getAvailableseats()!=0))
            {
            		tlist.add(traveller);
            		flist.get(i).setAvailableseats((flist.get(i)).getAvailableseats()-1);
            		return true;
             }
		}
		return false;
		
	}
	
	
}
