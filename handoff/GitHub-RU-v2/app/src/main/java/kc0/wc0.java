package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wc0 {
    public vc0 a;
    public List b;

    public wc0(vc0 vc0Var, List list) {
        this.a = vc0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0Var = (wc0) obj;
        return k71.k.b(this.a, wc0Var.a) && k71.k.b(this.b, wc0Var.b);
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
