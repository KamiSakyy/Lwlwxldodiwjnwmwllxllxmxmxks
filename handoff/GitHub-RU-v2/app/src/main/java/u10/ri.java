package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ri implements aa.v0 {
    public final yi a;

    public ri(yi yiVar) {
        this.a = yiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri) && k71.k.b(this.a, ((ri) obj).a);
    }

    public final int hashCode() {
        yi yiVar = this.a;
        if (yiVar == null) {
            return 0;
        }
        return yiVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
