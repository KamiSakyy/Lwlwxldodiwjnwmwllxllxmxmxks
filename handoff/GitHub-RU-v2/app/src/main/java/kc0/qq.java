package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qq {
    public tq a;

    public qq(tq tqVar) {
        this.a = tqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq) && k71.k.b(this.a, ((qq) obj).a);
    }

    public final int hashCode() {
        tq tqVar = this.a;
        if (tqVar == null) {
            return 0;
        }
        return tqVar.hashCode();
    }

    public final String toString() {
        return "Tagger(user=" + this.a + ")";
    }
}
