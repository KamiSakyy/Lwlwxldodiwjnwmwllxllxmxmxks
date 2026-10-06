package iq0;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public class b {
    public int a;
    public String b;
    public d c;
    public String d;
    public String e;

    public b(int i, String str, d dVar, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = dVar;
        this.d = str2;
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
        return this.a == bVar.a && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i((this.c.hashCode() + h1.i(Integer.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "Discussion(number=", ", title=", this.b, ", repository=");
        n.append(this.c);
        n.append(", id=");
        n.append(this.d);
        n.append(", __typename=");
        return h1.p(n, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
