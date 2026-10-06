package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aaShadow.m0 {
    public y a;

    public a0(y yVar) {
        this.a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && k71.k.b(this.a, ((a0) obj).a);
    }

    public final int hashCode() {
        y yVar = this.a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public final String toString() {
        return "Data(addMobileDeviceToken=" + this.a + ")";
    }
}
