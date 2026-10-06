package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g20 {
    public final i20 a;
    public final List b;

    public g20(i20 i20Var, List list) {
        this.a = i20Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g20)) {
            return false;
        }
        g20 g20Var = (g20) obj;
        return k71.k.b(this.a, g20Var.a) && k71.k.b(this.b, g20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Labels(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
