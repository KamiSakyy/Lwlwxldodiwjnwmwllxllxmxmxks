package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wf {
    public String a;
    public uf b;

    public wf(String str, uf ufVar) {
        this.a = str;
        this.b = ufVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return k71.k.b(this.a, wfVar.a) && k71.k.b(this.b, wfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        uf ufVar = this.b;
        return hashCode + (ufVar == null ? 0 : ufVar.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
