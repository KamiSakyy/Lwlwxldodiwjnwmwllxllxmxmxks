package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements aa.v0 {
    public final e1 a;

    public a1(e1 e1Var) {
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && k71.k.b(this.a, ((a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
