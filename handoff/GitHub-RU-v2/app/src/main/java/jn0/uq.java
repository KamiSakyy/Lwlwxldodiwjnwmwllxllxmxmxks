package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uq {
    public int a;
    public List b;

    public uq(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return this.a == uqVar.a && k71.k.b(this.b, uqVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Requested(issueCount=", ", nodes=", ")", this.b);
    }
}
