package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pc0 {
    public boolean a;
    public String b;

    public pc0(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc0)) {
            return false;
        }
        pc0 pc0Var = (pc0) obj;
        return this.a == pc0Var.a && k71.k.b(this.b, pc0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
}
