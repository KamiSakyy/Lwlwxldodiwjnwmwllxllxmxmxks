package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vl implements aaShadow.v0 {
    public final zl a;

    public vl(zl zlVar) {
        this.a = zlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl) && k71.k.b(this.a, ((vl) obj).a);
    }

    public final int hashCode() {
        zl zlVar = this.a;
        if (zlVar == null) {
            return 0;
        }
        return zlVar.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
    public Object ordinal() { return null; }
}
