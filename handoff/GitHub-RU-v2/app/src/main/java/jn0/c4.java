package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 {
    public l4 a;
    public List b;

    public c4(l4 l4Var, List list) {
        this.a = l4Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return k71.k.b(this.a, c4Var.a) && k71.k.b(this.b, c4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Contexts(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
