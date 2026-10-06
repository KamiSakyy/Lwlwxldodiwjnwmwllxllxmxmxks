package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 {
    public String a;
    public gn0.l2 b;
    public String c;
    public String d;
    public String e;
    public int f;
    public s3 g;
    public boolean h;

    public c4(String str, gn0.l2 l2Var, String str2, String str3, String str4, int i, s3 s3Var, boolean z) {
        this.a = str;
        this.b = l2Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = s3Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return k71.k.b(this.a, c4Var.a) && this.b == c4Var.b && k71.k.b(this.c, c4Var.c) && k71.k.b(this.d, c4Var.d) && k71.k.b(this.e, c4Var.e) && this.f == c4Var.f && k71.k.b(this.g, c4Var.g) && this.h == c4Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gn0.l2 l2Var = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31, this.c, 31);
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
