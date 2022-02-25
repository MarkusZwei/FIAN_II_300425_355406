package threads;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DemoThreadsInGUI {
	private JFrame frame;

	public static void main(String[] args) {
		DemoThreadsInGUI window = new DemoThreadsInGUI();
	}

	public DemoThreadsInGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Test");
		btn.addActionListener(e -> {
			new Thread() {
				public void run() {
					int i = 0;
					while (i < 10_000_000) {
						System.out.println(i++);
					}
				}
			}.start();
		});

		frame.getContentPane().add(btn);
		frame.setVisible(true);

	}
}
