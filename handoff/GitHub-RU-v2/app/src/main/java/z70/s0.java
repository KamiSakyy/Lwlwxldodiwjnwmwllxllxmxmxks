package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public r0 a;
    public List b;

    public s0(r0 r0Var, List list) {
        this.a = r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b);
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
