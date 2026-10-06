package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bj {
    public String a;
    public ZonedDateTime b;
    public xi c;
    public yi d;
    public String e;

    public bj(String str, ZonedDateTime zonedDateTime, xi xiVar, yi yiVar, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = xiVar;
        this.d = yiVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return k71.k.b(this.a, bjVar.a) && k71.k.b(this.b, bjVar.b) && k71.k.b(this.c, bjVar.c) && k71.k.b(this.d, bjVar.d) && k71.k.b(this.e, bjVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        xi xiVar = this.c;
        int hashCode3 = (hashCode2 + (xiVar == null ? 0 : xiVar.hashCode())) * 31;
        yi yiVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (yiVar != null ? yiVar.hashCode() : 0)) * 31);
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
