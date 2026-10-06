package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g4 {
    public int a;
    public List b;

    public g4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.a == g4Var.a && k71.k.b(this.b, g4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "RequiredStatusChecks(totalCount=", ", nodes=", ")", this.b);
    }
}
