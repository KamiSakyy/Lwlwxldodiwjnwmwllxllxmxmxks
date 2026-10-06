package k90;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final t e;

    public m(String str, String str2, boolean z, String str3, t tVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && this.c == mVar.c && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        t tVar = this.e;
        return i + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryRepoTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", repository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
