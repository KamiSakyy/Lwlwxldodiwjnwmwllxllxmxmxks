package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r4 {
    public final String a;
    public final int b;
    public final List c;

    public r4(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.a, r4Var.a) && this.b == r4Var.b && k71.k.b(this.c, r4Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(a0.s0.n(this.b, "Commits(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
}
