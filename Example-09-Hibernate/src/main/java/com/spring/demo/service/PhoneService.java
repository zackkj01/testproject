package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Phone;

public interface PhoneService {

	public void addPhone(Phone p);

	public void updatePhone(Phone p);

	public List<Phone> listPhones();

	public Phone getPhoneById(int id);

	public void removePhone(int id);
}
