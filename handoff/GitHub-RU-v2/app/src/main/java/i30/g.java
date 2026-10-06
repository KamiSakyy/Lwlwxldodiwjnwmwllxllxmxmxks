package i30;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final int b;
    public final List c;

    public g(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && this.b == gVar.b && k71.k.b(this.c, gVar.c);
    }

    public final int hashCode() {
        int b = s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(s0.n(this.b, "Assignees(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
}
