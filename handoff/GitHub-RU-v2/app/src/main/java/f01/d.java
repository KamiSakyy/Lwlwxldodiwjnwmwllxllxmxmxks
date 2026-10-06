package f01;

import a0.s0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements e {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public d(String str, String str2, String str3, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    @Override // f01.e
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c) && k.b(this.d, dVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("SingleLine(baseCommitOid=", this.a, ", headCommitOid=", this.b, ", commitOid=");
        o.append(this.c);
        o.append(", line=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object b = null;
}
