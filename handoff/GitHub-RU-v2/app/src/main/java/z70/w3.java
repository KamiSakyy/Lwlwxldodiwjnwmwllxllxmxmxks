package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w3 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final String c;

    public w3(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return k71.k.b(this.a, w3Var.a) && this.b == w3Var.b && k71.k.b(this.c, w3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("PullRequestViewerCanDeleteHeadRef(id=", this.a, ", viewerCanDeleteHeadRef=", ", __typename=", this.b), this.c, ")");
    }
}
