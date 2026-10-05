package wc0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 {
    public final int a;
    public final List b;

    public b2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.a == b2Var.a && k71.k.b(this.b, b2Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return f4.i(this.a, "Runs(totalCount=", ", nodes=", ")", this.b);
    }
}
