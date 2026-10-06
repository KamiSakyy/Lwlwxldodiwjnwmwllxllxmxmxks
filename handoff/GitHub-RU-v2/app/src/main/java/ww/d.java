package ww;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h0 {
    public String a;
    public String b;
    public a c;
    public c d;
    public ZonedDateTime e;

    public d(String str, String str2, a aVar, c cVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = cVar;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.d;
        return this.e.hashCode() + ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SubIssueAddedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", subIssue=");
        o.append(this.d);
        o.append(", createdAt=");
        return h1.q(o, this.e, ")");
    }
}
