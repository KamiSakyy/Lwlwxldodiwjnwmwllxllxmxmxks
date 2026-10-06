package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oc0 {
    public final pc0 a;
    public final List b;

    public oc0(pc0 pc0Var, List list) {
        this.a = pc0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc0)) {
            return false;
        }
        oc0 oc0Var = (oc0) obj;
        return k71.k.b(this.a, oc0Var.a) && k71.k.b(this.b, oc0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Organizations(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
