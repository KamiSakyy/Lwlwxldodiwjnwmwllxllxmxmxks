package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o80 implements aaShadow.v0 {
    public p80 a;

    public o80(p80 p80Var) {
        this.a = p80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o80) && k71.k.b(this.a, ((o80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
