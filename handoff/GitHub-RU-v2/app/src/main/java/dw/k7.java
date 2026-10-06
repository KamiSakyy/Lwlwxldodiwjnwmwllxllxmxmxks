package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k7 implements aa.h0 {
    public String a;
    public i7 b;
    public String c;

    public k7(String str, i7 i7Var, String str2) {
        this.a = str;
        this.b = i7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return k71.k.b(this.a, k7Var.a) && k71.k.b(this.b, k7Var.b) && k71.k.b(this.c, k7Var.c);
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
