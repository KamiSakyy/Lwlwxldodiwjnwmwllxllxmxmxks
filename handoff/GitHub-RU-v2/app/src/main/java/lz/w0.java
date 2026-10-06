package lz;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public final String a;
    public final String b;
    public final x0 c;

    public w0(String str, String str2, x0 x0Var) {
        this.a = str;
        this.b = str2;
        this.c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(id=", this.a, ", nameWithOwner=", this.b, ", owner=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
