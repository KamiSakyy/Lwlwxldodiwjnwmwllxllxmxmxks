package gw;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;
    public String b;
    public String c;
    public a d;
    public boolean e;

    public b(String str, String str2, String str3, a aVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository(__typename=", this.a, ", id=", this.b, ", name=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", isPrivate=");
        return f4Shadow.s(o, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
