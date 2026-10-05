package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v5 {
    public final aa1.b a;
    public final String b;
    public final aa1.b c;
    public final int d;
    public final String e;

    public v5(int i, aa1.b bVar, aa1.b bVar2, String str, String str2) {
        this.a = bVar;
        this.b = str;
        this.c = bVar2;
        this.d = i;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return k71.k.b(this.a, v5Var.a) && k71.k.b(this.b, v5Var.b) && k71.k.b(this.c, v5Var.c) && this.d == v5Var.d && k71.k.b(this.e, v5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.s0.b(this.d, f1.e.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentPositionLineInput(baseCommitOid=");
        sb.append(this.a);
        sb.append(", commitOid=");
        sb.append(this.b);
        sb.append(", headCommitOid=");
        sb.append(this.c);
        sb.append(", line=");
        sb.append(this.d);
        sb.append(", path=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
