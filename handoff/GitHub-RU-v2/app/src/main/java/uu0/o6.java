package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 implements aa.h0 {
    public String a;
    public m6 b;
    public String c;

    public o6(String str, m6 m6Var, String str2) {
        this.a = str;
        this.b = m6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && k71.k.b(this.c, o6Var.c);
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
