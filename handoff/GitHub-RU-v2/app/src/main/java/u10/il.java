package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class il implements aaShadow.v0 {
    public kl a;

    public il(kl klVar) {
        this.a = klVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il) && k71.k.b(this.a, ((il) obj).a);
    }

    public final int hashCode() {
        kl klVar = this.a;
        if (klVar == null) {
            return 0;
        }
        return klVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
