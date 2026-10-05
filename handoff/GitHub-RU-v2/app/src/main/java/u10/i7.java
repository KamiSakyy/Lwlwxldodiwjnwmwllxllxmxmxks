package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 {
    public final String a;
    public final p7 b;
    public final n7 c;
    public final String d;

    public i7(String str, p7 p7Var, n7 n7Var, String str2) {
        this.a = str;
        this.b = p7Var;
        this.c = n7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return k71.k.b(this.a, i7Var.a) && k71.k.b(this.b, i7Var.b) && k71.k.b(this.c, i7Var.c) && k71.k.b(this.d, i7Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p7 p7Var = this.b;
        int hashCode2 = (hashCode + (p7Var == null ? 0 : p7Var.hashCode())) * 31;
        n7 n7Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (n7Var != null ? n7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Comment(id=" + this.a + ", replyTo=" + this.b + ", discussion=" + this.c + ", __typename=" + this.d + ")";
    }
}
