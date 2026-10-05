package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u1 {
    public final List a;

    public u1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && k71.k.b(this.a, ((u1) obj).a);
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
