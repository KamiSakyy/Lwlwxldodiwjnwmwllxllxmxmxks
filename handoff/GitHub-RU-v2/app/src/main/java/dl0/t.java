package dl0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public final String a;
    public final int b;
    public final List c;

    public t(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && this.b == tVar.b && k71.k.b(this.c, tVar.c);
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
