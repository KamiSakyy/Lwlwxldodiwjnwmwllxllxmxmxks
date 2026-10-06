package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ig {
    public String a;
    public ZonedDateTime b;
    public eg c;
    public fg d;
    public String e;

    public ig(String str, ZonedDateTime zonedDateTime, eg egVar, fg fgVar, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = egVar;
        this.d = fgVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        return k71.k.b(this.a, igVar.a) && k71.k.b(this.b, igVar.b) && k71.k.b(this.c, igVar.c) && k71.k.b(this.d, igVar.d) && k71.k.b(this.e, igVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        int hashCode2 = (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        eg egVar = this.c;
        int hashCode3 = (hashCode2 + (egVar == null ? 0 : egVar.hashCode())) * 31;
        fg fgVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (fgVar != null ? fgVar.hashCode() : 0)) * 31);
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
