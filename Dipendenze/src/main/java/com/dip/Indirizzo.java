package com.dip;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Component
public class Indirizzo {
	 private String via;
	 private Integer ncivico;
}
