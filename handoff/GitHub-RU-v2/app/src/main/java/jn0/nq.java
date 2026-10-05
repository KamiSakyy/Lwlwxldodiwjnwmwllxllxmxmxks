package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nq {
    public final int a;
    public final List b;

    public nq(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        return this.a == nqVar.a && k71.k.b(this.b, nqVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Created(issueCount=", ", nodes=", ")", this.b);
    }
}
