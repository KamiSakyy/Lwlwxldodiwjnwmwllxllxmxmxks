package ea0;

import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final jc e;
    public final q f;
    public final Boolean g;
    public final ZonedDateTime h;
    public final x i;
    public final lc j;

    public r(String str, String str2, String str3, int i, jc jcVar, q qVar, Boolean bool, ZonedDateTime zonedDateTime, x xVar, lc lcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = jcVar;
        this.f = qVar;
        this.g = bool;
        this.h = zonedDateTime;
        this.i = xVar;
        this.j = lcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && this.d == rVar.d && this.e == rVar.e && k71.k.b(this.f, rVar.f) && k71.k.b(this.g, rVar.g) && k71.k.b(this.h, rVar.h) && k71.k.b(this.i, rVar.i) && this.j == rVar.j;
    }

    public final int hashCode() {
        int b = a0.s0.b(this.f.a, (this.e.hashCode() + a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31)) * 31, 31);
        Boolean bool = this.g;
        int hashCode = (this.i.hashCode() + com.github.rudroid.m0.a(this.h, (b + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31;
        lc lcVar = this.j;
        return hashCode + (lcVar != null ? lcVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(id=", this.a, ", url=", this.b, ", title=");
        a0.s0.w(this.d, this.c, ", number=", ", issueState=", o);
        o.append(this.e);
        o.append(", issueComments=");
        o.append(this.f);
        o.append(", isReadByViewer=");
        o.append(this.g);
        o.append(", createdAt=");
        o.append(this.h);
        o.append(", repository=");
        o.append(this.i);
        o.append(", stateReason=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
