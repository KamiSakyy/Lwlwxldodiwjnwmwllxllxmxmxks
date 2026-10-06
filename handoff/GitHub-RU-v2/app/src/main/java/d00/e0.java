package d00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public final String a;
    public final b0 b;
    public final f00.b0 c;

    public e0(String str, b0 b0Var, f00.b0 b0Var2) {
        this.a = str;
        this.b = b0Var;
        this.c = b0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b0 b0Var = this.b;
        return this.c.hashCode() + ((hashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Node2(__typename=" + this.a + ", item=" + this.b + ", projectV2ItemSortValuesFragment=" + this.c + ")";
    }
}
