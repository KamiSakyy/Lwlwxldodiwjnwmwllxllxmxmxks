package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 {
    public final String a;
    public final pz0.y2 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final o4 g;
    public final boolean h;

    public h5(String str, pz0.y2 y2Var, String str2, int i, String str3, String str4, o4 o4Var, boolean z) {
        this.a = str;
        this.b = y2Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = o4Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return k71.k.b(this.a, h5Var.a) && this.b == h5Var.b && k71.k.b(this.c, h5Var.c) && this.d == h5Var.d && k71.k.b(this.e, h5Var.e) && k71.k.b(this.f, h5Var.f) && k71.k.b(this.g, h5Var.g) && this.h == h5Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pz0.y2 y2Var = this.b;
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.c, 31), 31);
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
