/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;
import java.util.Date;

/**
 *
 * @author igor_
 */
public final class Timer {
    private Date start;

	/**
	 * Start timer.
	 */
	public Timer()
	{
		reset();
	}

	/**
	 * Returns exact number of milliseconds since timer was started.
	 * 
	 * @return Number of milliseconds since timer was started.
	 */
	public long getTime()
	{
		Date now = new Date();
		long millis = now.getTime() - start.getTime();

		return millis;
	}

	/**
	 * Restarts the timer.
	 */
	public void reset()
	{
		start = new Date(); // now
	}

	/**
	 * Returns a formatted string showing the elaspsed time suince the instance
	 * was created.
	 * 
     * @param mili
	 * @return Formatted time string.
	 */
	public String toString( boolean mili )
	{
		long millis = getTime();

		long hours = millis / 1000 / 60 / 60;
		millis -= hours * 1000 * 60 * 60;

		long minutes = millis / 1000 / 60;
		millis -= minutes * 1000 * 60;

		long seconds = millis / 1000;
		millis -= seconds * 1000;

		StringBuilder time = new StringBuilder();
		if( hours > 0 )
			time.append(hours).append(":");
		if( hours > 0 && minutes < 10 )
			time.append( "0" );
		time.append(minutes).append(":");
		if( seconds < 10 ) {
                    time.append( "0" );
                } else {
                }
		time.append( seconds );

		if( mili )
		{
			time.append( "." );
			if( millis < 100 )
				time.append( "0" );
			if( millis < 10 )
				time.append( "0" );
			time.append( millis );
		}

		return time.toString();
	}

	@Override
	public String toString()
	{
		return toString( true );
	}

	/**
	 * Testing this class.
	 * 
	 * @param args
	 *            Not used.
	 */
	public static void main( String[] args )
	{
		Timer timer = new Timer();

		for( int i = 0; i < 100000000; i++ )
		{
			double b = 998.43678;
			double c = Math.sqrt( b );
		}

		System.out.println( timer );
	}
}
