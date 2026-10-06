package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kd implements aaShadow.v0 {
    public final qd a;

    public kd(qd qdVar) {
        this.a = qdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd) && k71.k.b(this.a, ((kd) obj).a);
    }

    public final int hashCode() {
        qd qdVar = this.a;
        if (qdVar == null) {
            return 0;
        }
        return qdVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
