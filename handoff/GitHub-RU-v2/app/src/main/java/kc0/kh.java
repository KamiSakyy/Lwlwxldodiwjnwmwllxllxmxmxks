package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kh {
    public String a;
    public ZonedDateTime b;
    public gh c;
    public hh d;
    public String e;

    public kh(String str, ZonedDateTime zonedDateTime, gh ghVar, hh hhVar, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = ghVar;
        this.d = hhVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return k71.k.b(this.a, khVar.a) && k71.k.b(this.b, khVar.b) && k71.k.b(this.c, khVar.c) && k71.k.b(this.d, khVar.d) && k71.k.b(this.e, khVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        gh ghVar = this.c;
        int hashCode3 = (hashCode2 + (ghVar == null ? 0 : ghVar.hashCode())) * 31;
        hh hhVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (hhVar != null ? hhVar.hashCode() : 0)) * 31);
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
