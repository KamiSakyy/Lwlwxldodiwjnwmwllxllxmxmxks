package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v3 implements aa.h0 {
    public final String a;
    public final t3 b;
    public final String c;

    public v3(String str, t3 t3Var, String str2) {
        this.a = str;
        this.b = t3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return k71.k.b(this.a, v3Var.a) && k71.k.b(this.b, v3Var.b) && k71.k.b(this.c, v3Var.c);
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
