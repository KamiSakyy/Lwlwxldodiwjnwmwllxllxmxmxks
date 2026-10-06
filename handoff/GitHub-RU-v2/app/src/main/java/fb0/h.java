package fb0;

import com.github.rudroid.copilot.h1;
import hc0.j2;
import hc0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final String b;
    public final j2 c;
    public final p2 d;

    public h(String str, String str2, j2 j2Var, p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = j2Var;
        this.d = p2Var;
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
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        j2 j2Var = this.c;
        return this.d.hashCode() + ((i + (j2Var == null ? 0 : j2Var.hashCode())) * 31);
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
