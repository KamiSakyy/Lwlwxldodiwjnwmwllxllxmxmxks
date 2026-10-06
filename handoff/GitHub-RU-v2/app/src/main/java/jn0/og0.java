package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class og0 {
    public pg0 a;
    public List b;

    public og0(pg0 pg0Var, List list) {
        this.a = pg0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        og0 og0Var = (og0) obj;
        return k71.k.b(this.a, og0Var.a) && k71.k.b(this.b, og0Var.b);
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
