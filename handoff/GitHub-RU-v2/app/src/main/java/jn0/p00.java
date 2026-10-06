package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p00 {
    public final List a;

    public p00(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p00) && k71.k.b(this.a, ((p00) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Refs(nodes=", ")", this.a);
    }
}
