package com.Utilidades;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;

public class AES256Utilities
{
    private static String algorit = "AES";
    private static String cifra = "AES/ECB/PKCS5Padding";
    private static byte[] key;

    private static Cipher cipher;
    private static SecretKeySpec secretKey;

    public static void setKey(String secret)
    {
        try
        {
            key = secret.getBytes("UTF-8");
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, algorit);

        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }


    public static void setCipher()
    {
        try
        {
            cipher = Cipher.getInstance(cifra);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String encripta(String textCifra)
    {
        String encripted ="";

        try
        {
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            encripted = Base64.getEncoder().encodeToString(cipher.doFinal(textCifra.getBytes("UTF-8")));
        }
        catch (InvalidKeyException e)
        {
            e.printStackTrace();
        } catch (BadPaddingException e)
        {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e)
        {
            e.printStackTrace();
        }

        return encripted;
    }

    public static String desencripta(String textDesenc)
    {
        String desenc = "";

        try
        {
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            desenc = new String(cipher.doFinal(Base64.getDecoder().decode(textDesenc)));
        }
        catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException e)
        {
            e.printStackTrace();
        }
        return desenc;
    }

    public static void main(String[] args)
    {

        //String token = "sIYphQHsMUY=";
        String token = "576ab1c2b7f646508daa0448661d779c";
        //String token1 = UUID.randomUUID().toString().replace("-", "");
        String desecBase = "KiWtFzIb5gFCU4H0cotzBQ==", desenc = "", encript1 = "hola mundo", strEncript = "", strDesencript = "";
        //desenc = new String(Base64.getDecoder().decode(token));
        setKey(token);
        setCipher();

        strEncript = encripta(encript1);
        strDesencript = desencripta(strEncript);

        System.out.println(token);
        //System.out.println(desenc);
        System.out.println(strEncript);
        System.out.println(strDesencript);


    }
}