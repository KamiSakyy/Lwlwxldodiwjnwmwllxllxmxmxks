package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wg0 {
    public final vg0 a;
    public final List b;

    public wg0(vg0 vg0Var, List list) {
        this.a = vg0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        return k71.k.b(this.a, wg0Var.a) && k71.k.b(this.b, wg0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
