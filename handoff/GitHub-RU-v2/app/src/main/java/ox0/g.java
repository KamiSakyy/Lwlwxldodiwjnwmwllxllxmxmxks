package ox0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final i0 a;
    public final List b;

    public g(i0 i0Var, List list) {
        this.a = i0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "NotificationThreads(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
