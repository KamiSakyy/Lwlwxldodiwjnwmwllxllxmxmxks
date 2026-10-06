package ch;

import a0.s0;
import com.github.rudroid.copilot.h1;
import d2.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final long a;
    public final long b;
    public final long c;

    public g(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.c(this.a, gVar.a) && t.c(this.b, gVar.b) && t.c(this.c, gVar.c);
    }

    public final int hashCode() {
        int i = t.l;
        return Long.hashCode(this.c) + x.i.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String i = t.i(this.a);
        String i2 = t.i(this.b);
        return h1.p(s0.o("MarkdownTableColors(headerBackground=", i, ", evenRowBackground=", i2, ", oddRowBackground="), t.i(this.c), ")");
    }
}
