package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gk {
    public final String a;
    public final ZonedDateTime b;
    public final ck c;
    public final dk d;
    public final String e;

    public gk(String str, ZonedDateTime zonedDateTime, ck ckVar, dk dkVar, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = ckVar;
        this.d = dkVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return k71.k.b(this.a, gkVar.a) && k71.k.b(this.b, gkVar.b) && k71.k.b(this.c, gkVar.c) && k71.k.b(this.d, gkVar.d) && k71.k.b(this.e, gkVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ck ckVar = this.c;
        int hashCode3 = (hashCode2 + (ckVar == null ? 0 : ckVar.hashCode())) * 31;
        dk dkVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (dkVar != null ? dkVar.hashCode() : 0)) * 31);
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
