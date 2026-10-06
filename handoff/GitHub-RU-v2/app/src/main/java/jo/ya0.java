package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ya0 {
    public final String a;
    public final ZonedDateTime b;
    public final ua0 c;
    public final va0 d;
    public final String e;

    public ya0(String str, ZonedDateTime zonedDateTime, ua0 ua0Var, va0 va0Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = ua0Var;
        this.d = va0Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        return k71.k.b(this.a, ya0Var.a) && k71.k.b(this.b, ya0Var.b) && k71.k.b(this.c, ya0Var.c) && k71.k.b(this.d, ya0Var.d) && k71.k.b(this.e, ya0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ua0 ua0Var = this.c;
        int hashCode3 = (hashCode2 + (ua0Var == null ? 0 : ua0Var.hashCode())) * 31;
        va0 va0Var = this.d;
        return this.e.hashCode() + ((hashCode3 + (va0Var != null ? va0Var.hashCode() : 0)) * 31);
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
