package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b2 {
    public final String a;
    public final Boolean b;
    public final String c;

    public b2(Boolean bool, String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = bool;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return k71.k.b(this.a, b2Var.a) && k71.k.b(this.b, b2Var.b) && k71.k.b(this.c, b2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Issue(id=");
        sb.append(this.a);
        sb.append(", isPinned=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
