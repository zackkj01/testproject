package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.PhoneDAO;
import com.spring.demo.model.Phone;

@Service

public class PhoneServiceImpl implements PhoneService {
	@Autowired
	private PhoneDAO phoneDAO;

	public void setPhoneDAO(PhoneDAO phoneDAO) {
		this.phoneDAO = phoneDAO;
	}

	@Transactional
	public void addPhone(Phone p) {
		this.phoneDAO.addPhone(p);
	}

	@Transactional
	public void updatePhone(Phone p) {
		this.phoneDAO.updatePhone(p);
	}

	@Transactional
	public List<Phone> listPhones() {
		return this.phoneDAO.listPhones();
	}

	@Transactional
	public Phone getPhoneById(int id) {
		return this.phoneDAO.getPhoneById(id);
	}

	@Transactional
	public void removePhone(int id) {
		this.phoneDAO.removePhone(id);
	}
}
