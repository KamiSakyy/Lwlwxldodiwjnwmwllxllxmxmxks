package ud0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public String a;
    public String b;
    public String c;
    public c d;
    public bl0.a e;

    public a(String str, String str2, String str3, c cVar, bl0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        bl0.a aVar = this.e;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("ActorFields(__typename=", this.a, ", login=", this.b, ", url=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return f4.q(o, this.e, ")");
    }
    public Object O(Object p1) { return null; }
}
