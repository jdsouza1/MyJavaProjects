package mailuseragent;
import java.net.*;
import java.io.*;
import java.util.*;
/**
* Open an SMTP connection to a remote machine and send one mail.
*/

public class SMTPConnection {

/* The socket to the server */
private Socket connection;

/* Streams for reading and writing the socket */
private BufferedReader fromServer;
private DataOutputStream toServer;

private static final int SMTP_PORT = 25;
private static final String CRLF = "\r\n";

/* Are we connected? Used in close() to determine what to do. */
private boolean isConnected = false;

/* Create an SMTPConnection object. Create the socket and the
associated streams. Initialize SMTP connection. */
public SMTPConnection(Envelope envelope) throws IOException {
connection = new Socket("smtp.".concat(envelope.DestHost), SMTP_PORT);
fromServer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
toServer = new DataOutputStream(connection.getOutputStream());

/* Read a line from server and check that the reply code is 220.
If not, throw an IOException. */
String text = fromServer.readLine();
System.out.println(parseReply(text));
if (parseReply(text) != 220)
throw new IOException();
System.out.println("Mail server ".concat("smtp.").concat(envelope.DestHost).concat("found."));

/* SMTP handshake. We need the name of the local machine.
Send the appropriate SMTP handshake command. */
String localhost = (InetAddress.getLocalHost()).getCanonicalHostName();
System.out.println("LOCALHOST: "+localhost);
sendCommand("HELO ".concat(localhost), 250);

isConnected = true;
}

/* Send the message. Write the correct SMTP-commands in the
correct order. No checking for errors, just throw them to the
caller. */
public void send(Envelope envelope) throws IOException {

/* Send all the necessary commands to send a message. Call
sendCommand() to do the dirty work. Do _not_ catch the
exception thrown from sendCommand(). */

sendCommand("MAIL FROM: ".concat(envelope.Sender),250);
sendCommand("RCPT TO: ".concat(envelope.Recipient),250);
sendCommand("DATA",354);
sendCommand(envelope.Message.toString().concat(CRLF).concat("."),250);
}

/* Close the connection. First, terminate on SMTP level, then
close the socket. */
public void close() {
isConnected = false;
try {
sendCommand("QUIT", 221); // closes SMTP
connection.close();	// closes socket
} catch (IOException e) {
System.out.println("Unable to close connection:"  + e);
isConnected = true;
}
}

/* Send an SMTP command to the server. Check that the reply code
is what is is supposed to be according to RFC 821. */
private void sendCommand(String command, int rc) throws IOException{

/* Write command to server and read reply from server. */
System.out.println("Command to server:"  + command);
command = command.concat(CRLF); // adds newline at end of command.
toServer.writeBytes(command);

/* Check that the server’s reply code is the same as the
parameter rc. If not, throw an IOException. */
String text = fromServer.readLine();
System.out.println("Reply from server:"  + text);
if (parseReply(text) != rc){
System.out.println("reply codes do not match");
throw new IOException();
}
}

/* Parse the reply line from the server. Returns the reply
code. */
private int parseReply(String reply) {
String tmp = reply.substring(0,3); // takes the first three digits of the string
int i = Integer.parseInt(tmp); // converts the sting to an integer
return i;
}

/* Destructor. Closes the connection if something bad happens. */
protected void finalize() throws Throwable {
if(isConnected) {
close();
}
super.finalize();
}
}