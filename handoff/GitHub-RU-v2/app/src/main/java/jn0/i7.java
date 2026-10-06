package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i7 {
    public String a;
    public String b;
    public String c;
    public int d;
    public j7 e;
    public uu0.j5 f;

    public i7(String str, String str2, String str3, int i, j7 j7Var, uu0.j5 j5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = j7Var;
        this.f = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return k71.k.b(this.a, i7Var.a) && k71.k.b(this.b, i7Var.b) && k71.k.b(this.c, i7Var.c) && this.d == i7Var.d && k71.k.b(this.e, i7Var.e) && k71.k.b(this.f, i7Var.f);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        j7 j7Var = this.e;
        return this.f.hashCode() + ((b + (j7Var == null ? 0 : j7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        a0.s0.w(this.d, this.c, ", number=", ", parent=", o);
        o.append(this.e);
        o.append(", subIssueFragment=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
