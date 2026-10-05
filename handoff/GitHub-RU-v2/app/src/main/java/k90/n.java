package k90;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public n(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && this.c == nVar.c && k71.k.b(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.l(s0.o("OnSearchShortcutQueryTerm(term=", this.a, ", name=", this.b, ", negative="), this.c, ", value=", this.d, ")");
    }
}
