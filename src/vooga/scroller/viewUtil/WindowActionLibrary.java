
package vooga.scroller.viewUtil;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 * Library of Actions that can be used on a window
 * @author Dagbedji Fagnisse, Ross Cahoon
 *
 */
public class WindowActionLibrary {
    
    private Window myWindow;
    
    /**
     * Instantiate a Library for a specific window
     * @param w - window specified
     */
    public WindowActionLibrary(Window w) {
        myWindow = w;
    }
    
    
    private String getLiteral (String string) {
        return Window.getLiteral(string);
    }

    /**
     * Action to select a background (image)
     * @author Ross Cahoon
     *
     */
    public class ChangeBackgroundAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = 4028591576025206764L;

        /**
         * 
         */
        public ChangeBackgroundAction () {
            super(getLiteral("ChangeBackground"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.changeBackground();
        }
    }
    
//    /**
//     * Change the color of the pen
//     * @author Dagbedji Fagnisse
//     *
//     */
//    public class ChangePenColorAction extends AbstractAction {
//
//        /**
//         * 
//         */
//        private static final long serialVersionUID = 5924600135174276764L;
//
//        /**
//         * 
//         */
//        public ChangePenColorAction () {
//            super(getLiteral("ChangePenColor"));
//            putValue(ACCELERATOR_KEY, 
//                     KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.SHIFT_MASK));
//        }
//
//        @Override
//        public void actionPerformed (ActionEvent e) {
//            myWindow.changePenColor();
//        }
//    }
//    
//    /**
//     * Action to change other properties of the Pen
//     * @author Dagbedji Fagnisse
//     *
//     */
//    public class ChangePenPropertiesAction extends AbstractAction {
//        /**
//         * 
//         */
//        private static final long serialVersionUID = 1195893189944743020L;
//
//        /**
//         * 
//         */
//        public ChangePenPropertiesAction () {
//            super(getLiteral("ChangePenProperties"));
//            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
//        }
//
//        @Override
//        public void actionPerformed (ActionEvent e) {
//            (new PenOptionsView(myWindow)).display();
//        }
//    }
//
//    /**
//     * Action to change the shape of the turtle
//     * @author Dagbedji Fagnisse
//     *
//     */
//    public class ChangeTurtleAction extends AbstractAction {
//        /**
//         * 
//         */
//        private static final long serialVersionUID = 2262849207018209956L;
//
//        /**
//         * 
//         */
//        public ChangeTurtleAction () {
//            super(getLiteral("ChangeTurtle"));
//            putValue(ACCELERATOR_KEY, 
//                     KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));
//        }
//
//        @Override
//        public void actionPerformed (ActionEvent e) {
//            myWindow.setTurtleShape();
//        }
//    }

    /**
     * Create a new Tab
     * @author Dagbedji Fagnisse
     *
     */
    public class NewTabAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = -7304060289109763023L;


        /**
         * Create a defaut NewTabAction
         */
        public NewTabAction() {
            super(getLiteral("NewCommand"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        }


        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.addTab();
        }


    }

    /**
     * Open a File - TODO
     * @author Dagbedji Fagnisse
     *
     */
    public class OpenFileAction extends AbstractAction {

        /**
         * 
         */
        private static final long serialVersionUID = -9016197028326396416L;
        /**
         * 
         */
        public OpenFileAction() {
            super(getLiteral("OpenCommand"));
            putValue(ACCELERATOR_KEY, 
                     KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        }
        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.openFile();

        }

    }

    /**
     * Action to quit (close window).
     * @author Dagbedji Fagnisse
     *
     */
    public class QuitAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = 2025130543262284557L;

        /**
         * 
         */
        public QuitAction() {
            super(getLiteral("QuitCommand"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q, 
                                                             ActionEvent.CTRL_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.quit();
        }
    }
    
    /**
     * Action to undo last action.
     * @author Dagbedji Fagnisse
     *
     */
    public class UndoAction extends AbstractAction {

        /**
         * 
         */
        private static final long serialVersionUID = 5893273433405217460L;

        /**
         * 
         */
        public UndoAction() {
            super(getLiteral("Undo"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.undo();
        }
    }
    
    /**
     * Action to redo the last (undone) action
     * @author Dagbedji Fagnisse
     *
     */
    public class RedoAction extends AbstractAction {

        /**
         * 
         */
        private static final long serialVersionUID = -902305166517450810L;

        /**
         * 
         */
        public RedoAction() {
            super(getLiteral("Redo"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.redo();
        }
    }

    /**
     * Action to save a file - TODO
     * @author Dagbedji Fagnisse
     *
     */
    public class SaveFileAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = -8047902890724034143L;

        /**
         * 
         */
        public SaveFileAction () {
            super(getLiteral("SaveCommand"));
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.saveFile();
        }
    }

    /**
     * Action to toggle Grid
     * @author Ross Cahoon
     *
     */
    public class ToggleGridAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = -273639836177381910L;
        /**
         * 
         */
        public ToggleGridAction () {
            super(getLiteral("ReferenceCommand"));
            putValue(ACCELERATOR_KEY, 
                     KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.ALT_MASK));
        }
        @Override
        public void actionPerformed (ActionEvent e) {
            myWindow.toggleGrid();
        }
    }

    /**
     * TODO
     * @author Dagbedji Fagnisse
     *
     */
    public class WebInfoAction extends AbstractAction {
        /**
         * 
         */
        private static final long serialVersionUID = -3838081948621848563L;

        WebInfoAction() {
            super(getLiteral("WebInfoCommand"));
            putValue(ACCELERATOR_KEY, 
                     KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        }

        @Override
        public void actionPerformed (ActionEvent e) {
            try {
                String url = 
                        "http://www.cs.duke.edu/courses/spring13/compsci308/assign/03_slogo/";
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            }
            catch (java.io.IOException er) {
//                System.out.println(er.getMessage());
            }
        }
    }
    
}
