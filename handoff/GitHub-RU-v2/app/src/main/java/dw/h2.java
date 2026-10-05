package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h2 {
    public final List a;

    public h2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2) && k71.k.b(this.a, ((h2) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("RepositoryTopics(nodes=", ")", this.a);
    }
}
