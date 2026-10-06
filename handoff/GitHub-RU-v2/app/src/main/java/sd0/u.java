package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public final String a;
    public final String b;
    public final v c;

    public u(String str, String str2, v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        v vVar = this.c;
        return hashCode2 + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("File(extension=", this.a, ", path=", this.b, ", fileType=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
