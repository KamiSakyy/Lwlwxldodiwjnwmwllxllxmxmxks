package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cm implements aaShadow.m0 {
    public final dm a;

    public cm(dm dmVar) {
        this.a = dmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm) && k71.k.b(this.a, ((cm) obj).a);
    }

    public final int hashCode() {
        dm dmVar = this.a;
        if (dmVar == null) {
            return 0;
        }
        return dmVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsUndone=" + this.a + ")";
    }
}
