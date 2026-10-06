package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u9 {
    public w9 a;
    public List b;

    public u9(w9 w9Var, List list) {
        this.a = w9Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return k71.k.b(this.a, u9Var.a) && k71.k.b(this.b, u9Var.b);
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
