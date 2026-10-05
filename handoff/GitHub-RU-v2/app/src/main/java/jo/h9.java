package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h9 {
    public final String a;
    public final o9 b;
    public final m9 c;
    public final String d;

    public h9(String str, o9 o9Var, m9 m9Var, String str2) {
        this.a = str;
        this.b = o9Var;
        this.c = m9Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        h9 h9Var = (h9) obj;
        return k71.k.b(this.a, h9Var.a) && k71.k.b(this.b, h9Var.b) && k71.k.b(this.c, h9Var.c) && k71.k.b(this.d, h9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o9 o9Var = this.b;
        int hashCode2 = (hashCode + (o9Var == null ? 0 : o9Var.hashCode())) * 31;
        m9 m9Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (m9Var != null ? m9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Comment(id=" + this.a + ", replyTo=" + this.b + ", discussion=" + this.c + ", __typename=" + this.d + ")";
    }
}
