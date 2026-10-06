package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 implements aa.v0 {
    public final x0 a;
    public final String b;
    public final String c;

    public t0(x0 x0Var, String str, String str2) {
        this.a = x0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c);
    }

    public final int hashCode() {
        x0 x0Var = this.a;
        return this.c.hashCode() + h1.i((x0Var == null ? 0 : x0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
    public static final Object d = null;
}
