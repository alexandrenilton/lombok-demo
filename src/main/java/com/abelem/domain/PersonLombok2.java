package com.abelem.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor /*cria construtor sem argumentos*/
@AllArgsConstructor /*cria construtor com todos os membros como argumento */
@RequiredArgsConstructor /*cria o construtor com todos que tiverem @NonNull marcado */
//@EqualsAndHashCode(exclude = {"community"})
@EqualsAndHashCode(of = {"firstname", "lastname", "bornDate"})
//@ToString(of = {"id", "firstname", "lastname", "community", "bornDate"})
@ToString
public class PersonLombok2 {
	//@Id /*Em casos de Id, onde so usamos o getter, podemos setar para o setter ser private*/
	@Getter private Long Id;
	@Setter @Getter @NonNull private String firstname;
	@Setter @Getter @NonNull private String lastname;
	@Setter @Getter @NonNull private String community;
	@Setter @Getter @NonNull private LocalDate bornDate;
}
