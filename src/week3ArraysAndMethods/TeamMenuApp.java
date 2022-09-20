package week3ArraysAndMethods;

import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	
	public static void main(String[] args) {
		String[] team = new String[5];

		int decision = 0;
		
		while (decision != -1) {
			//topdown approach, writing what methods are supposed to be used and write the actual methods after
			showMenu();
			decision = s.nextInt();
			
			if (decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option.");
			} else if (decision == 1) {
				showTeam(team);
			} else if (decision == 2) {
				showTeamMember(team);
			} else if (decision == 3) {
				addTeamMember(team);
			} else if (decision == 4) {
				deleteTeamMember(team);
			} else {
				deleteAllTeamMembers(team);	
			}
		}
	}
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Members");
	}

	public static void showTeam(String[] team) {
		System.out.println("Team:");
		/*for (String member : team) {
			System.out.println(member);*/ //this would print out just the member, if you want to know what index the member is at, use the trad for loop
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + " " + team[i]);
		}
	}
	
	public static void showTeamMember(String[] team) {
		System.out.println("Which team member would you like to see? 1,2,3, etc.");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + ": " + team[teamNumber]);
		}
	}
	
	public static void addTeamMember(String[] team) {
		System.out.print("Please enter new member name: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
			team[addingIndex++] = newMember;
		}
	}
	
	public static boolean isValid(int input) {
		if (input < 5 && input >= 0) {
			return true;
		} else {
			System.out.println("Invalid entry. Please select another team member.");
			return false;
		}
	}
	
	public static void deleteTeamMember(String[] team) {
		System.out.print("Choose a team member to delete: ");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}
	}
	
	public static void deleteAllTeamMembers(String [] team) {
		System.out.print("Are you sure you want to delete your team? (y or n)");
		String confirmation = s.next();
			if (confirmation.toLowerCase().equals("y")) {
				for (int i = 0; i < team.length; i++) { 
					team[i] = null;
				}
			} else {
				System.out.println("Select another option.");
			}
	}
}
