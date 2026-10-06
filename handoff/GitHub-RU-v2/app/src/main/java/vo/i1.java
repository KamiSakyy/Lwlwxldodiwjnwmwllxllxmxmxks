package vo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public String a;
    public l1 b;
    public String c;

    public i1(String str, l1 l1Var, String str2) {
        this.a = str;
        this.b = l1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Commit(id=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
