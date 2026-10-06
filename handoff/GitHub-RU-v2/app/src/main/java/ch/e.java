package ch;

import a0.s0;
import d2.t;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public long a;
    public long b;
    public long c;
    public g d;
    public d e;

    public e(long j, long j2, long j3, g gVar, d dVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = gVar;
        this.e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.a, eVar.a) && t.c(this.b, eVar.b) && t.c(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        int i = t.l;
        return this.e.hashCode() + ((this.d.hashCode() + x.i.c(x.i.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        String i = t.i(this.a);
        String i2 = t.i(this.b);
        String i3 = t.i(this.c);
        StringBuilder o = s0.o("MarkdownColors(link=", i, ", mentionTokenText=", i2, ", mentionTokenBackground=");
        o.append(i3);
        o.append(", table=");
        o.append(this.d);
        o.append(", backtick=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
