package br.com.fiap.soat8.grp14.techchallenge.adapter.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDTO {

    private Long id;
    private String email;
    private String nome;
    private String senha;

}
