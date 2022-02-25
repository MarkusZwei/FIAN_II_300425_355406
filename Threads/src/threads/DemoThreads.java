package threads;

public class DemoThreads {
	public static void main(String[] args) {
		thread01();
	}

	private static void thread01() {
		Runnable target = new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (i<1000) {
					try {
						Thread.sleep(125);
						System.out.println("Unser erster Thread mit einem Runnable");
						i++;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}			
		};
		
		Thread t1 = new Thread(target);
		t1.start();
		int i = 0;
		while (i<1000) {
			try {
				Thread.sleep(125);
				System.out.println("Dies ist aus dem Main Thread heraus");
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		
	}
}
