package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 {
    public String a;
    public String b;

    public c2(String str, String str2) {
        k71.k.g(str, "baseRefName");
        k71.k.g(str2, "headRefName");
        this.a = str;
        this.b = str2;
    }

    public static c2 a(c2 c2Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = c2Var.a;
        }
        if ((i & 2) != 0) {
            str2 = c2Var.b;
        }
        k71.k.g(str, "baseRefName");
        k71.k.g(str2, "headRefName");
        return new c2(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RefNames(baseRefName=", this.a, ", headRefName=", this.b, ")");
    }

    public c2(Object... a) {
    }
}
