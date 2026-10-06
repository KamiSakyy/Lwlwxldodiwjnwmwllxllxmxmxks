package bu;

import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public final ZonedDateTime a;
    public final a b;
    public final String c;
    public final String d;

    public b(ZonedDateTime zonedDateTime, a aVar, String str, String str2) {
        this.a = zonedDateTime;
        this.b = aVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddedToMergeQueueEventFields(createdAt=");
        sb.append(this.a);
        sb.append(", enqueuer=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
