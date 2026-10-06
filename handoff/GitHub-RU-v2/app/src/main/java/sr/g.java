package sr;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public String b;
    public String c;
    public e d;
    public boolean e;

    public g(String str, String str2, String str3, e eVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = eVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository1(__typename=", this.a, ", id=", this.b, ", name=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", isPrivate=");
        return f4Shadow.s(o, this.e, ")");
    }
}
