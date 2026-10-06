package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 {
    public int a;
    public List b;

    public a5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return this.a == a5Var.a && k71.k.b(this.b, a5Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4Shadow.i(this.a, "Repositories(totalCount=", ", nodes=", ")", this.b);
    }
}
