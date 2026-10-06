package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class el implements aaShadow.m0 {
    public fl a;

    public el(fl flVar) {
        this.a = flVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el) && k71.k.b(this.a, ((el) obj).a);
    }

    public final int hashCode() {
        fl flVar = this.a;
        if (flVar == null) {
            return 0;
        }
        return flVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUndone=" + this.a + ")";
    }
}
