package Reader;

import Model.Reactor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class JSONReader extends FileReader {

    @Override
    public ArrayList<Reactor> read(File file) {
        ArrayList<Reactor> list;
        if ("json".equals(FilenameUtils.getExtension(file.getAbsolutePath()))) {
            try {
                list = readJSON(file);
                for (Reactor reactor : list) {
                    reactor.setFileType("JSON");
                }
                return list;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (nextReader != null) {
            return nextReader.read(file);
        }
        return null;
    }

    public ArrayList<Reactor> readJSON(File file) throws FileNotFoundException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            ArrayList<Reactor> list = mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Reactor.class));
            return list;
        } catch (MismatchedInputException e) {
            // Обработка ошибки десериализации, например вывод сообщения пользователю
            System.out.println("Ошибка формата JSON файла!");
            return null;
        }
    }
}
