package com.fis.spring.qrcode;

import java.util.UUID;

/**
 * 用一句话描述这个类的作用
 * @author XiaoLu.Su 
 * @Date Oct 17, 2019
 */
public class QRCodeGenerator {
    private static final String QR_CODE_IMAGE_PATH = ".png";

    public static void main(String[] args) {
        QrCodeUtil.generateQrCodeAndSave("This is my first QR Code", "png", 350, 350, UUID.randomUUID().toString().replace("-", "").substring(0,31)+QR_CODE_IMAGE_PATH);
    }
}