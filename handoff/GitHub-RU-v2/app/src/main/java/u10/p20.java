package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p20 {
    public final String a;
    public final ZonedDateTime b;
    public final l20 c;
    public final m20 d;
    public final String e;

    public p20(String str, ZonedDateTime zonedDateTime, l20 l20Var, m20 m20Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = l20Var;
        this.d = m20Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p20)) {
            return false;
        }
        p20 p20Var = (p20) obj;
        return k71.k.b(this.a, p20Var.a) && k71.k.b(this.b, p20Var.b) && k71.k.b(this.c, p20Var.c) && k71.k.b(this.d, p20Var.d) && k71.k.b(this.e, p20Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        l20 l20Var = this.c;
        int hashCode3 = (hashCode2 + (l20Var == null ? 0 : l20Var.hashCode())) * 31;
        m20 m20Var = this.d;
        return this.e.hashCode() + ((hashCode3 + (m20Var != null ? m20Var.hashCode() : 0)) * 31);
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
