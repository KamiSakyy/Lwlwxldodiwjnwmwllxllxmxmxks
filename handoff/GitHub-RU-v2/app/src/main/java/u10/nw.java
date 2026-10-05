package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nw implements aa.v0 {
    public final pw a;

    public nw(pw pwVar) {
        this.a = pwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw) && k71.k.b(this.a, ((nw) obj).a);
    }

    public final int hashCode() {
        pw pwVar = this.a;
        if (pwVar == null) {
            return 0;
        }
        return pwVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
