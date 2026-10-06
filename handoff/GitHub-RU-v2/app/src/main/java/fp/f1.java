package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow {
    public String a;
    public eq.g b;

    public f1(String str, eq.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1Shadow)) {
            return false;
        }
        f1Shadow f1Var = (f1Shadow) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eq.g gVar = this.b;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "Owner(__typename=" + this.a + ", avatarFragment=" + this.b + ")";
    }
}
