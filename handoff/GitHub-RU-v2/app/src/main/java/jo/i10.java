package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i10 {
    public int a;
    public List b;

    public i10(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return this.a == i10Var.a && k71.k.b(this.b, i10Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "LatestCommit(totalCount=", ", nodes=", ")", this.b);
    }
}
