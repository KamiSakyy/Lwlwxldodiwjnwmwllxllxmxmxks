package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r7 extends s7 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ZonedDateTime e;

    public r7(String str, String str2, String str3, boolean z, ZonedDateTime zonedDateTime) {
        k71.k.g(str2, "actorDisplayName");
        k71.k.g(str3, "subjectDisplayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return k71.k.b(this.a, r7Var.a) && k71.k.b(this.b, r7Var.b) && k71.k.b(this.c, r7Var.c) && this.d == r7Var.d && k71.k.b(this.e, r7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineUserBlockedEvent(id=", this.a, ", actorDisplayName=", this.b, ", subjectDisplayName=");
        com.github.rudroid.m0.x(o, this.c, ", isTemporary=", this.d, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.e, ")");
    }
}
