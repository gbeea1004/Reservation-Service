package domain;

import java.io.InputStream;

public class Resource {
    private String description;
    private File file;
    private String filename;
    private InputStream inputStream;
    private boolean open;
    private boolean readable;
    private URI uri;
    private URL url;
}
