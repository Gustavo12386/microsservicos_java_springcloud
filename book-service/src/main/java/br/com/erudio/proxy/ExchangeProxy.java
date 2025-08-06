package br.com.erudio.proxy;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.erudio.dto.Exchange;


@FeignClient(name = "exchange-service")
public interface ExchangeProxy {

	@GetMapping(value = "/exchange-service/{amount}/{from}/{to}")
	public Exchange getExchange(@PathVariable("amount") Double amount,
			@PathVariable("from") String from,
			@PathVariable("to") String to);
		
	
}
