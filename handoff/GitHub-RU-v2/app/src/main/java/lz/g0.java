package lz;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public String a;
    public String b;
    public String c;

    public g0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(a0.s0.o("Owner4(id=", this.a, ", login=", this.b, ", avatarUrl="), this.c, ")");
    }
}
