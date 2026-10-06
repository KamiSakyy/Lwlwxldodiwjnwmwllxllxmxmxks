package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qn implements aaShadow.v0 {
    public tn a;

    public qn(tn tnVar) {
        this.a = tnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn) && k71.k.b(this.a, ((qn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
