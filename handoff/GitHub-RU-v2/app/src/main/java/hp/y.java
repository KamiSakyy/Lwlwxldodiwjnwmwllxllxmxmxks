package hp;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import m10.o7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements h0 {
    public final String a;
    public final String b;
    public final o7 c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final ZonedDateTime f;
    public final x g;
    public final String h;

    public y(String str, String str2, o7 o7Var, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, x xVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = o7Var;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = zonedDateTime3;
        this.g = xVar;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && this.c == yVar.c && k71.k.b(this.d, yVar.d) && k71.k.b(this.e, yVar.e) && k71.k.b(this.f, yVar.f) && k71.k.b(this.g, yVar.g) && k71.k.b(this.h, yVar.h);
    }

    public final int hashCode() {
        int a = m0.a(this.d, (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        int hashCode = (a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f;
        int hashCode2 = (hashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        x xVar = this.g;
        return this.h.hashCode() + ((hashCode2 + (xVar != null ? xVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ViewerAgentSessionFragment(sessionId=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastUpdatedAt=");
        h1.B(o, this.e, ", completedAt=", this.f, ", resource=");
        o.append(this.g);
        o.append(", __typename=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
