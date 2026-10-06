package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e7 extends s7 {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;

    public e7(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        k71.k.g(str2, "columnName");
        k71.k.g(str3, "projectName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return k71.k.b(this.a, e7Var.a) && k71.k.b(this.b, e7Var.b) && k71.k.b(this.c, e7Var.c) && k71.k.b(this.d, e7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineRemovedFromProjectEvent(actorDisplayName=", this.a, ", columnName=", this.b, ", projectName=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ e7(String str, String str2, String str3) {
        this(str, str2, str3, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }
}
