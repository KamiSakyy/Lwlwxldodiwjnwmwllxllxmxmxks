package sr;

import a0.s0;
import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final int b;
    public final String c;
    public final wi d;
    public final h e;
    public final b f;
    public final yi g;
    public final String h;

    public c(String str, int i, String str2, wi wiVar, h hVar, b bVar, yi yiVar, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = wiVar;
        this.e = hVar;
        this.f = bVar;
        this.g = yiVar;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && k71.k.b(this.c, cVar.c) && this.d == cVar.d && k71.k.b(this.e, cVar.e) && k71.k.b(this.f, cVar.f) && this.g == cVar.g && k71.k.b(this.h, cVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31)) * 31;
        b bVar = this.f;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        yi yiVar = this.g;
        return this.h.hashCode() + ((hashCode2 + (yiVar != null ? yiVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "OnIssue(__typename=", this.a, ", number=", ", title=");
        n.append(this.c);
        n.append(", issueState=");
        n.append(this.d);
        n.append(", repository=");
        n.append(this.e);
        n.append(", duplicateOf=");
        n.append(this.f);
        n.append(", stateReason=");
        n.append(this.g);
        n.append(", id=");
        n.append(this.h);
        n.append(")");
        return n.toString();
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
