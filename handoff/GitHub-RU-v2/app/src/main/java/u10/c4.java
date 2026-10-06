package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c4 {
    public final String a;
    public final hc0.j2 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final s3 g;
    public final boolean h;

    public c4(String str, hc0.j2 j2Var, String str2, String str3, String str4, int i, s3 s3Var, boolean z) {
        this.a = str;
        this.b = j2Var;
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
        hc0.j2 j2Var = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (j2Var == null ? 0 : j2Var.hashCode())) * 31, this.c, 31);
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
