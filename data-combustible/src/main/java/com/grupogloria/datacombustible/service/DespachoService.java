package com.grupogloria.datacombustible.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupogloria.datacombustible.model.Despacho;
import com.grupogloria.datacombustible.repository.DespachoRepository;

@Service
public class DespachoService implements IDespachoService{

	@Autowired
	private DespachoRepository despachoRepository;
	
	@Override
	public List<Despacho> getDespacho() {
		List<Despacho> list = new ArrayList<>();
		despachoRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
}
