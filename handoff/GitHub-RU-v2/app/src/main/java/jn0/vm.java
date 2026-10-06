package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vm {
    public final String a;
    public final String b;
    public final pz0.si c;
    public final boolean d;
    public final tm e;
    public final um f;

    public vm(String str, String str2, pz0.si siVar, boolean z, tm tmVar, um umVar) {
        this.a = str;
        this.b = str2;
        this.c = siVar;
        this.d = z;
        this.e = tmVar;
        this.f = umVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm)) {
            return false;
        }
        vm vmVar = (vm) obj;
        return k71.k.b(this.a, vmVar.a) && k71.k.b(this.b, vmVar.b) && this.c == vmVar.c && this.d == vmVar.d && k71.k.b(this.e, vmVar.e) && k71.k.b(this.f, vmVar.f);
    }

    public final int hashCode() {
        int e = x.i.e((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
        tm tmVar = this.e;
        int hashCode = (e + (tmVar == null ? 0 : tmVar.hashCode())) * 31;
        um umVar = this.f;
        return hashCode + (umVar != null ? umVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(id=", this.a, ", headRefOid=", this.b, ", mergeStateStatus=");
        o.append(this.c);
        o.append(", isInMergeQueue=");
        o.append(this.d);
        o.append(", mergeQueue=");
        o.append(this.e);
        o.append(", mergeQueueEntry=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
