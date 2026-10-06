package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final String a;
    public final int b;
    public final n c;
    public final String d;

    public o(String str, int i, n nVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = nVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && this.b == oVar.b && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "WorkflowRun(id=", this.a, ", runNumber=", ", workflow=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
