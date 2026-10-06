package on;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final c c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final ZonedDateTime f;
    public final i g;

    public a(String str, String str2, c cVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, i iVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = zonedDateTime3;
        this.g = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && this.c == aVar.c && k71.k.b(this.d, aVar.d) && k71.k.b(this.e, aVar.e) && k71.k.b(this.f, aVar.f) && k71.k.b(this.g, aVar.g);
    }

    public final int hashCode() {
        int a = m0.a(this.d, (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
        ZonedDateTime zonedDateTime = this.e;
        int hashCode = (a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f;
        int hashCode2 = (hashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        i iVar = this.g;
        return hashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentSession(sessionId=", this.a, ", sessionName=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastUpdatedAt=");
        h1.B(o, this.e, ", completedAt=", this.f, ", resource=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
