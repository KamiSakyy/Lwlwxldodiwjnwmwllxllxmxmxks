package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g10 {
    public final f10 a;
    public final List b;

    public g10(f10 f10Var, List list) {
        this.a = f10Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj;
        return k71.k.b(this.a, g10Var.a) && k71.k.b(this.b, g10Var.b);
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
