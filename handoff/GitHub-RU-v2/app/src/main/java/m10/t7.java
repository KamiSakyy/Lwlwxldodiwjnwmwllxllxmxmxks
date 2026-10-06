package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t7 {
    public final aa1.b a = aa.t0.d;
    public aa1.b b;
    public aa1.b c;

    public t7(aa1.b bVar, aa1.b bVar2) {
        this.b = bVar;
        this.c = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7)) {
            return false;
        }
        t7 t7Var = (t7) obj;
        return k71.k.b(this.a, t7Var.a) && k71.k.b(this.b, t7Var.b) && k71.k.b(this.c, t7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return f1.e.k(jo.f4.u("CopilotAgentTaskFilter(archived=", this.a, ", artifactType=", this.b, ", states="), this.c, ")");
    }
}
