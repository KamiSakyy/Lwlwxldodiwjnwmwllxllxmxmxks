package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wm {
    public vm a;
    public List b;

    public wm(vm vmVar, List list) {
        this.a = vmVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return k71.k.b(this.a, wmVar.a) && k71.k.b(this.b, wmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Teams(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
