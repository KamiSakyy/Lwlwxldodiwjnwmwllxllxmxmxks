package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 {
    public final f5 a;
    public final List b;

    public a5(f5 f5Var, List list) {
        this.a = f5Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return k71.k.b(this.a, a5Var.a) && k71.k.b(this.b, a5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "CodeSearch(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
