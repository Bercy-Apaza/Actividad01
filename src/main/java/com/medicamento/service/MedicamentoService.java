package com.medicamento.service;

import java.util.List;

import com.medicamento.entity.Medicamento;

public interface MedicamentoService {
	
	public Medicamento insertaActualizaMedicamento(Medicamento obj);
	public List<Medicamento> listaMedicamento();

}
