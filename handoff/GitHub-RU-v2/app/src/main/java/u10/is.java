package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class is implements aa.v0 {
    public final ks a;

    public is(ks ksVar) {
        this.a = ksVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is) && k71.k.b(this.a, ((is) obj).a);
    }

    public final int hashCode() {
        ks ksVar = this.a;
        if (ksVar == null) {
            return 0;
        }
        return ksVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
