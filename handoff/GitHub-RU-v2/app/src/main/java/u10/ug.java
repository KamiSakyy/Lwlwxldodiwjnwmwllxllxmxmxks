package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ug implements aaShadow.m0 {
    public vg a;

    public ug(vg vgVar) {
        this.a = vgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug) && k71.k.b(this.a, ((ug) obj).a);
    }

    public final int hashCode() {
        vg vgVar = this.a;
        if (vgVar == null) {
            return 0;
        }
        return vgVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsDone=" + this.a + ")";
    }
}
