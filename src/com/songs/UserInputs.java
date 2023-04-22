package com.songs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Subash
 * @see User will Play the Songs & Add into Recent PlayLists
 *
 */

public class UserInputs {

	String songOne = "";
	String songTwo = "";
	String songThree = "";
	String songFour = "";

	ArrayList<String> user1 = new ArrayList<String>();
	Scanner songInput = new Scanner(System.in);

	public void inputSongs() {

		System.out.println("enter first song name");
		songOne = songInput.nextLine();
		System.out.println("enter second song name");
		songTwo = songInput.nextLine();
		System.out.println("enter third song name");
		songThree = songInput.nextLine();
		System.out.println("enter fourth song name");
		songFour = songInput.nextLine();

		user1.add(songOne);
		user1.add(songTwo);
		user1.add(songThree);

		System.out.println(user1.size());

	}

	public void userPlaylist() {

		Map<String, ArrayList<String>> addSongs = new LinkedHashMap<String, ArrayList<String>>();

		addSongs.put("User1", user1);

		if (user1.size() <= 3) {

			user1.add(songFour);
			user1.remove(songOne);
		}

		System.out.println(addSongs);

		System.out.println("enter song name");
		songFour = songInput.nextLine();

		if (user1.size() <= 3) {

			user1.add(songFour);
			user1.remove(songTwo);
		}

		System.out.println(addSongs);

		System.out.println("enter song name");
		songFour = songInput.nextLine();

		if (user1.size() <= 3) {

			user1.add(songFour);
			user1.remove(songThree);

		}
		System.out.println(addSongs);

	}

}
