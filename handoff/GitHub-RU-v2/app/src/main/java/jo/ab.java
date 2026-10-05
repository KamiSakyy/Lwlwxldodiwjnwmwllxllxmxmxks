package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ab {
    public final String a;
    public final String b;
    public final int c;
    public final za d;
    public final xa e;
    public final String f;

    public ab(String str, String str2, int i, za zaVar, xa xaVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zaVar;
        this.e = xaVar;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return k71.k.b(this.a, abVar.a) && k71.k.b(this.b, abVar.b) && this.c == abVar.c && k71.k.b(this.d, abVar.d) && k71.k.b(this.e, abVar.e) && k71.k.b(this.f, abVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRun(id=", this.a, ", url=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", workflow=");
        o.append(this.d);
        o.append(", pendingDeploymentRequests=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
