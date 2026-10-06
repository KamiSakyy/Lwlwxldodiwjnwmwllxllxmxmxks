package com.github.rudroid.searchandfilter.complexfilter.label;

import java.util.Comparator;
import sy.tShadow;
import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return tShadow.g(((k2) obj).getName(), ((k2) obj2).getName());
    }

}
