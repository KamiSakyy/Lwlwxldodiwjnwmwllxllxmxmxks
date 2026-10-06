package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l6 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public l6(int i, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return k71.k.b(this.a, l6Var.a) && k71.k.b(this.b, l6Var.b) && this.c == l6Var.c && k71.k.b(this.d, l6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.c, ", __typename=", this.d, ")", a0.s0.o("Issue(id=", this.a, ", url=", this.b, ", number="));
    }
}
