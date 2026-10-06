package fw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1Shadow {
    public List a;

    public Object f1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1Shadow) && k71.k.b(this.a, ((f1Shadow) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Achievements(nodes=", ")", this.a);
    }
}
