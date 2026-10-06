package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o5 implements aa.h0 {
    public String a;
    public String b;
    public int c;
    public boolean d;

    public o5(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return k71.k.b(this.a, o5Var.a) && k71.k.b(this.b, o5Var.b) && this.c == o5Var.c && this.d == o5Var.d;
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
