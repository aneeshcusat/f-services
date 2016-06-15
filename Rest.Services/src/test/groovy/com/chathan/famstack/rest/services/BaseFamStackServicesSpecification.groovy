package com.chathan.famstack.rest.services;
import spock.lang.Specification;

class BaseFamStackServicesSpecification extends Specification{

	BaseFamStackServices testObj
	
	def setup() {
		testObj = new BaseFamStackServices()
	}

}
