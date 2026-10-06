package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w5 {
    public final aa1.b a;
    public final String b;
    public final int c;
    public final String d;
    public final aa1.b e;
    public final String f;
    public final int g;
    public final String h;

    public w5(aa1.b bVar, String str, int i, String str2, aa1.b bVar2, String str3, int i2, String str4) {
        k71.k.g(str3, "startCommitOid");
        k71.k.g(str4, "startPath");
        this.a = bVar;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = bVar2;
        this.f = str3;
        this.g = i2;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return k71.k.b(this.a, w5Var.a) && k71.k.b(this.b, w5Var.b) && this.c == w5Var.c && k71.k.b(this.d, w5Var.d) && k71.k.b(this.e, w5Var.e) && k71.k.b(this.f, w5Var.f) && this.g == w5Var.g && k71.k.b(this.h, w5Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(f1.e.a(this.e, com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), 31), this.f, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentPositionMultilineInput(baseCommitOid=");
        sb.append(this.a);
        sb.append(", endCommitOid=");
        sb.append(this.b);
        sb.append(", endLine=");
        x.i.r(this.c, ", endPath=", this.d, ", headCommitOid=", sb);
        sb.append(this.e);
        sb.append(", startCommitOid=");
        sb.append(this.f);
        sb.append(", startLine=");
        return com.github.rudroid.m0.c(this.g, ", startPath=", this.h, ")", sb);
    }

    public Object e;
}
