package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wj0 {
    public xj0 a;
    public List b;

    public wj0(xj0 xj0Var, List list) {
        this.a = xj0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj0)) {
            return false;
        }
        wj0 wj0Var = (wj0) obj;
        return k71.k.b(this.a, wj0Var.a) && k71.k.b(this.b, wj0Var.b);
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
