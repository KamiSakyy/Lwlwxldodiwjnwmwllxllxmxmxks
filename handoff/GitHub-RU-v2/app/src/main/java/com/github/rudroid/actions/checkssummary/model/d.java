package com.github.rudroid.actions.checkssummary.model;

import java.util.Comparator;
import sy.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class d<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return t.g(Integer.valueOf(((b) obj).ordinal()), Integer.valueOf(((b) obj2).ordinal()));
    }
}
