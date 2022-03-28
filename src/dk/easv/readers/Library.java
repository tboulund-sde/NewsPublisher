package dk.easv.readers;

import dk.easv.publishers.Publisher;

public class Library extends Reader {
    public Library(String name, Publisher publisher) {
        super(name, publisher);
    }
}