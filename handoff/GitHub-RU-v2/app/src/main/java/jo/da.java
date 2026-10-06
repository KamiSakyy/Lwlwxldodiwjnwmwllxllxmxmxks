package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class da implements aaShadow.m0 {
    public final eaShadow a;

    public da(eaShadow eaVar) {
        this.a = eaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da) && k71.k.b(this.a, ((da) obj).a);
    }

    public final int hashCode() {
        eaShadow eaVar = this.a;
        if (eaVar == null) {
            return 0;
        }
        return eaVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteRef=" + this.a + ")";
    }
}
