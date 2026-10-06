package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 {
    public final List a;

    public y3(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y3) && k71.k.b(this.a, ((y3) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Lists(nodes=", ")", this.a);
    }
}
