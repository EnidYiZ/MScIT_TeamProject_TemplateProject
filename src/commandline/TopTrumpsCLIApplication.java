package commandline;

import java.io.IOException;
import java.util.Scanner;

/**
 * Top Trumps command line application
 */
public class TopTrumpsCLIApplication {

	/**
	 * This main method is called by TopTrumps.java when the user specifies that they want to run in
	 * command line mode. The contents of args[0] is whether we should write game logs to a file.
 	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		boolean writeGameLogsToFile = false; // Should we write game logs to file?
		if (args[0].equalsIgnoreCase("true")) writeGameLogsToFile=true; // Command line selection
		
		// State
		boolean userWantsToQuit = false; // flag to check whether the user wants to quit the application
		
		// Loop until the user wants to exit the game
		while (!userWantsToQuit) {

			// ----------------------------------------------------
			// Add your game logic here based on the requirements
			// ----------------------------------------------------
//			TopTrumpModel model=new TopTrumpModel(writeGameLogsToFile);
//			TopTrumpView view=new TopTrumpView(model);
//			TopTrumpController controller=new TopTrumpController(model,view.jd);
//			view.setPrintstream(System.out);
//			view.setSc(new Scanner(System.in));
//			controller.game();
//			model.printDeck();
//			view.closeSc();
			userWantsToQuit=true; // use this when the user wants to exit the game
			
		}


	}

}
