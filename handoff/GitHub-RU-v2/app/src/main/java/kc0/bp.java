package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bp implements aaShadow.v0 {
    public final dp a;

    public bp(dp dpVar) {
        this.a = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp) && k71.k.b(this.a, ((bp) obj).a);
    }

    public final int hashCode() {
        dp dpVar = this.a;
        if (dpVar == null) {
            return 0;
        }
        return dpVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
