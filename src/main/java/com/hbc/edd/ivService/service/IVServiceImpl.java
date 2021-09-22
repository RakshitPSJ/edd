package com.hbc.edd.ivService.service;

import com.hbc.edd.ivService.model.Lines;
import com.hbc.edd.ivService.model.NetAvailabilityRequest;
import com.hbc.edd.ivService.service.IVService;
import com.squareup.okhttp.*;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class IVServiceImpl implements IVService {
    @Override
    public Lines getNetworkAvailabilityForItem(NetAvailabilityRequest netAvailabilityRequest) throws IOException {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse(netAvailabilityRequest.toString());
        RequestBody body = RequestBody.create(mediaType, "REPLACE_REQUEST_BODY");
        Request request = new Request.Builder()
                .url("https://api.watsoncommerce.ibm.com/inventory/REPLACE_TENANTID/v1/availability/network")
                .post(body)
                .addHeader("Authorization", "REPLACE_THIS_VALUE")
                .addHeader("content-type", "application/json")
                .addHeader("accept", "application/json")
                .build();

        Response response = client.newCall(request).execute();
        return null;
    }
}
