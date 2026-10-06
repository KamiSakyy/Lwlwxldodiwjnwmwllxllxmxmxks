package ck0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final r e;

    public l(String str, String str2, boolean z, String str3, r rVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && k71.k.b(this.d, lVar.d) && k71.k.b(this.e, lVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        r rVar = this.e;
        return i + (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryProjectTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", project=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
