package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ta0 implements aaShadow.v0 {
    public final xa0 a;

    public ta0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta0) && k71.k.b(this.a, ((ta0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
