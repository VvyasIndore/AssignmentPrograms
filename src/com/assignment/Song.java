package com.assignment;

//public class Song implements Comparable<Song>
public class Song
{
	private String title;
	private String artist;
	private int year;
	public Song(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}
	//@Override
	// if the current object is lesser than specified object it gives negative valuee
	
	//System.out.println("a".compareTo("x"))  a is coming before x so it gives negative value
	//System.out.println("d".compareTo("a")) d is coming after a so it gives possitive value
	//System.out.println("d".compareTo("d")) d is equal to d so it gives Zero value
	
	//public int compareTo(Song anotherSong) 
	//{
		//if(this.getYear()>anotherSong.getYear())
		//{
		//	return +1; // we can give any positive value
		//}
		
		//if(this.getYear()< anotherSong.getYear())
		//{
		//	return -1;
		//}
		//return 0;
		
		// it will gives natural sorting
		
		//return this.getTitle().compareTo(anotherSong.getTitle());
		
		// if we write minus befor than it will sort in desc order
		
		//return - this.getTitle().compareTo(anotherSong.getTitle());
		
		
	//}
	
	
}
