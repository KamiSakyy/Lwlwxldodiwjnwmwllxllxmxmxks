package ck0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final a e;

    public h(String str, String str2, boolean z, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e);
    }

    public final int hashCode() {
        int i = h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        a aVar = this.e;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnSearchShortcutQueryCategoryTerm(term=", this.a, ", name=", this.b, ", negative=");
        com.github.rudroid.m0.z(o, this.c, ", value=", this.d, ", discussionCategory=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
