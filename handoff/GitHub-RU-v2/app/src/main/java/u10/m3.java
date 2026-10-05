package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 {
    public final String a;
    public final l3 b;
    public final String c;

    public m3(String str, l3 l3Var, String str2) {
        this.a = str;
        this.b = l3Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.a, m3Var.a) && k71.k.b(this.b, m3Var.b) && k71.k.b(this.c, m3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l3 l3Var = this.b;
        return this.c.hashCode() + ((hashCode + (l3Var == null ? 0 : l3Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(id=");
        sb.append(this.a);
        sb.append(", savedReplies=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
