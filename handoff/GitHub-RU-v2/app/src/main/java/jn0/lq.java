package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lq {
    public int a;
    public List b;

    public lq(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        return this.a == lqVar.a && k71.k.b(this.b, lqVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Assigned(issueCount=", ", nodes=", ")", this.b);
    }
}
