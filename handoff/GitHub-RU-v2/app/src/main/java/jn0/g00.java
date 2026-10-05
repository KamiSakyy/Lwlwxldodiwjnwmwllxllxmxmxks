package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g00 {
    public final i00 a;
    public final List b;

    public g00(i00 i00Var, List list) {
        this.a = i00Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g00)) {
            return false;
        }
        g00 g00Var = (g00) obj;
        return k71.k.b(this.a, g00Var.a) && k71.k.b(this.b, g00Var.b);
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
