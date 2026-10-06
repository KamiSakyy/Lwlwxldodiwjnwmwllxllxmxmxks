package s30;

import aa.h0;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements h0 {
    public String a;
    public a b;
    public ZonedDateTime c;
    public String d;

    public b(String str, a aVar, ZonedDateTime zonedDateTime, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = zonedDateTime;
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
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return this.d.hashCode() + m0.a(this.c, (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoSquashEnabledEventFields(id=");
        sb.append(this.a);
        sb.append(", actor=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return i.h(", __typename=", this.d, ")", sb, this.c);
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
