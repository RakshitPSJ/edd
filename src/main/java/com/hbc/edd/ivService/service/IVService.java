package com.hbc.edd.ivService.service;

import com.hbc.edd.ivService.model.Lines;
import com.hbc.edd.ivService.model.NetAvailabilityRequest;

import java.io.IOException;

public interface IVService {

    Lines getNetworkAvailabilityForItem(NetAvailabilityRequest netAvailabilityRequest) throws IOException;


}
