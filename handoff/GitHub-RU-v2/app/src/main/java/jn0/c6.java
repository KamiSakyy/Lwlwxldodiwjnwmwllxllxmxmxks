package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 {
    public final j6 a;
    public final List b;

    public c6(j6 j6Var, List list) {
        this.a = j6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return k71.k.b(this.a, c6Var.a) && k71.k.b(this.b, c6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "History(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
