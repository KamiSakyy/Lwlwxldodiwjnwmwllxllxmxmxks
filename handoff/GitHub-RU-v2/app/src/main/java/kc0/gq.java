package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gq {
    public String a;
    public String b;
    public String c;
    public oq d;
    public String e;
    public String f;
    public ZonedDateTime g;

    public gq(String str, String str2, String str3, oq oqVar, String str4, String str5, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = oqVar;
        this.e = str4;
        this.f = str5;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        return k71.k.b(this.a, gqVar.a) && k71.k.b(this.b, gqVar.b) && k71.k.b(this.c, gqVar.c) && k71.k.b(this.d, gqVar.d) && k71.k.b(this.e, gqVar.e) && k71.k.b(this.f, gqVar.f) && k71.k.b(this.g, gqVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        oq oqVar = this.d;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (oqVar == null ? 0 : Boolean.hashCode(oqVar.a))) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCommit(id=", this.a, ", oid=", this.b, ", abbreviatedOid=");
        o.append(this.c);
        o.append(", signature=");
        o.append(this.d);
        o.append(", message=");
        f1.e.x(o, this.e, ", messageBodyHTML=", this.f, ", authoredDate=");
        return com.github.rudroid.copilot.h1.q(o, this.g, ")");
    }

    public Object e;
}
