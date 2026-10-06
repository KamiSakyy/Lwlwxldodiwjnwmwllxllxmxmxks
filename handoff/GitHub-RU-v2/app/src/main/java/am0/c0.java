package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public String a;
    public String b;
    public String c;

    public c0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(a0.s0.o("Owner1(id=", this.a, ", login=", this.b, ", avatarUrl="), this.c, ")");
    }
}
