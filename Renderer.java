package flappybird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	private static final long serialVersionUID = -3779640523173072137L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		FlappyBird.flappybird.repaint(g);
	}
}
