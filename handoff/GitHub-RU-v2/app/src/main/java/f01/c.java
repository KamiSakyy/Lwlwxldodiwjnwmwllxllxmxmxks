package f01;

import a0.s0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements e {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public c(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
    }

    @Override // f01.e
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && k.b(this.f, cVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("MultiLine(baseCommitOid=", this.a, ", headCommitOid=", this.b, ", endCommitOid=");
        f1.e.x(o, this.c, ", startCommitOid=", this.d, ", startLine=");
        o.append(this.e);
        o.append(", endLine=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object d = null;
}
