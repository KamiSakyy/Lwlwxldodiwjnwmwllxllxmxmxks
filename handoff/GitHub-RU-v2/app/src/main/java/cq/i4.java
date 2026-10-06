package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i4 {
    public String a;
    public String b;
    public j4 c;

    public i4(String str, String str2, j4 j4Var) {
        this.a = str;
        this.b = str2;
        this.c = j4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return k71.k.b(this.a, i4Var.a) && k71.k.b(this.b, i4Var.b) && k71.k.b(this.c, i4Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j4 j4Var = this.c;
        return hashCode2 + (j4Var != null ? j4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("File(extension=", this.a, ", path=", this.b, ", fileType=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
