package com.github.rudroid.searchandfilter.complexfilter.milestone;

import java.util.Comparator;
import sy.t;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return t.g(((v2) obj).getName(), ((v2) obj2).getName());
    }

}
