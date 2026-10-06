package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fs {
    public String a;
    public String b;
    public yr c;
    public ZonedDateTime d;
    public ZonedDateTime e;
    public String f;
    public at0.a g;

    public fs(String str, String str2, yr yrVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str3, at0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = yrVar;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str3;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return k71.k.b(this.a, fsVar.a) && k71.k.b(this.b, fsVar.b) && k71.k.b(this.c, fsVar.c) && k71.k.b(this.d, fsVar.d) && k71.k.b(this.e, fsVar.e) && k71.k.b(this.f, fsVar.f) && k71.k.b(this.g, fsVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        yr yrVar = this.c;
        int a = com.github.rudroid.m0.a(this.d, (i + (yrVar == null ? 0 : yrVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastEditedAt=");
        jo.f4Shadow.A(", body=", this.f, ", minimizableCommentFragment=", o, this.e);
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
