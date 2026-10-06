package tt;

import com.github.rudroid.copilot.h1;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public n40 b;
    public String c;

    public d(String str, n40 n40Var, String str2) {
        this.a = str;
        this.b = n40Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n40 n40Var = this.b;
        return this.c.hashCode() + ((hashCode + (n40Var == null ? 0 : n40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
