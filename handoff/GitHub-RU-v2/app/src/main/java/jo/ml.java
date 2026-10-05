package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ml implements aa.m0 {
    public final nl a;

    public ml(nl nlVar) {
        this.a = nlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml) && k71.k.b(this.a, ((ml) obj).a);
    }

    public final int hashCode() {
        nl nlVar = this.a;
        if (nlVar == null) {
            return 0;
        }
        return nlVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteSavedNotificationThread=" + this.a + ")";
    }
}
