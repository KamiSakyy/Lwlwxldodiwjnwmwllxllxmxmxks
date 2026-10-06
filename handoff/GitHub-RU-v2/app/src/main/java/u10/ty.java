package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ty {
    public final sy a;

    public ty(sy syVar) {
        this.a = syVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty) && k71.k.b(this.a, ((ty) obj).a);
    }

    public final int hashCode() {
        sy syVar = this.a;
        if (syVar == null) {
            return 0;
        }
        return syVar.hashCode();
    }

    public final String toString() {
        return "SetLabelsForLabelable(labelableRecord=" + this.a + ")";
    }
}
