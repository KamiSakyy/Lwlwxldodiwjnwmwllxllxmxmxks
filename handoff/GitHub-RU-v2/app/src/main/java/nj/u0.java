package nj;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public final LinkedHashMap a;
    public final int b;
    public final boolean c;
    public final Integer d;

    public u0(LinkedHashMap linkedHashMap, int i, boolean z, Integer num) {
        this.a = linkedHashMap;
        this.b = i;
        this.c = z;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && this.b == u0Var.b && this.c == u0Var.c && k71.k.b(this.d, u0Var.d);
    }

    public final int hashCode() {
        int e = x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        Integer num = this.d;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Entry(events=" + this.a + ", nextPageToFetch=" + this.b + ", hasFinishedBackfill=" + this.c + ", serverTotal=" + this.d + ")";
    }
}
