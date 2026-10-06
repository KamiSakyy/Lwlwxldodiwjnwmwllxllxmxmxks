package sw;

import a0.s0;
import com.github.rudroid.copilot.h1;
import dw.t5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final String a;
    public final String b;
    public final t5 c;

    public r(String str, String str2, t5 t5Var) {
        this.a = str;
        this.b = str2;
        this.c = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
