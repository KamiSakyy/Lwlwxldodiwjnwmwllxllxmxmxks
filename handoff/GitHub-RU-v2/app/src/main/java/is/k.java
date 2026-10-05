package is;

import java.time.ZonedDateTime;
import m10.zd;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ZonedDateTime e;
    public final zd f;
    public final String g;

    public k(String str, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, zd zdVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = zonedDateTime;
        this.f = zdVar;
        this.g = str2;
    }

    public static k a(k kVar, boolean z, zd zdVar) {
        String str = kVar.a;
        boolean z2 = kVar.c;
        boolean z3 = kVar.d;
        ZonedDateTime zonedDateTime = kVar.e;
        String str2 = kVar.g;
        kVar.getClass();
        return new k(str, z, z2, z3, zonedDateTime, zdVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d && k71.k.b(this.e, kVar.e) && this.f == kVar.f && k71.k.b(this.g, kVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ZonedDateTime zonedDateTime = this.e;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        zd zdVar = this.f;
        return this.g.hashCode() + ((hashCode + (zdVar != null ? zdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("DiscussionClosedStateFragment(id=", this.a, ", closed=", ", viewerCanClose=", this.b);
        com.github.rudroid.m0.A(o, this.c, ", viewerCanReopen=", this.d, ", closedAt=");
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.g, ")");
    }
}
