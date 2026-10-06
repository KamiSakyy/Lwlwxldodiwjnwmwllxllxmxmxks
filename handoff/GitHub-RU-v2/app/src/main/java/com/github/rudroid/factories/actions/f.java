package com.github.rudroid.factories.actions;

import java.io.File;
import java.util.Comparator;
import sy.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class f<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return t.g(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }
    public Object b() { return null; }
}
