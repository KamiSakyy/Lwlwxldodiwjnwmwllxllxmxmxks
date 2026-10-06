package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d30 {
    public boolean a;
    public String b;
    public boolean c;

    public d30(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d30)) {
            return false;
        }
        d30 d30Var = (d30) obj;
        return this.a == d30Var.a && k71.k.b(this.b, d30Var.b) && this.c == d30Var.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return jo.f4.s(com.github.rudroid.copilot.h1.t("PageInfo(hasNextPage=", ", endCursor=", this.b, ", hasPreviousPage=", this.a), this.c, ")");
    }
}
