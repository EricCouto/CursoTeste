package lambdas;

public class Threads {

	public static void main(String[] args) {

		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("tarefa #02 !!");
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}

				}
			}
		};

		Runnable trabalho3 = () -> { // lambda
			for (int i = 0; i < 10; i++) {
				System.out.println("tarefa #03 !!!");
				try {
					Thread.sleep(100);
				} catch (Exception e) {

				}

			}
		};

		Runnable trabalho4 = Threads::trabalho4; // referencia de metodo

		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		Thread t4 = new Thread(trabalho4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	static void trabalho4() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("tarefa #04 !!!!");
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}

		}
	}

}
