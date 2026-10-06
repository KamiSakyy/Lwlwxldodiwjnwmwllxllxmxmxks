package iy0;

import com.github.rudroid.copilot.h1;
import wx0.b5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public String a;
    public String b;
    public b5 c;

    public i0(String str, String str2, b5 b5Var) {
        this.a = str;
        this.b = str2;
        this.c = b5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleProjectV2Fragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
