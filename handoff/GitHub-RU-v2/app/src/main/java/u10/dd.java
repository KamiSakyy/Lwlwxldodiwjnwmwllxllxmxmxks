package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dd implements aaShadow.v0 {
    public final hd a;

    public dd(hd hdVar) {
        this.a = hdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd) && k71.k.b(this.a, ((dd) obj).a);
    }

    public final int hashCode() {
        hd hdVar = this.a;
        if (hdVar == null) {
            return 0;
        }
        return hdVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
