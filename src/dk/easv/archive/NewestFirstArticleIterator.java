package dk.easv.archive;

import dk.easv.iterator.IIterator;
import dk.easv.publishers.Article;

import java.util.Stack;

public class NewestFirstArticleIterator implements IIterator {

    private Stack<Article> collection;
    private int state = 0;

    public NewestFirstArticleIterator(Archive archive)
    {
        this.collection = archive.getArticles();
    }

    @Override
    public Object getNext() {
        return collection.get(state++);
    }

    @Override
    public boolean hasMore() {
        return state != collection.size();
    }
}
