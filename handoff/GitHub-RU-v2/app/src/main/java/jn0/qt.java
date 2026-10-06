package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qt {
    public rt a;
    public pt b;

    public qt(rt rtVar, pt ptVar) {
        this.a = rtVar;
        this.b = ptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return k71.k.b(this.a, qtVar.a) && k71.k.b(this.b, qtVar.b);
    }

    public final int hashCode() {
        rt rtVar = this.a;
        int hashCode = (rtVar == null ? 0 : rtVar.hashCode()) * 31;
        pt ptVar = this.b;
        return hashCode + (ptVar != null ? ptVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }
}
