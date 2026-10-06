package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nv {
    public final mv a;
    public final List b;

    public nv(mv mvVar, List list) {
        this.a = mvVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        return k71.k.b(this.a, nvVar.a) && k71.k.b(this.b, nvVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Refs(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
