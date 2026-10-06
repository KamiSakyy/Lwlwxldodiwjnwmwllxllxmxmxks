package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m6 {
    public t6 a;
    public List b;

    public m6(t6 t6Var, List list) {
        this.a = t6Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return k71.k.b(this.a, m6Var.a) && k71.k.b(this.b, m6Var.b);
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
