package u40;

import com.github.rudroid.copilot.h1;
import hc0.v7;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final v7 b;
    public final String c;
    public final c d;
    public final String e;

    public b(String str, v7 v7Var, String str2, c cVar, String str3) {
        this.a = str;
        this.b = v7Var;
        this.c = str2;
        this.d = cVar;
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
        return k.b(this.a, bVar.a) && this.b == bVar.b && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v7 v7Var = this.b;
        int hashCode2 = (hashCode + (v7Var == null ? 0 : v7Var.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deployment(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", latestStatus=");
        sb.append(this.d);
        sb.append(", id=");
        return h1.p(sb, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
