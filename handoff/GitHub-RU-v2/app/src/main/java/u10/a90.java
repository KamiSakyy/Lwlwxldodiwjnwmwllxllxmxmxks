package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a90 implements aaShadow.v0 {
    public b90 a;

    public a90(b90 b90Var) {
        this.a = b90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a90) && k71.k.b(this.a, ((a90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
