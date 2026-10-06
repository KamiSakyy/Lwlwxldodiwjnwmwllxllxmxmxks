package d00;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public String a;
    public String b;
    public g0 c;

    public f0(String str, String str2, g0 g0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b) && k71.k.b(this.c, f0Var.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        g0 g0Var = this.c;
        return i + (g0Var == null ? 0 : g0Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", onProjectV2View=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
