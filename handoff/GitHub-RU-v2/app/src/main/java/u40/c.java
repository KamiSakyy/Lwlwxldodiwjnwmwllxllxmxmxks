package u40;

import hc0.z7;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public z7 b;
    public String c;
    public String d;

    public c(String str, z7 z7Var, String str2, String str3) {
        this.a = str;
        this.b = z7Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c) && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatestStatus(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", environmentUrl=");
        return i.k(sb, this.c, ", id=", this.d, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
