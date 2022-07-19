import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu OptionMenu = new OptionMenu();
		introduction();
		OptionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome");
	}
}
