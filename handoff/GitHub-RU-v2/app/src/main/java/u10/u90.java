package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u90 implements aaShadow.v0 {
    public w90 a;

    public u90(w90 w90Var) {
        this.a = w90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u90) && k71.k.b(this.a, ((u90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
