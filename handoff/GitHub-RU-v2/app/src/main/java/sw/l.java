package sw;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public r e;

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
        StringBuilder o = s0.o("OnSearchShortcutQueryRepoTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", repository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
