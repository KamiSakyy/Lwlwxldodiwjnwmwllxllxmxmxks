package w40;

import com.github.rudroid.copilot.h1;
import hc0.z7;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final z7 b;
    public final String c;
    public final b d;
    public final String e;

    public c(String str, z7 z7Var, String str2, b bVar, String str3) {
        this.a = str;
        this.b = z7Var;
        this.c = str2;
        this.d = bVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeploymentStatus(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", environmentUrl=");
        sb.append(this.c);
        sb.append(", deployment=");
        sb.append(this.d);
        sb.append(", id=");
        return h1.p(sb, this.e, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
}
