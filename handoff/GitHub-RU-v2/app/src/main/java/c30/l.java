package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;
    public String b;
    public m c;

    public l(String str, String str2, m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        m mVar = this.c;
        return hashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("File(extension=", this.a, ", path=", this.b, ", fileType=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
