package yz0;

import com.github.service.models.response.type.StatusState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j4 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final String d;
    public final StatusState e;
    public final com.github.service.models.response.a f;
    public final com.github.service.models.response.a g;

    public j4(String str, String str2, ZonedDateTime zonedDateTime, String str3, StatusState statusState, com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2) {
        k71.k.g(statusState, "checksState");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
        this.e = statusState;
        this.f = aVar;
        this.g = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return k71.k.b(this.a, j4Var.a) && k71.k.b(this.b, j4Var.b) && k71.k.b(this.c, j4Var.c) && k71.k.b(this.d, j4Var.d) && this.e == j4Var.e && k71.k.b(this.f, j4Var.f) && k71.k.b(this.g, j4Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31;
        com.github.service.models.response.a aVar = this.f;
        return this.g.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        String a = qb.b.a(this.d);
        StringBuilder o = a0.s0.o("SimpleCommit(id=", this.a, ", messageHeadline=", this.b, ", committedAt=");
        jo.f4.A(", abbreviatedOid=", a, ", checksState=", o, this.c);
        o.append(this.e);
        o.append(", committer=");
        o.append(this.f);
        o.append(", author=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
