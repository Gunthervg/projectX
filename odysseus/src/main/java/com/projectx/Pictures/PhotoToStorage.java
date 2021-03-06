package com.projectx.Pictures;

import com.projectx.Pictures.Pictures;

import javax.swing.*;
import java.io.*;

/**
 * @author steve
 * @since 8/13/13
 */
public class PhotoToStorage {
    private boolean error=false;
    String empty="niks";

    /**
     * Will write the data to a text file for storage
     * @param picture
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public PhotoToStorage(Pictures picture) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(picture.getFile().getName());
        System.out.println(picture.getFileCity());
        error=new File("data.txt").exists();
        System.out.println(error);
        if(!picture.getFileLatitude().isEmpty()&&!picture.getFileLongitude().isEmpty()){
            try {
                FileWriter fstream=new FileWriter("data.txt",true);
                BufferedWriter out =new BufferedWriter(fstream);
                out.write(picture.getFile().getName()+"\n");
                out.write(picture.getFile().getPath()+"\n");
                out.write(picture.getFileCity()+"\n");
                out.write(picture.getFileLatitude()+"\n");
                out.write(picture.getFileLongitude()+"\n");
                if (picture.getFileStreet()!=null){
                    out.write(picture.getFileStreet()+"\n");
                }else{
                    out.write(empty+"\n");
                }
                if (picture.getFileNumberStreet()!=null){
                    out.write(picture.getFileNumberStreet()+"\n");
                }else{
                    out.write(empty+"\n");
                }
                out.close();
                JOptionPane.showMessageDialog(null,"A Picture has been added to your album");
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
}
