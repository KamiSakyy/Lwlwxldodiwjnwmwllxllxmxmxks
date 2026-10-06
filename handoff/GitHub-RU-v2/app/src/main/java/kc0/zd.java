package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zd {
    public String a;
    public xd b;

    public zd(String str, xd xdVar) {
        this.a = str;
        this.b = xdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return k71.k.b(this.a, zdVar.a) && k71.k.b(this.b, zdVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xd xdVar = this.b;
        return hashCode + (xdVar == null ? 0 : xdVar.a.hashCode());
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", file=" + this.b + ")";
    }
}
