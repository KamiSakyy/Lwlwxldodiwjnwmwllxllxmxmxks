package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class el {
    public final String a;
    public final String b;
    public final gn0.gg c;
    public final boolean d;
    public final cl e;
    public final dl f;

    public el(String str, String str2, gn0.gg ggVar, boolean z, cl clVar, dl dlVar) {
        this.a = str;
        this.b = str2;
        this.c = ggVar;
        this.d = z;
        this.e = clVar;
        this.f = dlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el)) {
            return false;
        }
        el elVar = (el) obj;
        return k71.k.b(this.a, elVar.a) && k71.k.b(this.b, elVar.b) && this.c == elVar.c && this.d == elVar.d && k71.k.b(this.e, elVar.e) && k71.k.b(this.f, elVar.f);
    }

    public final int hashCode() {
        int e = x.i.e((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
        cl clVar = this.e;
        int hashCode = (e + (clVar == null ? 0 : clVar.hashCode())) * 31;
        dl dlVar = this.f;
        return hashCode + (dlVar != null ? dlVar.hashCode() : 0);
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
