package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n40 {
    public String a;
    public ZonedDateTime b;
    public j40 c;
    public k40 d;
    public String e;

    public n40(String str, ZonedDateTime zonedDateTime, j40 j40Var, k40 k40Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = j40Var;
        this.d = k40Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return k71.k.b(this.a, n40Var.a) && k71.k.b(this.b, n40Var.b) && k71.k.b(this.c, n40Var.c) && k71.k.b(this.d, n40Var.d) && k71.k.b(this.e, n40Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        j40 j40Var = this.c;
        int hashCode3 = (hashCode2 + (j40Var == null ? 0 : j40Var.hashCode())) * 31;
        k40 k40Var = this.d;
        return this.e.hashCode() + ((hashCode3 + (k40Var != null ? k40Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("Discussion(id=", this.a, ", answerChosenAt=", ", answer=", this.b);
        s.append(this.c);
        s.append(", answerChosenBy=");
        s.append(this.d);
        s.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(s, this.e, ")");
    }
}
