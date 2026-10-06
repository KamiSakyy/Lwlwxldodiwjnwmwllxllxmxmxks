package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements a {
    public String a;
    public String b;
    public boolean c;
    public String d;

    public h(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "term");
        k71.k.g(str2, "name");
        k71.k.g(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return m0.l(s0.o("SearchShortcutQueryTerm(term=", this.a, ", name=", this.b, ", negative="), this.c, ", value=", this.d, ")");
    }
}
