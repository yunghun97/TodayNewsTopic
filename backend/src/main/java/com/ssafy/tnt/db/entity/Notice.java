package com.ssafy.tnt.db.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="notice")
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="notice_no")
	private int no;
	@Column(name="notice_title")
	private String title;
	@Column(name="notice_writer")
	private String writer;
	@Column(name="notice_content")
	private String content;
	@Column(name="notice_date")	
	private LocalDateTime date;
	
	
	@Builder
	public Notice(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@PrePersist
	public void createdAt(){
		this.date = LocalDateTime.now();
	}

	public Notice(int no, String title, String writer, String content, LocalDateTime date) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.date = date;
	}
}