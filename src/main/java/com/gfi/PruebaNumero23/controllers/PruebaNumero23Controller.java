package com.gfi.PruebaNumero23.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;


import com.gfi.PruebaNumero23.dto.PruebaNumero23Dto;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/undefined")
@Api(value="undefined", description="undefined repository")
public class PruebaNumero23Controller {


	@ApiOperation(value = "get undefined")
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public PruebaNumero23Dto getExample(@PathVariable("id") String id) {
	//TODO: PENDIENTE IMPLEMENTACION DESARROLLO		
		log.debug("ejemplo log con slf4j");

		PruebaNumero23Dto dtoExample = new PruebaNumero23Dto();
		return dtoExample;
	}

}
