package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 extends s7 {
    public final com.github.service.models.response.a a;
    public final String b;
    public final ZonedDateTime c;

    public i6(com.github.service.models.response.a aVar, String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "milestoneTitle");
        this.a = aVar;
        this.b = str;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return k71.k.b(this.a, i6Var.a) && k71.k.b(this.b, i6Var.b) && k71.k.b(this.c, i6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineDemilestonedEvent(author=");
        sb.append(this.a);
        sb.append(", milestoneTitle=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ i6(com.github.service.models.response.a aVar, String str) {
        this(aVar, str, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
