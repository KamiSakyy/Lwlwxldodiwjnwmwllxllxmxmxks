package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ww implements aaShadow.v0 {
    public ax a;

    public ww(ax axVar) {
        this.a = axVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww) && k71.k.b(this.a, ((ww) obj).a);
    }

    public final int hashCode() {
        ax axVar = this.a;
        if (axVar == null) {
            return 0;
        }
        return axVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
