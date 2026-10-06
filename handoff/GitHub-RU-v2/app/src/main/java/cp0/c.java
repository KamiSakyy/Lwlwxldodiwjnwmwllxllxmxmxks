package cp0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public String a;
    public String b;
    public String c;
    public a d;
    public b e;
    public g f;
    public kw0.a g;

    public c(String str, String str2, String str3, a aVar, b bVar, g gVar, kw0.a aVar2) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = bVar;
        this.f = gVar;
        this.g = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && k.b(this.f, cVar.f) && k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        a aVar = this.d;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        kw0.a aVar2 = this.g;
        return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("ActorFields(__typename=", this.a, ", login=", this.b, ", url=");
        o.append(this.c);
        o.append(", onBot=");
        o.append(this.d);
        o.append(", onUser=");
        o.append(this.e);
        o.append(", avatarFragment=");
        o.append(this.f);
        o.append(", nodeIdFragment=");
        return f1.e.n(o, this.g, ")");
    }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
