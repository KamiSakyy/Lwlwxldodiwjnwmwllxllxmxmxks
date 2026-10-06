package a90;

import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final b b;
    public final boolean c;
    public final String d;

    public c(String str, b bVar, boolean z, String str2) {
        this.a = str;
        this.b = bVar;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && this.c == cVar.c && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return this.d.hashCode() + i.e((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Review(__typename=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", includesCreatedEdit=");
        return m0.l(sb, this.c, ", id=", this.d, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
