package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ab {
    public final String a;
    public final aa1.b b;
    public final aa1.b c;
    public final String d;

    public ab(aa1.b bVar, String str, String str2) {
        k71.k.g(str2, "workflowId");
        this.a = str;
        this.b = aa.t0.d;
        this.c = bVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return k71.k.b(this.a, abVar.a) && k71.k.b(this.b, abVar.b) && k71.k.b(this.c, abVar.c) && k71.k.b(this.d, abVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.b, "DispatchWorkflowRunInput(branch=", this.a, ", clientMutationId=", ", dispatchInputs=");
        o.append(this.c);
        o.append(", workflowId=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
