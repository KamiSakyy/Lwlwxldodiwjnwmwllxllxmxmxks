package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public final String a;
    public final wx0.c b;

    public r(String str, wx0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentProjects(__typename=" + this.a + ", projectV2ConnectionFragment=" + this.b + ")";
    }
}
