package com.strongdm.api.v1.plumbing;

import java.util.Iterator;
import java.util.function.Supplier;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class PageIterator<T> implements Iterator<T> {
    private List<T> page ;
    private int index;
    private boolean hasNextPage;

    private final Supplier<PageResult<T>> pageFetcher;

    public PageIterator(Supplier<PageResult<T>> pageFetcher) {
        // initialize cursor
        this.pageFetcher = pageFetcher;
        this.pageFetch();
    }

    // Checks if the next element exists
    public boolean hasNext() {
        return this.index < this.page.size() - 1 || this.hasNextPage;
    }

    // moves the cursor/iterator to next element
    public T next() {
        // TODO: remove this eventually
        // System.out.printf(">>> iterator.next: index=%d hasNextPage=%b\n", this.index, this.hasNextPage);
        if (this.index < this.page.size() - 1) {
            this.index++;
            return this.page.get(this.index);
        }

        // reached end
        if (!this.hasNextPage) {
            throw new NoSuchElementException();
        }

        pageFetch();
        if (this.page.isEmpty()) {
           throw new NoSuchElementException();
        }
        return this.page.get(this.index);
    }

    private void pageFetch() {
        this.index = 0;
        PageResult<T> pageResult = this.pageFetcher.get();
        this.hasNextPage = pageResult.hasNextPage();
        this.page = pageResult.getPage();
    }
}
