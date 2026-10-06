package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z9 implements aaShadow.m0 {
    public aaShadow a;

    public z9(aaShadow aaVar) {
        this.a = aaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9) && k71.k.b(this.a, ((z9) obj).a);
    }

    public final int hashCode() {
        aaShadow aaVar = this.a;
        if (aaVar == null) {
            return 0;
        }
        return aaVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteMobileDeviceToken=" + this.a + ")";
    }
}
