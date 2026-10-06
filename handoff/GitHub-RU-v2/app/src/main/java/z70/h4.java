package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 {
    public final int a;
    public final List b;

    public h4(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return this.a == h4Var.a && k71.k.b(this.b, h4Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return jo.f4.i(this.a, "Contexts(totalCount=", ", nodes=", ")", this.b);
    }
}
