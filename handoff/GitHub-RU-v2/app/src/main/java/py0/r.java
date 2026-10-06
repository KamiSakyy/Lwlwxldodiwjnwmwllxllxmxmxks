package py0;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements v0 {
    public v a;
    public String b;
    public String c;

    public r(v vVar, String str, String str2) {
        this.a = vVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        v vVar = this.a;
        return this.c.hashCode() + h1.i((vVar == null ? 0 : vVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
