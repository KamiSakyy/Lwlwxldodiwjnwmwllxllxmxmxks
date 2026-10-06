package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m3 {
    public String a;
    public String b;
    public n3 c;

    public m3(String str, String str2, n3 n3Var) {
        this.a = str;
        this.b = str2;
        this.c = n3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.a, m3Var.a) && k71.k.b(this.b, m3Var.b) && k71.k.b(this.c, m3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n3 n3Var = this.c;
        return hashCode2 + (n3Var != null ? n3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("File(extension=", this.a, ", path=", this.b, ", fileType=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
