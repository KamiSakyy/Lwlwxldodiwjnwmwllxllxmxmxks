package ck0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import oj0.v3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public final String a;
    public final String b;
    public final v3 c;

    public t(String str, String str2, v3 v3Var) {
        this.a = str;
        this.b = str2;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c);
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
