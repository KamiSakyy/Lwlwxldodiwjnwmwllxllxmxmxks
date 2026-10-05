package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 {
    public final List a;

    public l4(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4) && k71.k.b(this.a, ((l4) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("LatestReviews(nodes=", ")", this.a);
    }
}
