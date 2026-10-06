package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class is {
    public final String a;
    public final String b;
    public final String c;
    public final qs d;
    public final String e;
    public final String f;
    public final ZonedDateTime g;

    public is(String str, String str2, String str3, qs qsVar, String str4, String str5, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qsVar;
        this.e = str4;
        this.f = str5;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is)) {
            return false;
        }
        is isVar = (is) obj;
        return k71.k.b(this.a, isVar.a) && k71.k.b(this.b, isVar.b) && k71.k.b(this.c, isVar.c) && k71.k.b(this.d, isVar.d) && k71.k.b(this.e, isVar.e) && k71.k.b(this.f, isVar.f) && k71.k.b(this.g, isVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        qs qsVar = this.d;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (qsVar == null ? 0 : Boolean.hashCode(qsVar.a))) * 31, this.e, 31), this.f, 31);
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
