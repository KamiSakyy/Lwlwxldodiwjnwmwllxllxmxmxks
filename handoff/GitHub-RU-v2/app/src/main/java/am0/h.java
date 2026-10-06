package am0;

import com.github.rudroid.copilot.h1;
import gn0.l2;
import gn0.r2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final String a;
    public final String b;
    public final l2 c;
    public final r2 d;

    public h(String str, String str2, l2 l2Var, r2 r2Var) {
        this.a = str;
        this.b = str2;
        this.c = l2Var;
        this.d = r2Var;
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
        l2 l2Var = this.c;
        return this.d.hashCode() + ((i + (l2Var == null ? 0 : l2Var.hashCode())) * 31);
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
