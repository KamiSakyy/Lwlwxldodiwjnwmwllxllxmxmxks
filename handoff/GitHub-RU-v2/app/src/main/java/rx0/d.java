package rx0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import fw0.n0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public String b;
    public n0 c;

    public d(String str, String str2, n0 n0Var) {
        this.a = str;
        this.b = str2;
        this.c = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Status1(__typename=", this.a, ", id=", this.b, ", profileStatusFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
