package xx;

import aa.h0;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public a(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int e = i.e(i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return m0.l(m0.o("PageInfoFragment(endCursor=", this.a, ", hasNextPage=", ", hasPreviousPage=", this.b), this.c, ", startCursor=", this.d, ")");
    }
    public Object b = null;
    public Object c = null;
}
