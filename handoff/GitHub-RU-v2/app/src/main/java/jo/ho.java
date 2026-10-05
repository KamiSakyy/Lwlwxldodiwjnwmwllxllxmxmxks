package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ho {
    public final String a;
    public final String b;
    public final m10.wm c;
    public final boolean d;
    public final fo e;
    public final go f;

    public ho(String str, String str2, m10.wm wmVar, boolean z, fo foVar, go goVar) {
        this.a = str;
        this.b = str2;
        this.c = wmVar;
        this.d = z;
        this.e = foVar;
        this.f = goVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return k71.k.b(this.a, hoVar.a) && k71.k.b(this.b, hoVar.b) && this.c == hoVar.c && this.d == hoVar.d && k71.k.b(this.e, hoVar.e) && k71.k.b(this.f, hoVar.f);
    }

    public final int hashCode() {
        int e = x.i.e((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
        fo foVar = this.e;
        int hashCode = (e + (foVar == null ? 0 : foVar.hashCode())) * 31;
        go goVar = this.f;
        return hashCode + (goVar != null ? goVar.hashCode() : 0);
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
