package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dr {
    public final String a;
    public final zq b;
    public final cr c;
    public final String d;

    public dr(String str, zq zqVar, cr crVar, String str2) {
        this.a = str;
        this.b = zqVar;
        this.c = crVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr)) {
            return false;
        }
        dr drVar = (dr) obj;
        return k71.k.b(this.a, drVar.a) && k71.k.b(this.b, drVar.b) && k71.k.b(this.c, drVar.c) && k71.k.b(this.d, drVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zq zqVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (zqVar == null ? 0 : zqVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", latestRelease=" + this.b + ", releases=" + this.c + ", __typename=" + this.d + ")";
    }
}
