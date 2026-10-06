package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w10 {
    public final String a;
    public final vx.a b;

    public w10(String str, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        return k71.k.b(this.a, w10Var.a) && k71.k.b(this.b, w10Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ")";
    }
}
