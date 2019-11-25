package com.strongdm.api.v1.plumbing;

import java.util.Iterator;
import java.util.function.Supplier;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class PageIterator<T> implements Iterator<T> {
    private List<T> page;
    private int index;
    private boolean hasNextPage;

    private final Supplier<PageResult<T>> pageFetcher;

    public PageIterator(Supplier<PageResult<T>> pageFetcher) {
        // initialize cursor
        this.page = new ArrayList<T>();
        this.pageFetcher = pageFetcher;
        this.hasNextPage = true;
    }

    // Checks if the next element exists
    public boolean hasNext() {
        this.fetchNextPageIfNecessary();
        return this.index < this.page.size();
    }

    // moves the cursor/iterator to next element
    public T next() {
        this.fetchNextPageIfNecessary();

        if (this.index < this.page.size()) {
            T gotten = this.page.get(this.index);  
            this.index++;
            return gotten;
        }

        throw new NoSuchElementException();
    }

    private void fetchNextPageIfNecessary() {
        if (this.index < this.page.size()) {
            return;
        }

        if (!this.hasNextPage) {
            return;
        }

        PageResult<T> pageResult = this.pageFetcher.get();
        this.index = 0;
        this.hasNextPage = pageResult.hasNextPage();
        this.page = pageResult.getPage();
    }
}
