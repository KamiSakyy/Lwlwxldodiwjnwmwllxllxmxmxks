package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.v0 {
    public o0 a;

    public d(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
