package com.grupogloria.datacombustible.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.grupogloria.datacombustible.model.Despacho;
import com.grupogloria.datacombustible.repository.DespachoRepository;
import com.grupogloria.datacombustible.service.IDespachoService;

import io.spring.guides.gs_producing_web_service.DespachoInfo;
import io.spring.guides.gs_producing_web_service.GetDespachoResponse;

@Endpoint
public class DespachoEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	private IDespachoService despachoService;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDespachoRequest")
	@ResponsePayload
	public GetDespachoResponse getDespacho() {
				
		
		GetDespachoResponse response = new GetDespachoResponse();
		List<DespachoInfo> despachoInfoList = new ArrayList<>();
		List<Despacho> despachoList = despachoService.getDespacho();
		for (int i = 0; i < despachoList.size(); i++) {
		     DespachoInfo ob = new DespachoInfo();
		     BeanUtils.copyProperties(despachoList.get(i), ob);
		     despachoInfoList.add(ob);    
		}
		response.getDespachoInfo().addAll(despachoInfoList);
		return response;	
		
	}
}
