package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iy implements aa.v0 {
    public final jy a;

    public iy(jy jyVar) {
        this.a = jyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy) && k71.k.b(this.a, ((iy) obj).a);
    }

    public final int hashCode() {
        jy jyVar = this.a;
        if (jyVar == null) {
            return 0;
        }
        return jyVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
