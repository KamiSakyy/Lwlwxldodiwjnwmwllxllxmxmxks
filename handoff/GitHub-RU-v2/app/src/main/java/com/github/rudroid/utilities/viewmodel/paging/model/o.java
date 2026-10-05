package com.github.rudroid.utilities.viewmodel.paging.model;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o<T> {
    public final List a;
    public final boolean b;

    public o(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && this.b == oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PagedData(data=" + this.a + ", hasNextPage=" + this.b + ")";
    }
}
