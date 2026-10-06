package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n70 {
    public final l70 a;
    public final List b;

    public n70(l70 l70Var, List list) {
        this.a = l70Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n70)) {
            return false;
        }
        n70 n70Var = (n70) obj;
        return k71.k.b(this.a, n70Var.a) && k71.k.b(this.b, n70Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SponsorshipsAsSponsor(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
