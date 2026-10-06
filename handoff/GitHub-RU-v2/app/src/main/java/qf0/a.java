package qf0;

import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import gn0.s8;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public s8 a;
    public String b;
    public Integer c;
    public Integer d;
    public String e;
    public boolean f;

    public a(s8 s8Var, String str, Integer num, Integer num2, String str2, boolean z) {
        this.a = s8Var;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + h1.i((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffLineFragment(type=");
        sb.append(this.a);
        sb.append(", html=");
        sb.append(this.b);
        sb.append(", left=");
        sb.append(this.c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", text=");
        return m0.k(sb, this.e, ", isMissingNewlineAtEnd=", this.f, ")");
    }
}
