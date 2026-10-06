package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yl implements aaShadow.m0 {
    public zl a;

    public yl(zl zlVar) {
        this.a = zlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl) && k71.k.b(this.a, ((yl) obj).a);
    }

    public final int hashCode() {
        zl zlVar = this.a;
        if (zlVar == null) {
            return 0;
        }
        return zlVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsRead=" + this.a + ")";
    }
}
