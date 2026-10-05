package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j4 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final String d;

    public j4(String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.a == j4Var.a && k71.k.b(this.b, j4Var.b) && this.c == j4Var.c && k71.k.b(this.d, j4Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int e = x.i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return com.github.rudroid.m0.l(com.github.rudroid.copilot.h1.t("PageInfo(hasPreviousPage=", ", startCursor=", this.b, ", hasNextPage=", this.a), this.c, ", endCursor=", this.d, ")");
    }
}
