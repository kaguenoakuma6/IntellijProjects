package com.Utilidades;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.UUID;

public class HMAC_SHA256_B64
{
    public static void main(String[] args)
    {
        try
        {
            String token = UUID.randomUUID().toString().replace("-", "");
            String messag = "Encriptado";

            Mac sha256_hmac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(token.getBytes(), "HmacSHA256");
            sha256_hmac.init(secretKeySpec);

            String hash = Base64.getEncoder().encodeToString(sha256_hmac.doFinal(messag.getBytes()));

            System.out.println("HmacSHA256: " + sha256_hmac.doFinal(messag.getBytes()).toString());
            System.out.println("Token: " + token);
            System.out.println("Hash: " + hash );

        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
    }
}
