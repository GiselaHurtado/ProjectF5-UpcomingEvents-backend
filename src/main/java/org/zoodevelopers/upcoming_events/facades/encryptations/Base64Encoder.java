package org.zoodevelopers.upcoming_events.facades.encryptations;

import java.util.Base64;

import org.springframework.stereotype.Component;
import org.zoodevelopers.upcoming_events.implementations.IEncoder;

@Component
public class Base64Encoder implements IEncoder {

    @Override
    public String encode(String data) {
        String dataEncoded = Base64.getEncoder().encodeToString(data.getBytes());
        return dataEncoded;
    }

    public String decode(String data) {
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        String dataDecoded = new String(decodedBytes);
        return dataDecoded;
    }

}
