package multitheading;

public class test {

	public static void main(String[] args) {
		task taskRunner = new task();
		taskRunner.start();
		System.out.println("updating tech");
		
	}

	}
	class task extends Thread {
		public void run() {
			for (int i=0;i<=50;i++){
				System.out.println("The number is:"+ i);
				System.out.println(i);
			}
		}

  }

