package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a60 implements aaShadow.m0 {
    public b60 a;

    public a60(b60 b60Var) {
        this.a = b60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a60) && k71.k.b(this.a, ((a60) obj).a);
    }

    public final int hashCode() {
        b60 b60Var = this.a;
        if (b60Var == null) {
            return 0;
        }
        return b60Var.hashCode();
    }

    public final String toString() {
        return "Data(replaceActorsForAssignable=" + this.a + ")";
    }
}
