package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 {
    public final String a;
    public final boolean b;
    public final String c;

    public q8(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return k71.k.b(this.a, q8Var.a) && this.b == q8Var.b && k71.k.b(this.c, q8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("ViewerLatestReviewRequest(displayName=", this.a, ", isViewer=", ", avatarUrl=", this.b), this.c, ")");
    }
}
