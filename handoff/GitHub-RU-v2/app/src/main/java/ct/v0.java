package ct;

import com.github.rudroid.copilot.h1;
import dw.z6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public final String a;
    public final String b;
    public final z6 c;

    public v0(String str, String str2, z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && k71.k.b(this.c, v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(__typename=", this.a, ", id=", this.b, ", subIssueProgressFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
