package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v30 {
    public boolean a;
    public String b;

    public v30(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v30)) {
            return false;
        }
        v30 v30Var = (v30) obj;
        return this.a == v30Var.a && k71.k.b(this.b, v30Var.b);
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
