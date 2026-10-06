package c80;

import com.github.rudroid.copilot.h1;
import hc0.uu;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public uu b;
    public String c;

    public c(uu uuVar, String str, String str2) {
        this.a = str;
        this.b = uuVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", id=");
        return h1.p(sb, this.c, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
