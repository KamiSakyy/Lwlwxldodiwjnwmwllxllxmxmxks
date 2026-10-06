package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i4 {
    public final String a;
    public final pz0.y2 b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final y3 g;
    public final boolean h;

    public i4(String str, pz0.y2 y2Var, String str2, String str3, String str4, int i, y3 y3Var, boolean z) {
        this.a = str;
        this.b = y2Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = y3Var;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return k71.k.b(this.a, i4Var.a) && this.b == i4Var.b && k71.k.b(this.c, i4Var.c) && k71.k.b(this.d, i4Var.d) && k71.k.b(this.e, i4Var.e) && this.f == i4Var.f && k71.k.b(this.g, i4Var.g) && this.h == i4Var.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pz0.y2 y2Var = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (y2Var == null ? 0 : y2Var.hashCode())) * 31, this.c, 31);
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
