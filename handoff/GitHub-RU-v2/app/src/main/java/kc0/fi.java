package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fi implements aaShadow.m0 {
    public ei a;

    public fi(ei eiVar) {
        this.a = eiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi) && k71.k.b(this.a, ((fi) obj).a);
    }

    public final int hashCode() {
        ei eiVar = this.a;
        if (eiVar == null) {
            return 0;
        }
        return eiVar.hashCode();
    }

    public final String toString() {
        return "Data(createSavedNotificationThread=" + this.a + ")";
    }
}
