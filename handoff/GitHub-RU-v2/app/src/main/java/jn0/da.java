package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class da {
    public final String a;
    public final String b;
    public final int c;
    public final ca d;
    public final aa e;
    public final String f;

    public da(String str, String str2, int i, ca caVar, aa aaVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = caVar;
        this.e = aaVar;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return k71.k.b(this.a, daVar.a) && k71.k.b(this.b, daVar.b) && this.c == daVar.c && k71.k.b(this.d, daVar.d) && k71.k.b(this.e, daVar.e) && k71.k.b(this.f, daVar.f);
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
