package com.medicamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicamento.entity.Medicamento;
import com.medicamento.service.MedicamentoService;

@RestController
@RequestMapping("/Actividad01/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	
	@GetMapping
	@ResponseBody
	
	public ResponseEntity<List<Medicamento>>listaMedicamento(){
		List<Medicamento> lista=service.listaMedicamento();
		return ResponseEntity.ok(lista);
		
	}
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento>InsertaMedicamento(@RequestBody Medicamento obj){
		Medicamento objMedicamento=service.insertaActualizaMedicamento(obj);
		return ResponseEntity.ok(objMedicamento);
	}
}
