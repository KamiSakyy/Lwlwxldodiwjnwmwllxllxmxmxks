package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public s0 a;
    public List b;

    public t0(s0 s0Var, List list) {
        this.a = s0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Patches(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
