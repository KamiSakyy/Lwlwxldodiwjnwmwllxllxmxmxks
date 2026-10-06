package fb0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public g0 a;
    public List b;

    public g(g0 g0Var, List list) {
        this.a = g0Var;
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
