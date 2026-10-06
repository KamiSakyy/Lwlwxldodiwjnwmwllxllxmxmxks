package com.github.rudroid.common;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f9248a;

    /* renamed from: b, reason: collision with root package name */
    public int f9249b;

    public b0(int i, List list) {
        this.f9248a = list;
        this.f9249b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f9248a.equals(b0Var.f9248a) && this.f9249b == b0Var.f9249b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9249b) + (this.f9248a.hashCode() * 31);
    }

    public final String toString() {
        return "PartialList(subset=" + this.f9248a + ", totalCount=" + this.f9249b + ")";
    }
}
