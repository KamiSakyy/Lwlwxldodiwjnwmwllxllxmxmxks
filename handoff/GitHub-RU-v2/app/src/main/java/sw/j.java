package sw;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final c e;

    public j(String str, String str2, boolean z, String str3, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && this.c == jVar.c && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        c cVar = this.e;
        return i + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryLoginRefTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", loginRef=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
