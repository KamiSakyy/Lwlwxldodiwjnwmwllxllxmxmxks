package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wn implements aaShadow.v0 {
    public yn a;

    public wn(yn ynVar) {
        this.a = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn) && k71.k.b(this.a, ((wn) obj).a);
    }

    public final int hashCode() {
        yn ynVar = this.a;
        if (ynVar == null) {
            return 0;
        }
        return ynVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
