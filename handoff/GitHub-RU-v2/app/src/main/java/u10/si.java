package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class si {
    public final List a;

    public si(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si) && k71.k.b(this.a, ((si) obj).a);
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
