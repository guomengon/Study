package com.zhangke.imageloader.policy;

import com.zhangke.imageloader.request.BitmapRequest;

/**
 * 倒序加载策略
 * Created by Administrator on 2017/2/6 0006.
 */

public class ReversePolicy implements LoadPolicy {


    @Override
    public int compareto(BitmapRequest request1, BitmapRequest request2) {
        return request2.getSerialNo() - request1.getSerialNo();
    }
}
