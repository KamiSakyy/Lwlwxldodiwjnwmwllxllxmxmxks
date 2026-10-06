package c90;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h0 {
    public String a;
    public String b;
    public boolean c;
    public c d;

    public d(String str, String str2, boolean z, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && k.b(this.d, dVar.d);
    }

    public final int hashCode() {
        int e = i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        c cVar = this.d;
        return e + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("ReviewRequestFields(__typename=", this.a, ", id=", this.b, ", asCodeOwner=");
        o.append(this.c);
        o.append(", requestedReviewer=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
