package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v80 implements aaShadow.v0 {
    public final w80 a;

    public v80(w80 w80Var) {
        this.a = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v80) && k71.k.b(this.a, ((v80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
