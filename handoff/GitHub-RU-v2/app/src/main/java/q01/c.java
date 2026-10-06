package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import yz0.k2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements a {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public k2 e;

    public c(String str, String str2, boolean z, String str3, k2 k2Var) {
        k71.k.g(str, "term");
        k71.k.g(str2, "name");
        k71.k.g(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = k2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && this.c == cVar.c && k71.k.b(this.d, cVar.d) && k71.k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SearchShortcutQueryLabelTerm(term=", this.a, ", name=", this.b, ", negative=");
        m0.z(o, this.c, ", value=", this.d, ", label=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
