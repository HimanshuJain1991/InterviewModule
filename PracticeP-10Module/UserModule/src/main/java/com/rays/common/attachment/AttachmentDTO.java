package com.rays.common.attachment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ATTACHMENT_DEMO")
public class AttachmentDTO extends BaseDTO {

	@Column(name = "NAME", length = 20)
	private String name;
	@Column(name = "TYPE", length = 20)
	private String type;
	@Column(name = "DESCRIPTION", length = 20)
	private String description;
	@Column(name = "USER_ID")
	private Long userId = null;

	@Lob
	@Column(name = "DOC")
	private byte[] doc;

	public AttachmentDTO() {
		// TODO Auto-generated constructor stub
	}

	public AttachmentDTO(MultipartFile file) {
		name = file.getOriginalFilename();
		type = file.getContentType();
		try {
			doc = file.getBytes();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public byte[] getDoc() {
		return doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return name;
	}

}
