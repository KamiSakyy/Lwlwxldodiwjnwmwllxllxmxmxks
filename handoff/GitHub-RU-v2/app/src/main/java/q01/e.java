package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import yz0.v2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final v2 e;

    public e(String str, String str2, boolean z, String str3, v2 v2Var) {
        k71.k.g(str, "term");
        k71.k.g(str2, "name");
        k71.k.g(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = v2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && this.c == eVar.c && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SearchShortcutQueryMilestoneTerm(term=", this.a, ", name=", this.b, ", negative=");
        m0.z(o, this.c, ", value=", this.d, ", milestone=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
