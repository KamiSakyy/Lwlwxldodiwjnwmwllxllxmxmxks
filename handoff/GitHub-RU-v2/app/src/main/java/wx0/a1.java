package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 {
    public String a;
    public r0 b;

    public a1(String str, r0 r0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r0 r0Var = this.b;
        return hashCode + (r0Var == null ? 0 : r0Var.a.hashCode());
    }

    public final String toString() {
        return "OnProjectV2FieldConfiguration7(__typename=" + this.a + ", onProjectV2FieldCommon=" + this.b + ")";
    }
}
