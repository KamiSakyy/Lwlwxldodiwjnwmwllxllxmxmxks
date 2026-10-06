package ct;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public boolean a;
    public String b;
    public boolean c;
    public String d;

    public h0(String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && k71.k.b(this.b, h0Var.b) && this.c == h0Var.c && k71.k.b(this.d, h0Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int e = x.i.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return com.github.rudroid.m0.l(h1.t("PageInfo(hasPreviousPage=", ", startCursor=", this.b, ", hasNextPage=", this.a), this.c, ", endCursor=", this.d, ")");
    }
}
