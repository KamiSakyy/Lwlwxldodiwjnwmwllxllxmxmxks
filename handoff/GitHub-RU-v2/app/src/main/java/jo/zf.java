package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zf {
    public String a;
    public String b;
    public wf c;
    public vx.a d;

    public zf(String str, String str2, wf wfVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = wfVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return k71.k.b(this.a, zfVar.a) && k71.k.b(this.b, zfVar.b) && k71.k.b(this.c, zfVar.c) && k71.k.b(this.d, zfVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        wf wfVar = this.c;
        int hashCode = (i + (wfVar == null ? 0 : wfVar.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepoObject(__typename=", this.a, ", oid=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
