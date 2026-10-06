package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow {
    public List a;

    public Object a0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0Shadow) && k71.k.b(this.a, ((a0Shadow) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Comments(nodes=", ")", this.a);
    }
}
