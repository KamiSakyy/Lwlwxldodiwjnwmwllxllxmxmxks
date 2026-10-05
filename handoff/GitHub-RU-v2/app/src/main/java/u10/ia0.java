package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ia0 implements aa.v0 {
    public final ja0 a;

    public ia0(ja0 ja0Var) {
        this.a = ja0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia0) && k71.k.b(this.a, ((ia0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
