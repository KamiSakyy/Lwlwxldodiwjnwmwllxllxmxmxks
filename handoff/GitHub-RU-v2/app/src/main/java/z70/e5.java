package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e5 {
    public List a;

    public e5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5) && k71.k.b(this.a, ((e5) obj).a);
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
