package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ma0 implements aaShadow.v0 {
    public qa0 a;

    public ma0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma0) && k71.k.b(this.a, ((ma0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
