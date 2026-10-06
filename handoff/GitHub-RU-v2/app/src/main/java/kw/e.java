package kw;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final d d;

    public e(String str, String str2, boolean z, d dVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && this.c == eVar.c && k.b(this.d, eVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        d dVar = this.d;
        return e + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("ReviewRequestFields(__typename=", this.a, ", id=", this.b, ", asCodeOwner=");
        o.append(this.c);
        o.append(", requestedReviewer=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
