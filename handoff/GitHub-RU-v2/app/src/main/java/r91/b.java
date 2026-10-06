package r91;

import a0.s0;
import c21.h0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes5.dex */
public class b {
    public h0 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(h0 h0Var, int i, int i2, int i3, int i4) {
        this.a = h0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        h0 h0Var = this.a;
        return Integer.hashCode(this.e) + s0.b(this.d, s0.b(this.c, s0.b(this.b, (h0Var == null ? 0 : h0Var.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenInfo(type=");
        sb.append(this.a);
        sb.append(", tokenStart=");
        sb.append(this.b);
        sb.append(", tokenEnd=");
        sb.append(this.c);
        sb.append(", rawIndex=");
        sb.append(this.d);
        sb.append(", normIndex=");
        return i.j(sb, this.e, ')');
    }
    public Object add(Object p1) { return null; }
    public Object pop() { return null; }
}
