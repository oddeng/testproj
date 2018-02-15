import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("This is currently running on the main thread," + 
							" the id is:" + Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.setName("T2");
		t2.setPriority(MIN_PRIORITY);
		
		Thread t3 = new Thread(worker);
		
		Thread t4 = new Thread(worker);
		t4.setName("T4");
		t4.setPriority(MAX_PRIORITY);
		
		Thread t5 = new Thread(worker);
		
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		ldt = LocalDateTime.now();
		
		System.out.println(ldt + ":Main finished running...");
		
		//start thread
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			
	}
	
	@Override
	public void run ()
	{
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ":This is currently running on the separate thread," + 
							" the id is:" + Thread.currentThread().getId()+ 
							  ", with Name :" + Thread.currentThread().getName() +
							  ", With Priority:" + Thread.currentThread().getPriority()) ;
	
		for (int i=0;i<1000;i++);
		
		
	}

} 