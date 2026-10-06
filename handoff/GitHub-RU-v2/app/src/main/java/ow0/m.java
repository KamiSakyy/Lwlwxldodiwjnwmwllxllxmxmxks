package ow0;

import com.github.rudroid.copilot.h1;
import uu0.v3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public String a;
    public String b;
    public v3 c;

    public m(String str, String str2, v3 v3Var) {
        this.a = str;
        this.b = str2;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryNodeFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
