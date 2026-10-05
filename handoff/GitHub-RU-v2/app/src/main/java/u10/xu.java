package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xu implements aa.v0 {
    public final yu a;

    public xu(yu yuVar) {
        this.a = yuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu) && k71.k.b(this.a, ((xu) obj).a);
    }

    public final int hashCode() {
        yu yuVar = this.a;
        if (yuVar == null) {
            return 0;
        }
        return yuVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
