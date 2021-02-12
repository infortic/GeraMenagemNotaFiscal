package com.com.gerador_de_observacao;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import com.gerador_de_observacao.DTO.ComposicaoDTO;
import com.gerador_de_observacao.builds.ComposicaoBuilder;
import com.gerador_de_observacao.service.Service;

@RunWith(SpringRunner.class)

public class GeradorDeObservacaoTeste {
	
	@Autowired
	private Service services;
	
	
	public void getObservacaoComValorTotalNota() {
		
		ComposicaoDTO composicao = ComposicaoBuilder.getInstace()
				.codigoComposicao(12L)
				.codigoItem(21L)
				.descricaoComposicao("Martelo")
				.quantidadeComposicao("1")
				.tipoItem("Bater")
				.valorUnitario("23,20")
				.build(); 
		
		List<ComposicaoDTO> compoaicaoList = new ArrayList<ComposicaoDTO>();
		compoaicaoList.add(composicao);
		compoaicaoList.add(composicao);
		String retorno = services.geraObservacao(compoaicaoList, true);
		Assertions.assertThat(retorno.contains("Total"));
	}

	public void getObservacaoSemValorTotalNota() {
		
		ComposicaoDTO composicao = ComposicaoBuilder.getInstace()
				.codigoComposicao(12L)
				.codigoItem(21L)
				.descricaoComposicao("Martelo")
				.quantidadeComposicao("1")
				.tipoItem("Bater")
				.valorUnitario("23,20")
				.build(); 
		
		List<ComposicaoDTO> compoaicaoList = new ArrayList<ComposicaoDTO>();
		compoaicaoList.add(composicao);
		compoaicaoList.add(composicao);
		String retorno = services.geraObservacao(compoaicaoList, false);
		Assertions.assertThat(!retorno.contains("Total"));
	}
}
