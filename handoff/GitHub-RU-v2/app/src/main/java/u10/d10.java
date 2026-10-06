package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d10 implements aaShadow.v0 {
    public final h10 a;

    public d10(h10 h10Var) {
        this.a = h10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d10) && k71.k.b(this.a, ((d10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
