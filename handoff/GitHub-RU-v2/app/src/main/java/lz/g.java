package lz;

import com.github.rudroid.copilot.h1;
import m10.b4;
import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final String b;
    public final t3 c;
    public final b4 d;

    public g(String str, String str2, t3 t3Var, b4 b4Var) {
        this.a = str;
        this.b = str2;
        this.c = t3Var;
        this.d = b4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d;
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        t3 t3Var = this.c;
        return this.d.hashCode() + ((i + (t3Var == null ? 0 : t3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCheckSuite(id=", this.a, ", url=", this.b, ", conclusion=");
        o.append(this.c);
        o.append(", status=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
