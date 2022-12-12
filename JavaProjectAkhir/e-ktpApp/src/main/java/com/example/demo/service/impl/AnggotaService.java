package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddAnggota;
import com.example.demo.repository.IAnggotaRepository;
import com.example.demo.service.IAnggotaService;

@Service
public class AnggotaService  implements IAnggotaService {

	@Autowired
	IAnggotaRepository anggotaRepository;

	@Override
	public AddAnggota insertAddAnggota(AddAnggota addanggota) {
		// TODO Auto-generated method stub
		return addanggotaRepository.insertAddAnggota(addanggota);
	}

	@Override
	public List<AddAnggota> getAllAddAnggota() {
		// TODO Auto-generated method stub
		return addanggotaRepository.getAllAddAnggota();
	}

	@Override
	public AddAnggota updateAddAnggota(int id, AddAnggota addanggota) {
		// TODO Auto-generated method stub
		return addanggotaRepository.updateAddAnggota(id, addanggota);
	}

	@Override
	public AddAnggota deleteAddAnggota(int id) {
		// TODO Auto-generated method stub
		return addanggotaRepository.deleteAddAnggota(id);
	}

//	@Override
//	public AddAnggota getStudent(int id) {
//		// TODO Auto-generated method stub
//		return addanggotaRepository.getStudent(id);
//	}


	
}
