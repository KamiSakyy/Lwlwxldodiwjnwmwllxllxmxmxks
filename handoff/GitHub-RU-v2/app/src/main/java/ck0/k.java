package ck0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final d e;

    public k(String str, String str2, boolean z, String str3, d dVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        d dVar = this.e;
        return i + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryMilestoneTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", milestone=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
