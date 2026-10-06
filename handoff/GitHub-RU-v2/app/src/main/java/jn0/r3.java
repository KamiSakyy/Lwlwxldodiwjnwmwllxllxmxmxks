package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 {
    public q3 a;
    public List b;

    public r3(q3 q3Var, List list) {
        this.a = q3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return k71.k.b(this.a, r3Var.a) && k71.k.b(this.b, r3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SavedReplies(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
