package dk.easv.publishers;

import dk.easv.observable.Subscribable;
import dk.easv.archive.Archive;

public class Publisher extends Subscribable {
    private final Archive archive = new Archive();

    public Archive getArchive() {
        return archive;
    }

    public void release(Newspaper newspaper)
    {
        archive.store(newspaper);
        notifySubscribers(newspaper);
    }

    public Newspaper getLatestIssue()
    {
        return archive.getLatestIssue();
    }
}
