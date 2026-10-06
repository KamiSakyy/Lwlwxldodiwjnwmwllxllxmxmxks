package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qu {
    public final uu a;
    public final String b;

    public qu(uu uuVar, String str) {
        this.a = uuVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        return k71.k.b(this.a, quVar.a) && k71.k.b(this.b, quVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOrganization(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
