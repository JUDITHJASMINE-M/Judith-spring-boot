package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.UserRegistration;
import com.example.demo.repository.RegRepository;

@Service
public class RegistrationServicesIml implements RegistrationServices {
	
	@Autowired
	private RegRepository reg;

	
	@Override
	public List<UserRegistration> getAlldata() {
		// TODO Auto-generated method stub
		return reg.findAll();
	}

	@Override
	public UserRegistration getoneRec(Long id) {
		// TODO Auto-generated method stub
		return reg.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	       reg.deleteById(id);
	}

	@Override
	public UserRegistration update(Long id, UserRegistration userreg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRegistration insertDate(@RequestBody UserRegistration  registration) {
		// TODO Auto-generated method stub
		return reg.save(registration);
	}

}
