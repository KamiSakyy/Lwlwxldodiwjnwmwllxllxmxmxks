package uw0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import fw0.z0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public String a;
    public String b;
    public z0 c;

    public e0(String str, String str2, z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", userListFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
