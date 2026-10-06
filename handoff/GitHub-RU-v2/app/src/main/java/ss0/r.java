package ss0;

import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements h0 {
    public ZonedDateTime a;
    public q b;
    public String c;
    public String d;
    public String e;

    public r(ZonedDateTime zonedDateTime, q qVar, String str, String str2, String str3) {
        this.a = zonedDateTime;
        this.b = qVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && k71.k.b(this.d, rVar.d) && k71.k.b(this.e, rVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str = this.c;
        return this.e.hashCode() + h1.i((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemovedFromMergeQueueFields(createdAt=");
        sb.append(this.a);
        sb.append(", enqueuer=");
        sb.append(this.b);
        sb.append(", reason=");
        f1.e.x(sb, this.c, ", id=", this.d, ", __typename=");
        return h1.p(sb, this.e, ")");
    }
}
