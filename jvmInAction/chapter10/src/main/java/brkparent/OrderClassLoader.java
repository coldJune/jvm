package brkparent;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class OrderClassLoader extends ClassLoader {
    private String fileNmae;

    public OrderClassLoader(String fileNmae) {
        this.fileNmae = fileNmae;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class re = findClass(name);
        if(re == null){
            System.out.println("i can't load the class:"+name+" need help from parent");
            return super.loadClass(name,resolve);
        }
        return re;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = this.findLoadedClass(name);
        if(clazz == null){
            try {
                String classFile = getClassFile(name);
                FileInputStream fis = new FileInputStream(classFile);
                FileChannel fileChannel = fis.getChannel();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                WritableByteChannel writableByteChannel = Channels.newChannel(byteArrayOutputStream);
                ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
                while (true){
                    int i = fileChannel.read(buffer);
                    if(i==0 || i==-1){
                        break;
                    }
                    buffer.flip();
                    writableByteChannel.write(buffer);
                    buffer.clear();
                }
                fis.close();
                byte[] bytes = byteArrayOutputStream.toByteArray();
                clazz = defineClass(name,bytes,0,bytes.length);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return clazz;
    }



    private String getClassFile(String name){
        StringBuffer sb = new StringBuffer(fileNmae);
        name = name.replace(".", File.separator) +".class";
        sb.append(File.separator+name);
        return sb.toString();
    }
}
