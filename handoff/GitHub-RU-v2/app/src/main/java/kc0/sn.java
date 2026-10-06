package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sn {
    public int a;
    public List b;

    public sn(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        sn snVar = (sn) obj;
        return this.a == snVar.a && k71.k.b(this.b, snVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Commits(totalCount=", ", nodes=", ")", this.b);
    }
}
