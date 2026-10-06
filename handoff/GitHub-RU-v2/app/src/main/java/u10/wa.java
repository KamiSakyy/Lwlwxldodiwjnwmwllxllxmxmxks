package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wa implements aaShadow.v0 {
    public xa a;

    public wa(xa xaVar) {
        this.a = xaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa) && k71.k.b(this.a, ((wa) obj).a);
    }

    public final int hashCode() {
        xa xaVar = this.a;
        if (xaVar == null) {
            return 0;
        }
        return xaVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
