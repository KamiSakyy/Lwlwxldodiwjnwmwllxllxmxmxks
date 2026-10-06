package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public String a;
    public String b;
    public String c;

    public f0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b) && k71.k.b(this.c, f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(a0.s0.o("Owner4(id=", this.a, ", login=", this.b, ", avatarUrl="), this.c, ")");
    }
}
