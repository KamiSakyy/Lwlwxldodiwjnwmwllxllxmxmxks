package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m50 {
    public k50 a;
    public List b;

    public m50(k50 k50Var, List list) {
        this.a = k50Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return k71.k.b(this.a, m50Var.a) && k71.k.b(this.b, m50Var.b);
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
