package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.v0 {
    public c a;
    public String b;
    public String c;

    public b(c cVar, String str, String str2) {
        this.a = cVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        c cVar = this.a;
        return this.c.hashCode() + h1.i((cVar == null ? 0 : cVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
    public Object e(Object, Object, Object) { return null; }
}
