package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zf {
    public String a;
    public xf b;

    public zf(String str, xf xfVar) {
        this.a = str;
        this.b = xfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf)) {
            return false;
        }
        zf zfVar = (zf) obj;
        return k71.k.b(this.a, zfVar.a) && k71.k.b(this.b, zfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", history=" + this.b + ")";
    }
}
