package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dv {
    public String a;
    public zu b;
    public cv c;
    public String d;

    public dv(String str, zu zuVar, cv cvVar, String str2) {
        this.a = str;
        this.b = zuVar;
        this.c = cvVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return k71.k.b(this.a, dvVar.a) && k71.k.b(this.b, dvVar.b) && k71.k.b(this.c, dvVar.c) && k71.k.b(this.d, dvVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zu zuVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (zuVar == null ? 0 : zuVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Repository(id=" + this.a + ", latestRelease=" + this.b + ", releases=" + this.c + ", __typename=" + this.d + ")";
    }
}
