package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mu implements aa.v0 {
    public final ou a;

    public mu(ou ouVar) {
        this.a = ouVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu) && k71.k.b(this.a, ((mu) obj).a);
    }

    public final int hashCode() {
        ou ouVar = this.a;
        if (ouVar == null) {
            return 0;
        }
        return ouVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
