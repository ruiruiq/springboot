import org.apache.avro.Schema;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.specific.SpecificDatumWriter;
import org.junit.Test;
import pojo.User;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.IOException;

public class SerialDemo {

    @Test
    public void create(){
        User u1 = new User(50);
        System.out.println(u1);
    }
    @Test
    public void serial() throws IOException {
        User u1 = new User(22);
        DatumWriter<User> dw =
                new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dfw = new DataFileWriter<User>(dw);
        dfw.create(User.SCHEMA$,new File("C:\\Users\\lenovo\\Desktop\\user.data"));
        dfw.append(u1);
        dfw.close();
    }

}

