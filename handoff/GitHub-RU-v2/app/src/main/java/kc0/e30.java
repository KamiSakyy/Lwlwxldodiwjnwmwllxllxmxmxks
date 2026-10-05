package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e30 {
    public final d30 a;
    public final List b;

    public e30(d30 d30Var, List list) {
        this.a = d30Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return k71.k.b(this.a, e30Var.a) && k71.k.b(this.b, e30Var.b);
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
