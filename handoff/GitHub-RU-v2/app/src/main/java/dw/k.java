package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public List a;

    public k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Labels(nodes=", ")", this.a);
    }
}
