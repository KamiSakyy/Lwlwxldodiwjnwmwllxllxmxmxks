package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 {
    public int a;
    public List b;

    public d3(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.a == d3Var.a && k71.k.b(this.b, d3Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Mentions(totalCount=", ", nodes=", ")", this.b);
    }
}
