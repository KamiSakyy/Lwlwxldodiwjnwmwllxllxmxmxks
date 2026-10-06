package ox0;

import pz0.e3;
import pz0.y2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public String b;
    public y2 c;
    public e3 d;

    public h(String str, String str2, y2 y2Var, e3 e3Var) {
        this.a = str;
        this.b = str2;
        this.c = y2Var;
        this.d = e3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y2 y2Var = this.c;
        return this.d.hashCode() + ((i + (y2Var == null ? 0 : y2Var.hashCode())) * 31);
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
