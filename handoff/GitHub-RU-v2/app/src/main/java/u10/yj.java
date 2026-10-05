package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yj implements aa.v0 {
    public final bk a;

    public yj(bk bkVar) {
        this.a = bkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj) && k71.k.b(this.a, ((yj) obj).a);
    }

    public final int hashCode() {
        bk bkVar = this.a;
        if (bkVar == null) {
            return 0;
        }
        return bkVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
