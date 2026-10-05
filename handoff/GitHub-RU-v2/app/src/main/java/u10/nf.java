package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nf implements aa.v0 {
    public final of a;

    public nf(of ofVar) {
        this.a = ofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf) && k71.k.b(this.a, ((nf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
