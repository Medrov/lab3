package Reader;

import Model.Reactor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;


public class YAMLReader extends FileReader {

    @Override
    public ArrayList<Reactor> read(File file) {
        ArrayList<Reactor> list;
        if ("yaml".equals(FilenameUtils.getExtension(file.getAbsolutePath()))) {
            try {
                list = readYAML(file);
                for (Reactor reactor : list) {
                    reactor.setFileType("YAML");
                }
                return list;
            } catch (IOException e) {
                System.out.println("на ямле баг");
            }
        } else if (nextReader != null) {
            return nextReader.read(file);
        }
        return null;
    }

    public ArrayList<Reactor> readYAML(File file) throws FileNotFoundException {
        Map<String, Reactor> map = null;
        try {
            map = (new YAMLMapper()).readValue(file, new TypeReference<Map<String, Reactor>>() {
            });
        } catch (IOException ex) {
            Logger.getLogger(YAMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Reactor> list = new ArrayList<>(map.values());
        return list;
    }
}
