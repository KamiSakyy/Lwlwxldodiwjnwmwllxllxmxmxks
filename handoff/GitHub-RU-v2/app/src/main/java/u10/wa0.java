package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wa0 {
    public final va0 a;
    public final List b;

    public wa0(va0 va0Var, List list) {
        this.a = va0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return k71.k.b(this.a, wa0Var.a) && k71.k.b(this.b, wa0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
