import javax.swing.JOptionPane;

public class Project0 { 
    public static void main (String[] args){

        // Infinite loop to keep asking the user for input
        while (true) {
            // Prompt the user for a sentence, or to type "Stop" to quit
            String sentenceInput = JOptionPane.showInputDialog("Enter a sentence or 'Stop' to quit");
            
            // Variables to count the occurrences of 'E' and 'e'
            int uppercaseECount = 0, lowercaseECount = 0;

            // Print the entered sentence (optional)
            System.out.println(sentenceInput);

            // If the user enters "Stop" (case-insensitive), exit the loop
            if (sentenceInput.equalsIgnoreCase("Stop")) break;

            // Loop through each character in the sentence
            for (int charIndex = 0; charIndex < sentenceInput.length(); charIndex++) {
                char currentLetter = sentenceInput.charAt(charIndex);  // Get the current character

                // Check if the character is 'e' or 'E' and update counters
                if (currentLetter == 'e') {
                    lowercaseECount++;
                } else if (currentLetter == 'E') {
                    uppercaseECount++;
                }
            }

            // Create a message to show the count of 'E' and 'e'
            String resultSummary = "# of uppercase 'E' is: " + uppercaseECount + 
                                   " \n# of lowercase 'e' is: " + lowercaseECount;

            // Display the result in a dialog box
            JOptionPane.showMessageDialog(null, resultSummary);
        }
    }
}
