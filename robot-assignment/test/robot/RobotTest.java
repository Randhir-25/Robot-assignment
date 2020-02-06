package robotServicet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.implementation.PrototyperobotServicet;
import com.java.interfaces.robotServicetService;

import junit.framework.Assert;


/*
 * @author: Randhir Kumar
 * Test Class
 */
@SuppressWarnings("deprecation")
public class robotServicetTest {
	private robotServicetService robotService;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void robotServiceTest() {
		robotService = new PrototyperobotServicet();
		robotService.walk(3.5);
		robotService.walkAndCarry(1,13);
		robotService.setCharging(60);
		Assert.assertTrue("Failed", robotService.walk(4));
	
	}
}