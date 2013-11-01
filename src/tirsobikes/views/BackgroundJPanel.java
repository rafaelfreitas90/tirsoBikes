package tirsobikes.views;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Rafael
 */
public class BackgroundJPanel extends JPanel {
    private Image image;
    
    public BackgroundJPanel() {
        image = getImage();
    }
    
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        
        int w = this.getWidth();
        int h = this.getHeight();
        
        int iw = image.getWidth(this);
        int ih = image.getHeight(this);
        
        g.drawImage(image, ((w / 2) - iw) + 90, ((h / 2) - ih) + 180 , this);
    }
    
    private Image getImage() {
        URL url = BackgroundJPanel.class.getResource("/tirsobikes/imgs/logo.png");
        
        if (url != null) return new ImageIcon(url).getImage();
        
        return null;
    }
}
