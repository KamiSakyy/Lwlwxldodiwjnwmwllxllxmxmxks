package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ec {
    public final gc a;

    public ec(gc gcVar) {
        this.a = gcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec) && k71.k.b(this.a, ((ec) obj).a);
    }

    public final int hashCode() {
        gc gcVar = this.a;
        if (gcVar == null) {
            return 0;
        }
        return gcVar.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
