package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u5 {
    public aa1.b a;
    public String b;
    public aa1.b c;
    public String d;

    public u5(aa1.b bVar, aa1.b bVar2, String str, String str2) {
        this.a = bVar;
        this.b = str;
        this.c = bVar2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return k71.k.b(this.a, u5Var.a) && k71.k.b(this.b, u5Var.b) && k71.k.b(this.c, u5Var.c) && k71.k.b(this.d, u5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "CommentPositionFileInput(baseCommitOid=" + this.a + ", commitOid=" + this.b + ", headCommitOid=" + this.c + ", path=" + this.d + ")";
    }
}
