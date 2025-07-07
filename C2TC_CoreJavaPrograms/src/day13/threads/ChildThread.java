package day13.threads;

public class ChildThread extends Thread {
		private int n;
		private String msg;

		public ChildThread(int n2, String msg2) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			for (int i = 1; i <= n; i++) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					System.err.println("Thread interrupted: " + e.getMessage());
				}
				System.out.println(msg + i + " " + Thread.currentThread().getName());
			}
		}
	}
	


