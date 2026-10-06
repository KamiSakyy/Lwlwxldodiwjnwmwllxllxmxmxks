package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 {
    public k3 a;
    public List b;

    public l3(k3 k3Var, List list) {
        this.a = k3Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return k71.k.b(this.a, l3Var.a) && k71.k.b(this.b, l3Var.b);
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
