package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v70 {
    public final t70 a;
    public final List b;

    public v70(t70 t70Var, List list) {
        this.a = t70Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return k71.k.b(this.a, v70Var.a) && k71.k.b(this.b, v70Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "StarredRepositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
