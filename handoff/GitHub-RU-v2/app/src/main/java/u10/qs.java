package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qs implements aaShadow.v0 {
    public final ss a;

    public qs(ss ssVar) {
        this.a = ssVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs) && k71.k.b(this.a, ((qs) obj).a);
    }

    public final int hashCode() {
        ss ssVar = this.a;
        if (ssVar == null) {
            return 0;
        }
        return ssVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
