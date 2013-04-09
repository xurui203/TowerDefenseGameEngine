package vooga.rts.networking;

public class ChatMessage extends Message {

    /**
     * 
     */
    private static final long serialVersionUID = 765150064081796600L;
    private String myMessage;
    
    public ChatMessage (int timeSent, String message) {
        super(timeSent);
        myMessage = message;
    }

    public String getMessage() {
        return myMessage;
    }
}
