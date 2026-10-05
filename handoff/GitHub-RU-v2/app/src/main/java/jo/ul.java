package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ul implements aa.m0 {
    public final vl a;

    public ul(vl vlVar) {
        this.a = vlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul) && k71.k.b(this.a, ((ul) obj).a);
    }

    public final int hashCode() {
        vl vlVar = this.a;
        if (vlVar == null) {
            return 0;
        }
        return vlVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsDone=" + this.a + ")";
    }
}
