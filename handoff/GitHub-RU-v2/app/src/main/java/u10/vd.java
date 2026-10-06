package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vd {
    public final String a;

    public vd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd) && k71.k.b(this.a, ((vd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
