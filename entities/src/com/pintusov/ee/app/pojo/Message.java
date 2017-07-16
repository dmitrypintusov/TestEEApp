package com.pintusov.ee.app.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Project name: TestEEApp
 * Created by Дмитрий
 * Date: 16.07.2017.
 */

@Entity
@Table(name = "MESSAGE")
@NamedQueries( {
		@NamedQuery(
				name = "findMessages",
				query = "select m from Message m"
		),
		@NamedQuery(
				name = "deleteMessages",
				query = "delete from Message"
		)
})
public class Message implements Serializable {

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "MESSAGE")
	private String messageString;

	public Message () {}

	public Message (String id, String messageString) {
		this.id = id;
		this.messageString = messageString;
	}

	public String getId() {
		return this.id;
	}

	public String getMessageString() {
		return this.messageString;
	}
}
