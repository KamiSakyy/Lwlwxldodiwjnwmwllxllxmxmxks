package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 {
    public final q a;
    public final y b;

    public o1(q qVar, y yVar) {
        this.a = qVar;
        this.b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b);
    }

    public final int hashCode() {
        q qVar = this.a;
        return this.b.hashCode() + ((qVar == null ? 0 : qVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldUserValue(actors=" + this.a + ", field=" + this.b + ")";
    }
}
