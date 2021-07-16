package com.anita.decorator.file;


public class EncryptionDecorator extends DataSourceDecorator {

    private String secretKey;

    public EncryptionDecorator(DataSource dataSource,String secretkey) {

        super(dataSource);
        this.secretKey = secretkey;
    }
    @Override
    public void writeData(String data) {
    try{
        dataSource.writeData(Aesenc.encrypt(data,secretKey));


    }catch (Exception ex){
            System.out.println("Error Encrypting the file");

        }

    }

    @Override
    public String readData() {
        try{
           return Aesenc.decrypt(dataSource.readData(),secretKey);
        }catch (Exception ex){
            System.out.println("Error Decrypting the file");
            return "";
        }

    }
}
