package yz0;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 extends s7 {
    public com.github.service.models.response.a a;
    public k.w b;
    public ZonedDateTime c;
    public CloseReason d;
    public z01.p e;

    public b6(com.github.service.models.response.a aVar, k.w wVar, ZonedDateTime zonedDateTime, CloseReason closeReason, z01.p pVar) {
        k71.k.g(zonedDateTime, "createdAt");
        this.a = aVar;
        this.b = wVar;
        this.c = zonedDateTime;
        this.d = closeReason;
        this.e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return k71.k.b(this.a, b6Var.a) && k71.k.b(this.b, b6Var.b) && k71.k.b(this.c, b6Var.c) && this.d == b6Var.d && k71.k.b(this.e, b6Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k.w wVar = this.b;
        int a = com.github.rudroid.m0.a(this.c, (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31, 31);
        CloseReason closeReason = this.d;
        int hashCode2 = (a + (closeReason == null ? 0 : closeReason.hashCode())) * 31;
        z01.p pVar = this.e;
        return hashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineClosedEvent(author=" + this.a + ", closer=" + this.b + ", createdAt=" + this.c + ", closeReason=" + this.d + ", duplicateOf=" + this.e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b6(com.github.service.models.response.a aVar, k.w wVar, ZonedDateTime zonedDateTime, CloseReason closeReason, z01.p pVar, int i) {
        this(aVar, wVar, zonedDateTime, (i & 8) != 0 ? null : closeReason, (i & 16) != 0 ? null : pVar);
        wVar = (i & 2) != 0 ? null : wVar;
        if ((i & 4) != 0) {
            zonedDateTime = ZonedDateTime.now();
            k71.k.f(zonedDateTime, "now(...)");
        }
    }
    public b6(Object p1, Object p2, java.time.ZonedDateTime p3, Object p4, Object p5) {
    }
    public b6(Object p1, Object p2, java.time.ZonedDateTime p3, Object p4, Object p5, int p6) {
    }
}
