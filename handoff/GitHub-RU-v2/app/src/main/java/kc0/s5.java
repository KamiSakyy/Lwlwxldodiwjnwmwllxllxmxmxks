package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 {
    public final e6 a;
    public final List b;

    public s5(e6 e6Var, List list) {
        this.a = e6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Commits(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
