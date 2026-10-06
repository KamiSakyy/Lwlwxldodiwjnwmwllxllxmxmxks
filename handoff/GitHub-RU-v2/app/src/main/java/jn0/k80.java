package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k80 {
    public String a;
    public ZonedDateTime b;
    public g80 c;
    public h80 d;
    public String e;

    public k80(String str, ZonedDateTime zonedDateTime, g80 g80Var, h80 h80Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = g80Var;
        this.d = h80Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k80)) {
            return false;
        }
        k80 k80Var = (k80) obj;
        return k71.k.b(this.a, k80Var.a) && k71.k.b(this.b, k80Var.b) && k71.k.b(this.c, k80Var.c) && k71.k.b(this.d, k80Var.d) && k71.k.b(this.e, k80Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        g80 g80Var = this.c;
        int hashCode3 = (hashCode2 + (g80Var == null ? 0 : g80Var.hashCode())) * 31;
        h80 h80Var = this.d;
        return this.e.hashCode() + ((hashCode3 + (h80Var != null ? h80Var.hashCode() : 0)) * 31);
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
