package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements aa.v0 {
    public final f1 a;

    public b1(f1 f1Var) {
        this.a = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && k71.k.b(this.a, ((b1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
