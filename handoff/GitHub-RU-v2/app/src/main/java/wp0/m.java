package wp0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements h0 {
    public final String a;
    public final String b;
    public final df c;
    public final a d;
    public final c e;
    public final d f;
    public final ZonedDateTime g;

    public m(String str, String str2, df dfVar, a aVar, c cVar, d dVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = dfVar;
        this.d = aVar;
        this.e = cVar;
        this.f = dVar;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && this.c == mVar.c && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e) && k71.k.b(this.f, mVar.f) && k71.k.b(this.g, mVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        df dfVar = this.c;
        int hashCode = (i + (dfVar == null ? 0 : dfVar.hashCode())) * 31;
        a aVar = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        d dVar = this.f;
        return this.g.hashCode() + ((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ClosedEventFields(__typename=", this.a, ", id=", this.b, ", stateReason=");
        o.append(this.c);
        o.append(", actor=");
        o.append(this.d);
        o.append(", closable=");
        o.append(this.e);
        o.append(", closer=");
        o.append(this.f);
        o.append(", createdAt=");
        return h1.q(o, this.g, ")");
    }
}
