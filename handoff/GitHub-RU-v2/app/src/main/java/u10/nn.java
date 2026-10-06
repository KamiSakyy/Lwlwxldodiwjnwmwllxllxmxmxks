package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nnShadow {
    public List a;

    public nn(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnShadow) && k71.k.b(this.a, ((nnShadow) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("ThreadsAndReplies(nodes=", ")", this.a);
    }
}
