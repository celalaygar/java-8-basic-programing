package Thread_Basics_2_5.Thread_Interrupts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadInterruptSwingDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Interrupt Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(550, 550));
		frame.add(createAnimationContainer());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private static Component createAnimationContainer() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBounds(40, 40, 480, 480);
		panel.setBackground(Color.RED);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		AnimatedPanel animatedPanel = new AnimatedPanel();
		panel.add(animatedPanel);
		JButton button = new JButton("Reverse (Rotate back)");
		panel.add(button, BorderLayout.SOUTH);
		button.addActionListener(e -> {
			(animatedPanel).getThread().interrupt();

		});
		return panel;
	}

	private static class AnimatedPanel extends JComponent {
		private int angle = 0;
		boolean clockwise = true;
		boolean rotate = true;
		private Thread thread;

		AnimatedPanel() {
			startAnimation();
		}

		private void startAnimation() {
			thread = new Thread(() -> {
				while (true) {
					if (rotate) {
						angle++;

					} else {
						angle--;
					}

					if (thread.isInterrupted()) {
						clockwise = !clockwise;
						rotate = false;

					}
					// no need to create EDT
					repaint();
					try {
						TimeUnit.MILLISECONDS.sleep(5);
					} catch (InterruptedException e) {
						clockwise = !clockwise;

					}
				}
			});
			thread.start();
		}

		public void paint(Graphics g) {
			g.setColor(Color.LIGHT_GRAY);

			g.fillArc(40, 40, 400, 400, clockwise ? -angle : angle, 45);
            g.fillArc(40, 40, 400, 400, clockwise? -angle-90: angle+90, 45 );
            g.fillArc(40, 40, 400, 400, clockwise? -angle-180: angle+180, 45 );
            g.fillArc(40, 40, 400, 400, clockwise? -angle-270: angle+270, 45 );
		}

		public Thread getThread() {
			return thread;
		}
	}

}
