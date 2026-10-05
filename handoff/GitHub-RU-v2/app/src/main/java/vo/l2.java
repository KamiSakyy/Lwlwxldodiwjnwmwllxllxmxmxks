package vo;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public l2(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.a == l2Var.a && k71.k.b(this.b, l2Var.b) && this.c == l2Var.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return f4.s(com.github.rudroid.copilot.h1.t("PageInfo(hasNextPage=", ", endCursor=", this.b, ", hasPreviousPage=", this.a), this.c, ")");
    }
}
