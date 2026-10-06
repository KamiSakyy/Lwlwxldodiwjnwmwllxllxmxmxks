package zx;

import m10.t3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public String a;
    public t3 b;
    public String c;
    public int d;
    public String e;
    public String f;
    public k0 g;
    public boolean h;

    public u0(String str, t3 t3Var, String str2, int i, String str3, String str4, k0 k0Var, boolean z) {
        this.a = str;
        this.b = t3Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = k0Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && this.b == u0Var.b && k71.k.b(this.c, u0Var.c) && this.d == u0Var.d && k71.k.b(this.e, u0Var.e) && k71.k.b(this.f, u0Var.f) && k71.k.b(this.g, u0Var.g) && this.h == u0Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t3 t3Var = this.b;
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((hashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31, this.c, 31), 31);
        String str = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i((b + (str != null ? str.hashCode() : 0)) * 31, this.f, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckRun(id=");
        sb.append(this.a);
        sb.append(", conclusion=");
        sb.append(this.b);
        sb.append(", name=");
        a0.s0.w(this.d, this.c, ", duration=", ", summary=", sb);
        f1.e.x(sb, this.e, ", permalink=", this.f, ", checkSuite=");
        sb.append(this.g);
        sb.append(", isRequired=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
