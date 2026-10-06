package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zp {
    public String a;
    public vp b;
    public yp c;
    public String d;

    public zp(String str, vp vpVar, yp ypVar, String str2) {
        this.a = str;
        this.b = vpVar;
        this.c = ypVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return k71.k.b(this.a, zpVar.a) && k71.k.b(this.b, zpVar.b) && k71.k.b(this.c, zpVar.c) && k71.k.b(this.d, zpVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vp vpVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (vpVar == null ? 0 : vpVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", latestRelease=" + this.b + ", releases=" + this.c + ", __typename=" + this.d + ")";
    }
}
