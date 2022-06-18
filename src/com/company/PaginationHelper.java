package com.company;

import java.util.List;

public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;


    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;

    }


    public int itemCount() {
        if (collection.isEmpty()) {
            return -1;
        }
        return collection.size();
    }

    public int pageCount() {
        double value = (double) collection.size() / itemsPerPage;
        return (int) Math.ceil(value);
    }

    public int pageItemCount(int pageIndex) {
        var indexCollection = pageCount() - 1;
        if (pageIndex > pageCount()) {
            return -1;
        }
        if (indexCollection < pageIndex) {
            return -1;
        }
        if (pageIndex == indexCollection) {
            if (indexCollection % itemsPerPage == 0) {
                return itemsPerPage;
            }
            return pageCount() % itemsPerPage;
        } else {
            return itemsPerPage;
        }
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemCount() < itemIndex) {
            return -1;
        }
        if(itemIndex != 0) {
            itemIndex--;
        }
        return (itemIndex / itemsPerPage);
    }



}
