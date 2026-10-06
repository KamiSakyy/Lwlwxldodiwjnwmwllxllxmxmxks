package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l80 {
    public final List a;

    public l80(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l80) && k71.k.b(this.a, ((l80) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("UpdateUserDashboardNavLinks(navLinks=", ")", this.a);
    }
}
