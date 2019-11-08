package com.strongdm.api.v1.plumbing;

import java.util.List;
import java.util.ArrayList;

public class PageResult<T> {
    private final List<T> page;
    public List<T> getPage() {
        return this.page;
    }

    private final boolean hasNextPage;
    public boolean hasNextPage() {
        return this.hasNextPage;
    }

    public PageResult(List<T> page, boolean hasNextPage) {
        this.page = page;
        this.hasNextPage = hasNextPage;
    }
}