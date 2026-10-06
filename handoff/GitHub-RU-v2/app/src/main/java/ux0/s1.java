package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 {
    public final String a;
    public final wx0.c b;

    public s1(String str, wx0.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return k71.k.b(this.a, s1Var.a) && k71.k.b(this.b, s1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentProjects(__typename=" + this.a + ", projectV2ConnectionFragment=" + this.b + ")";
    }
}
