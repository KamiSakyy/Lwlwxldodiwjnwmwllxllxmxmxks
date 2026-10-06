package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oa0 {
    public pa0 a;
    public List b;

    public oa0(pa0 pa0Var, List list) {
        this.a = pa0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return k71.k.b(this.a, oa0Var.a) && k71.k.b(this.b, oa0Var.b);
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
