package arcade.view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import arcade.games.GameInfo;
import arcade.util.Pixmap;
import arcade.util.JPicture;


public class SnapShot extends JPanel implements MouseListener {

    /**
         * 
         */
    private static final long serialVersionUID = 1859238824934859448L;
    private GameInfo myGameInfo;
    private JLabel myTitle;
    private JComponent myThumbnail;
    private JLabel myRating;
    
    
    private String gameName;

    public SnapShot (GameInfo info) {
        myGameInfo = info;
        
        gameName = info.getName();
        
        myTitle = new JLabel("<html><b><font size = 6>" + myGameInfo.getName() +
                             "</font></html></b>");
        Pixmap p = myGameInfo.getThumbnail();
        myThumbnail = new JPicture(p, new Dimension(160, 160));
        myRating = new JLabel(myGameInfo.getRating() + "");
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(myTitle);
        add(myThumbnail);
        add(myRating);
        myTitle.addMouseListener(this);
        myThumbnail.addMouseListener(this);
        myRating.addMouseListener(this);

    }

    @Override
    public void mouseClicked (MouseEvent arg0) {
        // TODO Auto-generated method stub
        if (arg0.getClickCount() == 2) {
            System.out.println("Clicked!!");
            // TODO:
            // Put the String(or whatever) to the database and then
            // get the JComponent+model from the database
            // Create a JFrame and fill the Frame with the feedback from
            // the database
            // JFrame des = new JFrame(myGameInfo.title());
            // des.setVisible(true);
            openHelpPage();
            
            
        }
    }

    @Override
    public void mouseEntered (MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited (MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed (MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased (MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void openHelpPage () {
        String url = "http://breadfish.de/";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
