package com.designPatterns.chainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongtuo on 2017/7/18.
 */
public class FilterChain implements Filter {

    private List<Filter> filters;
    private  int index;

    public FilterChain(){
        filters=new ArrayList<>();
        index=0;
    }
    public FilterChain addFilter(Filter filter){
        filters.add(filter);
        return this;
    }
    public void removeFilter(Filter filter){
        filters.remove(filter);
    }
    @Override
    public void doFilter(Request req, Response res, Filter chain) {
        if(index==filters.size()){
            return;
        }else{
            Filter filter=filters.get(index++);
            filter.doFilter(req,res,chain);
        }
    }
}
