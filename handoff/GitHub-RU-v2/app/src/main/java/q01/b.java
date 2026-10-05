package q01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements a {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final b01.e e;

    public b(String str, String str2, boolean z, String str3, b01.e eVar) {
        k71.k.g(str, "term");
        k71.k.g(str2, "name");
        k71.k.g(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && this.c == bVar.c && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SearchShortcutQueryCategoryTerm(term=", this.a, ", name=", this.b, ", negative=");
        m0.z(o, this.c, ", value=", this.d, ", category=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
