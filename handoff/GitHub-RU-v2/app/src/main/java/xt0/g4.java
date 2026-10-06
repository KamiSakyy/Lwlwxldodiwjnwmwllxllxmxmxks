package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 implements aa.h0 {
    public String a;
    public boolean b;
    public String c;

    public g4(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return k71.k.b(this.a, g4Var.a) && this.b == g4Var.b && k71.k.b(this.c, g4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("PullRequestViewerCanDeleteHeadRef(id=", this.a, ", viewerCanDeleteHeadRef=", ", __typename=", this.b), this.c, ")");
    }
}
