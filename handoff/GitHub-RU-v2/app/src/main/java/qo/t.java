package qo;

import java.time.ZonedDateTime;
import m10.b4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public String a;
    public ZonedDateTime b;
    public b4 c;
    public t3 d;
    public String e;

    public t(String str, ZonedDateTime zonedDateTime, b4 b4Var, t3 t3Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = b4Var;
        this.d = t3Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && this.c == tVar.c && this.d == tVar.d && k71.k.b(this.e, tVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        t3 t3Var = this.d;
        return this.e.hashCode() + ((hashCode2 + (t3Var != null ? t3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("Node1(id=", this.a, ", startedAt=", ", status=", this.b);
        s.append(this.c);
        s.append(", conclusion=");
        s.append(this.d);
        s.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(s, this.e, ")");
    }
}
