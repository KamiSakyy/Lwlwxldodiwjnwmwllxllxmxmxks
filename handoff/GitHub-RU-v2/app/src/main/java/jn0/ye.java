package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ye {
    public String a;
    public we b;

    public ye(String str, we weVar) {
        this.a = str;
        this.b = weVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return k71.k.b(this.a, yeVar.a) && k71.k.b(this.b, yeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        we weVar = this.b;
        return hashCode + (weVar == null ? 0 : weVar.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
