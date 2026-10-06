package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 {
    public final String a;
    public final m10.t3 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final y4 g;
    public final boolean h;

    public t5(String str, m10.t3 t3Var, String str2, int i, String str3, String str4, y4 y4Var, boolean z) {
        this.a = str;
        this.b = t3Var;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = y4Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && this.b == t5Var.b && k71.k.b(this.c, t5Var.c) && this.d == t5Var.d && k71.k.b(this.e, t5Var.e) && k71.k.b(this.f, t5Var.f) && k71.k.b(this.g, t5Var.g) && this.h == t5Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10.t3 t3Var = this.b;
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

    public Object e;
}
