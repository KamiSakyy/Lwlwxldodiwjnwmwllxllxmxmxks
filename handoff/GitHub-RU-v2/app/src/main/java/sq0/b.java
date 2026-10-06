package sq0;

import k71.k;
import pz0.g9;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public g9 b;
    public String c;
    public String d;

    public b(String str, g9 g9Var, String str2, String str3) {
        this.a = str;
        this.b = g9Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && this.b == bVar.b && k.b(this.c, bVar.c) && k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g9 g9Var = this.b;
        int hashCode2 = (hashCode + (g9Var == null ? 0 : g9Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deployment(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", environment=");
        return x.i.k(sb, this.c, ", id=", this.d, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
