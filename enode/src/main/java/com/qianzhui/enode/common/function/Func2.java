package com.qianzhui.enode.common.function;

/**
 * Created by junbo_xu on 2016/3/3.
 */
public interface Func2<T1, T2, TResult> {
    TResult apply(T1 obj1, T2 obj2) throws Exception;
}
