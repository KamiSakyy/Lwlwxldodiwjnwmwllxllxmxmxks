package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j5 {
    public final String a;
    public final i5 b;
    public final String c;
    public final ct.w0 d;

    public j5(String str, i5 i5Var, String str2, ct.w0 w0Var) {
        this.a = str;
        this.b = i5Var;
        this.c = str2;
        this.d = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.a, j5Var.a) && k71.k.b(this.b, j5Var.b) && k71.k.b(this.c, j5Var.c) && k71.k.b(this.d, j5Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i5 i5Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (i5Var == null ? 0 : i5Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return "Issue(__typename=" + this.a + ", duplicateOf=" + this.b + ", id=" + this.c + ", updateIssueStateFragment=" + this.d + ")";
    }
}
