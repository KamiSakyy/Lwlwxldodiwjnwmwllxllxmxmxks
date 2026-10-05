package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vn implements aa.v0 {
    public final yn a;

    public vn(yn ynVar) {
        this.a = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vn) && k71.k.b(this.a, ((vn) obj).a);
    }

    public final int hashCode() {
        yn ynVar = this.a;
        if (ynVar == null) {
            return 0;
        }
        return ynVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
