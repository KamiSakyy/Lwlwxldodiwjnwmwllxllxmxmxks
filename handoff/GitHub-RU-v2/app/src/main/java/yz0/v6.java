package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v6 extends s7 {
    public final String a;
    public final String b;
    public final com.github.service.models.response.a c;
    public final ZonedDateTime d;

    public v6(com.github.service.models.response.a aVar, String str, String str2, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return k71.k.b(this.a, v6Var.a) && k71.k.b(this.b, v6Var.b) && k71.k.b(this.c, v6Var.c) && k71.k.b(this.d, v6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + jo.f4.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineMergedEvent(abbreviatedCommitOid=", qb.b.a(this.a), ", mergeRefName=", this.b, ", author=");
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
    public /* synthetic */ v6(String str, String str2, com.github.service.models.response.a aVar) {
        this(aVar, str, str2, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }
}
