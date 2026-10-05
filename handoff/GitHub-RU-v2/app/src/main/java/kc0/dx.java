package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dx implements aa.v0 {
    public final ex a;

    public dx(ex exVar) {
        this.a = exVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && k71.k.b(this.a, ((dx) obj).a);
    }

    public final int hashCode() {
        ex exVar = this.a;
        if (exVar == null) {
            return 0;
        }
        return exVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
