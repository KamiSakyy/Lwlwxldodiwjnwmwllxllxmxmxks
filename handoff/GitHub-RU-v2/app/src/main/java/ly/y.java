package ly;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public final x a;

    public y(x xVar) {
        this.a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        x xVar = this.a;
        if (xVar == null) {
            return 0;
        }
        return xVar.hashCode();
    }

    public final String toString() {
        return "UpdateUserList(list=" + this.a + ")";
    }
}
