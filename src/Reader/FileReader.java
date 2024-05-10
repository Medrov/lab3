package Reader;

import Model.Reactor;

import java.io.File;
import java.util.ArrayList;

public abstract class FileReader {
    public FileReader nextReader;
    public void setNextReader(FileReader nextReader){
        this.nextReader = nextReader;
    }
    public abstract ArrayList<Reactor> read(File file);

}
