package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class th implements aaShadow.m0 {
    public uh a;

    public th(uh uhVar) {
        this.a = uhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th) && k71.k.b(this.a, ((th) obj).a);
    }

    public final int hashCode() {
        uh uhVar = this.a;
        if (uhVar == null) {
            return 0;
        }
        return uhVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
