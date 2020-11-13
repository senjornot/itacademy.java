package senjornot;

public class Main {

    // public static void main(String[] args) {
	// write your code here
    // }

    private static void displayHelp() {
        System.out.println("version - Display program version.");
        System.out.println("about - Display developer info.");
        System.out.println("help - Display list of terminal commands.");
        System.exit(0);
    }

    private static void displayVersion() {
        System.out.println("1.0.1");
        System.exit(0);
    }

    private static void displayAbout() {
        System.out.println("Ilya Ivanov");
        System.out.println("ivanov.stavadm@gmail.com");
        System.exit(0);
    }

    private static void displayWelcome() {
        System.out.println("** WELCOME TO TASK MANAGER **");
    }

    static void run(final String[] args) {
        if (args == null) return;
        if (args.length < 1) return;
        final String param = args[0];
        if (CMD_HELP.equals(param)) displayHelp();
        if (CMD_VERSION.equals(param)) displayVersion();
        if (CMD_ABOUT.equals(param)) displayAbout();
    }

    public static void main(final String[] args) {
        displayWelcome();
        run(args);
    }

    public final class TerminalConst {

        public static final String CMD_HELP = "help";
        public static final String CMD_VERSION = "version";
        public static final String CMD_ABOUT = "about";
    }
}