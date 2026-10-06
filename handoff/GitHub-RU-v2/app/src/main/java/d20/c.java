package d20;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public String b;
    public d c;

    public c(String str, String str2, d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        d dVar = this.c;
        return i + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
