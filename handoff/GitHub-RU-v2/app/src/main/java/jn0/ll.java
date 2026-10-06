package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ll {
    public List a;

    public ll(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll) && k71.k.b(this.a, ((ll) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MentionableItems1(nodes=", ")", this.a);
    }
}
