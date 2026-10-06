package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f7 {
    public final List a;

    public f7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7) && k71.k.b(this.a, ((f7) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("Shortcuts(edges=", ")", this.a);
    }
}
