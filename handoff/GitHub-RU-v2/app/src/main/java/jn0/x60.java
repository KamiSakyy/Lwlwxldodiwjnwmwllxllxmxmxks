package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x60 {
    public w60 a;
    public List b;

    public x60(w60 w60Var, List list) {
        this.a = w60Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj;
        return k71.k.b(this.a, x60Var.a) && k71.k.b(this.b, x60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TopRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
