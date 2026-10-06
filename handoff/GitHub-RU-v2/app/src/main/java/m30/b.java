package m30;

import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public String a;
    public a b;
    public ZonedDateTime c;
    public String d;
    public String e;

    public b(String str, a aVar, ZonedDateTime zonedDateTime, String str2, String str3) {
        this.a = str;
        this.b = aVar;
        this.c = zonedDateTime;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int a = m0.a(this.c, (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        String str = this.d;
        return this.e.hashCode() + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoMergeDisabledEventFields(id=");
        sb.append(this.a);
        sb.append(", actor=");
        sb.append(this.b);
        sb.append(", createdAt=");
        f4Shadow.A(", reasonCode=", this.d, ", __typename=", sb, this.c);
        return h1.p(sb, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
