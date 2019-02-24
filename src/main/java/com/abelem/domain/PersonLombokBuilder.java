package com.abelem.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
public class PersonLombokBuilder {
	private Long id;
	@Getter @Setter private String firstname;
	private String lastname;
	private String bornDate;
	private String community;
}
