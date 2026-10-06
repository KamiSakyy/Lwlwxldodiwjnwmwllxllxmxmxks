package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class td implements aaShadow.v0 {
    public final xd a;

    public td(xd xdVar) {
        this.a = xdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td) && k71.k.b(this.a, ((td) obj).a);
    }

    public final int hashCode() {
        xd xdVar = this.a;
        if (xdVar == null) {
            return 0;
        }
        return xdVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
