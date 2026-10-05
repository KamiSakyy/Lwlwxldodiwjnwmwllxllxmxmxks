package com.github.rudroid.pushnotifications.decryption;

import java.util.Comparator;
import java.util.Date;

/* loaded from: /home/user/work/p/classes.dex */
public final class j<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g((Date) ((w61.k) obj2).s, (Date) ((w61.k) obj).s);
    }
}
