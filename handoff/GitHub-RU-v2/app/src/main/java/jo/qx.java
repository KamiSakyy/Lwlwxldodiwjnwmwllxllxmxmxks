package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qx {
    public final nx a;

    public qx(nx nxVar) {
        this.a = nxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx) && k71.k.b(this.a, ((qx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(forks=" + this.a + ")";
    }

















































}
