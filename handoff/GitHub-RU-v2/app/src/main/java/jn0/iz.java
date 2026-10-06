package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iz {
    public int a;
    public List b;

    public iz(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz)) {
            return false;
        }
        iz izVar = (iz) obj;
        return this.a == izVar.a && k71.k.b(this.b, izVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "LatestCommit(totalCount=", ", nodes=", ")", this.b);
    }
}
