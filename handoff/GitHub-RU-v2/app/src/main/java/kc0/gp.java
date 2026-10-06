package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gp {
    public fp a;
    public List b;

    public gp(fp fpVar, List list) {
        this.a = fpVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return k71.k.b(this.a, gpVar.a) && k71.k.b(this.b, gpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Reactions(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
