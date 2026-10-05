package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ax {
    public final ex a;
    public final String b;

    public ax(ex exVar, String str) {
        this.a = exVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax)) {
            return false;
        }
        ax axVar = (ax) obj;
        return k71.k.b(this.a, axVar.a) && k71.k.b(this.b, axVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOrganization(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
