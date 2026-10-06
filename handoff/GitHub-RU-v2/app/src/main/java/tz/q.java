package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public int b;
    public List c;

    public q(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && this.b == qVar.b && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(a0.s0.n(this.b, "Actors(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
}
