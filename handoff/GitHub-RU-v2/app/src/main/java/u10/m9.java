package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m9 {
    public o9 a;
    public List b;

    public m9(o9 o9Var, List list) {
        this.a = o9Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return k71.k.b(this.a, m9Var.a) && k71.k.b(this.b, m9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DiscussionCategories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
