package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bl implements aaShadow.m0 {
    public al a;

    public bl(al alVar) {
        this.a = alVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl) && k71.k.b(this.a, ((bl) obj).a);
    }

    public final int hashCode() {
        al alVar = this.a;
        if (alVar == null) {
            return 0;
        }
        return alVar.hashCode();
    }

    public final String toString() {
        return "Data(createSavedNotificationThread=" + this.a + ")";
    }
}
