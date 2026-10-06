package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 implements k8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j8(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return k71.k.b(this.a, j8Var.a) && k71.k.b(this.b, j8Var.b) && k71.k.b(this.c, j8Var.c) && k71.k.b(this.d, j8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("PinnedGist(description=", this.a, ", fileSnippet=", this.b, ", name="), this.c, ", url=", this.d, ")");
    }
}
