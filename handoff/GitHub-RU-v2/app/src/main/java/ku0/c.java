package ku0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public d d;
    public boolean e;

    public c(String str, String str2, String str3, d dVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("CommitRepository(__typename=", this.a, ", id=", this.b, ", name=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", isPrivate=");
        return f4.s(o, this.e, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
