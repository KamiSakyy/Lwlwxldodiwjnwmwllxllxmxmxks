package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vq {
    public List a;

    public vq(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vq) && k71.k.b(this.a, ((vq) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("PinnedDiscussions(nodes=", ")", this.a);
    }
}
