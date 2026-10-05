package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wf {
    public final String a;
    public final zf b;
    public final kw0.a c;

    public wf(String str, zf zfVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = zfVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return k71.k.b(this.a, wfVar.a) && k71.k.b(this.b, wfVar.b) && k71.k.b(this.c, wfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zf zfVar = this.b;
        int hashCode2 = (hashCode + (zfVar == null ? 0 : zfVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
