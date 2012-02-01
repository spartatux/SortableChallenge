package org.sortable.challenge;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface Parser<P> {
    public ArrayList<P> getAll() throws FileNotFoundException,IOException ;
}
