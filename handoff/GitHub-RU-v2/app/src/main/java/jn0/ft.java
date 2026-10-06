package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ft {
    public final String a;
    public final bt b;
    public final et c;
    public final String d;

    public ft(String str, bt btVar, et etVar, String str2) {
        this.a = str;
        this.b = btVar;
        this.c = etVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft)) {
            return false;
        }
        ft ftVar = (ft) obj;
        return k71.k.b(this.a, ftVar.a) && k71.k.b(this.b, ftVar.b) && k71.k.b(this.c, ftVar.c) && k71.k.b(this.d, ftVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bt btVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (btVar == null ? 0 : btVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", latestRelease=" + this.b + ", releases=" + this.c + ", __typename=" + this.d + ")";
    }
}
