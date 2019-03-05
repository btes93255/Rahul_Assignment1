package threadMaking;



class Thread1 extends Thread {
		public void run()
		{
			try {
				for(int i=1; i<=10; i++) {
					System.out.println(Thread.currentThread().getName());
//					if(i==7) {
//						Thread.sleep(2000);
//					}
				}
			}
			catch(Exception e)  {
				
			}
		}
		}
		class Thread2 extends Thread {
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		
	}

 class threading {

	public static void main(String k[]) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t2.start();
		t1.start();
		
		
		}

}
