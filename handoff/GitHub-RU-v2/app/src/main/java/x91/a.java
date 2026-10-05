package x91;

import a0.s0;
import c21.h0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public final h0 a;
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public final char f;
    public int g;

    public a(h0 h0Var, int i, int i2, boolean z, boolean z2, char c) {
        k.g(h0Var, "tokenType");
        this.a = h0Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = c;
        this.g = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + ((Character.hashCode(this.f) + i.e(i.e(s0.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(tokenType=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", length=");
        sb.append(this.c);
        sb.append(", canOpen=");
        sb.append(this.d);
        sb.append(", canClose=");
        sb.append(this.e);
        sb.append(", marker=");
        sb.append(this.f);
        sb.append(", closerIndex=");
        return i.j(sb, this.g, ')');
    }
}
