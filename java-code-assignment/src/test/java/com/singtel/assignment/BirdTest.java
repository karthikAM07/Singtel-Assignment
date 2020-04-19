package com.singtel.assignment;


import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BirdTest extends TestCase{
	
	public BirdTest( String testName )
    {
        super( testName );
        MockitoAnnotations.initMocks(this);
    }
	
	public static Test suite(){
		return new TestSuite(BirdTest.class);
	}
	
	@InjectMocks
	@Spy
	private Bird bird;
	
	public void testPrintLogs() {
		bird.sing();
        //verifying the interaction to the method
        Mockito.verify(bird).sing();
    }
}
