package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dq {
    public final String a;
    public final String b;
    public final wp c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final String f;
    public final qh0.a g;

    public dq(String str, String str2, wp wpVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str3, qh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = wpVar;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = str3;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return k71.k.b(this.a, dqVar.a) && k71.k.b(this.b, dqVar.b) && k71.k.b(this.c, dqVar.c) && k71.k.b(this.d, dqVar.d) && k71.k.b(this.e, dqVar.e) && k71.k.b(this.f, dqVar.f) && k71.k.b(this.g, dqVar.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        wp wpVar = this.c;
        int a = com.github.rudroid.m0.a(this.d, (i + (wpVar == null ? 0 : wpVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastEditedAt=");
        jo.f4.A(", body=", this.f, ", minimizableCommentFragment=", o, this.e);
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
