package dk.easv.archive;

import dk.easv.iterator.IIterableCollection;
import dk.easv.iterator.IIterator;
import dk.easv.publishers.Article;
import dk.easv.publishers.Newspaper;

import java.util.List;
import java.util.Stack;

public class Archive implements IIterableCollection {

    private final Stack<Newspaper> papers = new Stack<>();
    private final Stack<Article> articles = new Stack<>();

    public void store(Newspaper paper)
    {
        papers.push(paper);
        articles.addAll(List.of(paper.getArticles()));
    }

    public Newspaper getLatestIssue()
    {
        return papers.peek();
    }

    @Override
    public IIterator createIterator() {
        return new NewestFirstArticleIterator(this);
    }

    public Stack<Article> getArticles() {
        return articles;
    }
}
