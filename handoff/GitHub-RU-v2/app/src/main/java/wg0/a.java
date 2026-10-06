package wg0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public String a;
    public String b;
    public String c;
    public String d;

    public a(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        return i.k(s0.o("LicenseFragment(name=", this.a, ", spdxId=", this.b, ", id="), this.c, ", __typename=", this.d, ")");
    }
}
