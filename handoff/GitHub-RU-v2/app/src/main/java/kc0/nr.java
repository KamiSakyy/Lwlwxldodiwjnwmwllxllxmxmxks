package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nr {
    public final or a;
    public final mr b;

    public nr(or orVar, mr mrVar) {
        this.a = orVar;
        this.b = mrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) obj;
        return k71.k.b(this.a, nrVar.a) && k71.k.b(this.b, nrVar.b);
    }

    public final int hashCode() {
        or orVar = this.a;
        int hashCode = (orVar == null ? 0 : orVar.hashCode()) * 31;
        mr mrVar = this.b;
        return hashCode + (mrVar != null ? mrVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }
}
