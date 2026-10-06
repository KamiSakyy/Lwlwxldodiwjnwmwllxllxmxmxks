package lv;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final String b;
    public final l c;
    public final k d;
    public final eq.g e;

    public g(String str, String str2, l lVar, k kVar, eq.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = lVar;
        this.d = kVar;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        l lVar = this.c;
        int hashCode = (i + (lVar == null ? 0 : lVar.a.hashCode())) * 31;
        k kVar = this.d;
        return this.e.hashCode() + ((hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Author(__typename=", this.a, ", login=", this.b, ", onUser=");
        o.append(this.c);
        o.append(", onBot=");
        o.append(this.d);
        o.append(", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
