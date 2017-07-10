package com.pnp.biz.entity.actor;

import com.pnp.biz.entity.communication.Address;
import com.pnp.biz.entity.communication.Contact;

public class Actor {

	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String businessName;
	private ActorTypeEnum actorType;
	private Contact contact;
	private Address address;
}
