package com.assignment;

import java.util.*;
public class MP4 {

	public static void main(String[] args) 
	{
	
		Song song1 = new Song("Love me like you do","michael",2014);
		Song song2 = new Song("Call some body","justein",2008);
		Song song3 = new Song("Asking to have","ladygaga",2085);
		Song song4 = new Song("Safert","sichael",2001);
		
		List<Song> musicList = new ArrayList<>();
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		
		for(Song songs:musicList)
		{
			System.out.println(songs);
		}
		
		//Collections.sort(musicList);// this sort mehod works with comparable interface
		
		//SortByYearComparator sortbyyearcomparator = new SortByYearComparator(); // we create comparator object
		
		SortByArtistComparator sortByArtistComparator = new SortByArtistComparator();
		
		Collections.sort(musicList, sortByArtistComparator.reversed()); // it will desc order sorting
		
		System.out.println();
		
		for(Song songs:musicList)
		{
			System.out.println(songs);
		}
		
	}

}
