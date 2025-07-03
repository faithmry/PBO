public class CommandWords {
    private static final String[] validCommands = {
            "go", "quit", "help", "look", "splash", "back"
    };

    public CommandWords() {
    }

    public boolean isCommand(String aString) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    public String showAll() {
        String commandString = "";
        for (String command : validCommands) {
            commandString += (command);
        }
        return commandString;
    }
}