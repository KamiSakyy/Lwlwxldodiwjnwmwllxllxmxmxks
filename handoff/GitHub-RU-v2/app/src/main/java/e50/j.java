package e50;

import com.github.rudroid.copilot.h1;
import hc0.i9;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ZonedDateTime e;
    public final i9 f;
    public final String g;

    public j(String str, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, i9 i9Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = zonedDateTime;
        this.f = i9Var;
        this.g = str2;
    }

    public static j a(j jVar, boolean z, i9 i9Var) {
        String str = jVar.a;
        boolean z2 = jVar.c;
        boolean z3 = jVar.d;
        ZonedDateTime zonedDateTime = jVar.e;
        String str2 = jVar.g;
        jVar.getClass();
        return new j(str, z, z2, z3, zonedDateTime, i9Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d && k71.k.b(this.e, jVar.e) && this.f == jVar.f && k71.k.b(this.g, jVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        ZonedDateTime zonedDateTime = this.e;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        i9 i9Var = this.f;
        return this.g.hashCode() + ((hashCode + (i9Var != null ? i9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("DiscussionClosedStateFragment(id=", this.a, ", closed=", ", viewerCanClose=", this.b);
        com.github.rudroid.m0.A(o, this.c, ", viewerCanReopen=", this.d, ", closedAt=");
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", __typename=");
        return h1.p(o, this.g, ")");
    }
}
