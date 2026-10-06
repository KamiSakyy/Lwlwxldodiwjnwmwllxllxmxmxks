package ct;

import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.h0 {
    public String a;
    public String b;
    public b c;
    public int d;
    public wi e;
    public yi f;
    public String g;

    public c(String str, String str2, b bVar, int i, wi wiVar, yi yiVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = i;
        this.e = wiVar;
        this.f = yiVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && k71.k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + a0.s0.b(this.d, (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31)) * 31;
        yi yiVar = this.f;
        return this.g.hashCode() + ((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DuplicateOfFragment(id=", this.a, ", title=", this.b, ", repository=");
        o.append(this.c);
        o.append(", number=");
        o.append(this.d);
        o.append(", state=");
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", __typename=");
        return h1.p(o, this.g, ")");
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
    public static final Object k = null;
}
