package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r4 {
    public final String a;
    public final m10.t3 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final h4 g;
    public final boolean h;

    public r4(String str, m10.t3 t3Var, String str2, String str3, String str4, int i, h4 h4Var, boolean z) {
        this.a = str;
        this.b = t3Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = h4Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.a, r4Var.a) && this.b == r4Var.b && k71.k.b(this.c, r4Var.c) && k71.k.b(this.d, r4Var.d) && k71.k.b(this.e, r4Var.e) && this.f == r4Var.f && k71.k.b(this.g, r4Var.g) && this.h == r4Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.t3 t3Var = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31, this.c, 31);
        String str = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + a0.s0.b(this.f, com.github.rudroid.copilot.h1.i((i + (str != null ? str.hashCode() : 0)) * 31, this.e, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCheckRun(id=");
        sb.append(this.a);
        sb.append(", conclusion=");
        sb.append(this.b);
        sb.append(", name=");
        f1.e.x(sb, this.c, ", summary=", this.d, ", permalink=");
        a0.s0.w(this.f, this.e, ", duration=", ", checkSuite=", sb);
        sb.append(this.g);
        sb.append(", isRequired=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
