package com.bs.practice.list.music.model.vo;

import java.util.Objects;

import com.bs.practice.list.library.model.vo.Book;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + "-" + title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	

	
	@Override
	public int compareTo(Music o) {
		return o.getSinger().compareTo(this.getSinger());
	}
	
	
	
	
	
}
