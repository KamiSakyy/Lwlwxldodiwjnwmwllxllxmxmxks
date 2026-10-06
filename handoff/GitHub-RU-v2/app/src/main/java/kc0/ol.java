package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ol implements aaShadow.m0 {
    public pl a;

    public ol(pl plVar) {
        this.a = plVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol) && k71.k.b(this.a, ((ol) obj).a);
    }

    public final int hashCode() {
        pl plVar = this.a;
        if (plVar == null) {
            return 0;
        }
        return plVar.hashCode();
    }

    public final String toString() {
        return "Data(mobileEventsUpdate=" + this.a + ")";
    }
}
