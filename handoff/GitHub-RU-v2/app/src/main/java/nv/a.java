package nv;

import aa.h0;
import com.github.rudroid.copilot.h1;
import f1.e;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public a(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e) && k.b(this.f, aVar.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.f.hashCode() + h1.i((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiLineCommentFields(startLine=");
        sb.append(this.a);
        sb.append(", endLine=");
        sb.append(this.b);
        sb.append(", startLineType=");
        e.x(sb, this.c, ", endLineType=", this.d, ", id=");
        return i.k(sb, this.e, ", __typename=", this.f, ")");
    }
}
