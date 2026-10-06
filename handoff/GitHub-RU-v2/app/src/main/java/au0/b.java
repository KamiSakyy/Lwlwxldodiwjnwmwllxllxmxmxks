package au0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public String a;
    public String b;
    public c c;
    public String d;
    public a e;
    public ZonedDateTime f;

    public b(String str, String str2, c cVar, String str3, a aVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
        this.d = str3;
        this.e = aVar;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        c cVar = this.c;
        int i2 = h1.i((i + (cVar == null ? 0 : cVar.hashCode())) * 31, this.d, 31);
        a aVar = this.e;
        return this.f.hashCode() + ((i2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequestCommit(__typename=", this.a, ", id=", this.b, ", status=");
        o.append(this.c);
        o.append(", messageHeadline=");
        o.append(this.d);
        o.append(", author=");
        o.append(this.e);
        o.append(", committedDate=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
