package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lm implements aaShadow.v0 {
    public final mm a;

    public lm(mm mmVar) {
        this.a = mmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm) && k71.k.b(this.a, ((lm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
