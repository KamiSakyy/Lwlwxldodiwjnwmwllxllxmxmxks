package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n00 {
    public final List a;

    public n00(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n00) && k71.k.b(this.a, ((n00) obj).a);
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
