package com.github.rudroid.utilities;

import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g(Integer.valueOf((int) (((g3.p0) obj).a >> 32)), Integer.valueOf((int) (((g3.p0) obj2).a >> 32)));
    }
}
