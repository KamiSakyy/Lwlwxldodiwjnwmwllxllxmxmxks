package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fv implements aaShadow.v0 {
    public gv a;

    public fv(gv gvVar) {
        this.a = gvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv) && k71.k.b(this.a, ((fv) obj).a);
    }

    public final int hashCode() {
        gv gvVar = this.a;
        if (gvVar == null) {
            return 0;
        }
        return gvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
