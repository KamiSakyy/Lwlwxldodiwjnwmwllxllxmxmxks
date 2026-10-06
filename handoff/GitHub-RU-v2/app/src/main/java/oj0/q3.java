package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q3 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public boolean d;

    public q3(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && k71.k.b(this.b, q3Var.b) && this.c == q3Var.c && this.d == q3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryStarsFragment(__typename=", this.a, ", id=", this.b, ", stargazerCount=");
        o.append(this.c);
        o.append(", viewerHasStarred=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
