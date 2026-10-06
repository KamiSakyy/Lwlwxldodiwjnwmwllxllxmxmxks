package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class du {
    public String a;
    public String b;
    public wt c;
    public ZonedDateTime d;
    public ZonedDateTime e;
    public String f;
    public ju.a g;

    public du(String str, String str2, wt wtVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str3, ju.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = wtVar;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str3;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du)) {
            return false;
        }
        du duVar = (du) obj;
        return k71.k.b(this.a, duVar.a) && k71.k.b(this.b, duVar.b) && k71.k.b(this.c, duVar.c) && k71.k.b(this.d, duVar.d) && k71.k.b(this.e, duVar.e) && k71.k.b(this.f, duVar.f) && k71.k.b(this.g, duVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        wt wtVar = this.c;
        int a = com.github.rudroid.m0.a(this.d, (i + (wtVar == null ? 0 : wtVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastEditedAt=");
        f4.A(", body=", this.f, ", minimizableCommentFragment=", o, this.e);
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
