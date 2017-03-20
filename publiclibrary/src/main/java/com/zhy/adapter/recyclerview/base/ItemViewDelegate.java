package com.zhy.adapter.recyclerview.base;


/**
 * Created by zhy on 16/6/22.
 */
public interface ItemViewDelegate<T>
{
    //获得子条目的LayoutID
    int getItemViewLayoutId();


    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}
