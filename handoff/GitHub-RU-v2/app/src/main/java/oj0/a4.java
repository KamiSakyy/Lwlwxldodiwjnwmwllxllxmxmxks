package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 implements aa.h0 {
    public String a;
    public y3 b;
    public String c;

    public a4(String str, y3 y3Var, String str2) {
        this.a = str;
        this.b = y3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && k71.k.b(this.b, a4Var.b) && k71.k.b(this.c, a4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserListMetadataForRepositoryFragment(id=");
        sb.append(this.a);
        sb.append(", lists=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
