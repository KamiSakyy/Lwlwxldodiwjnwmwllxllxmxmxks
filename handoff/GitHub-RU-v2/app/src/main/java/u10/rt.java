package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rt implements aa.v0 {
    public final st a;

    public rt(st stVar) {
        this.a = stVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt) && k71.k.b(this.a, ((rt) obj).a);
    }

    public final int hashCode() {
        st stVar = this.a;
        if (stVar == null) {
            return 0;
        }
        return stVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
