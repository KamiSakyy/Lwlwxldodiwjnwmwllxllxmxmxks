package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hk {
    public List a;

    public hk(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk) && k71.k.b(this.a, ((hk) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("MentionableUsers(nodes=", ")", this.a);
    }
}
