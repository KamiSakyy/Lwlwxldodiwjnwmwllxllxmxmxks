package eh0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gn0.xc;
import gn0.zc;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public String b;
    public int c;
    public String d;
    public xc e;
    public zc f;

    public c(int i, xc xcVar, zc zcVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = xcVar;
        this.f = zcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && this.c == cVar.c && k.b(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31;
        zc zcVar = this.f;
        return hashCode + (zcVar == null ? 0 : zcVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", number=");
        x.i.r(this.c, ", title=", this.d, ", issueState=", o);
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
