package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ey implements aa.v0 {
    public final fy a;

    public ey(fy fyVar) {
        this.a = fyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey) && k71.k.b(this.a, ((ey) obj).a);
    }

    public final int hashCode() {
        fy fyVar = this.a;
        if (fyVar == null) {
            return 0;
        }
        return fyVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
