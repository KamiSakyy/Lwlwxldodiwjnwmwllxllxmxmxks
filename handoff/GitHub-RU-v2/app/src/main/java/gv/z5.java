package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z5 {
    public final List a;

    public z5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z5) && k71.k.b(this.a, ((z5) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("ReviewRequests(nodes=", ")", this.a);
    }
}
