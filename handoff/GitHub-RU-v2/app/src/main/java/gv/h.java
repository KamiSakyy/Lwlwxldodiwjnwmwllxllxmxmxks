package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public h(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d) && k71.k.b(this.e, hVar.e) && k71.k.b(this.f, hVar.f) && k71.k.b(this.g, hVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnMultilineComment(__typename=", this.a, ", baseCommitOid=", this.b, ", headCommitOid=");
        f1.e.x(o, this.c, ", endCommitOid=", this.d, ", startCommitOid=");
        o.append(this.e);
        o.append(", startLine=");
        o.append(this.f);
        o.append(", endLine=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
