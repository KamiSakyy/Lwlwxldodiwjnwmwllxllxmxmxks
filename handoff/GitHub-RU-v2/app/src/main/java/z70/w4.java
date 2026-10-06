package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 {
    public final String a;
    public final hc0.j2 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final d4 g;
    public final boolean h;

    public w4(String str, hc0.j2 j2Var, String str2, int i, String str3, String str4, d4 d4Var, boolean z) {
        this.a = str;
        this.b = j2Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = d4Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return k71.k.b(this.a, w4Var.a) && this.b == w4Var.b && k71.k.b(this.c, w4Var.c) && this.d == w4Var.d && k71.k.b(this.e, w4Var.e) && k71.k.b(this.f, w4Var.f) && k71.k.b(this.g, w4Var.g) && this.h == w4Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc0.j2 j2Var = this.b;
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i((hashCode + (j2Var == null ? 0 : j2Var.hashCode())) * 31, this.c, 31), 31);
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

    public Object e;
}
