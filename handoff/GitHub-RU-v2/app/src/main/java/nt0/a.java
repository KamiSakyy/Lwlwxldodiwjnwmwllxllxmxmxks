package nt0;

import aa.h0;
import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public boolean a;
    public String b;

    public a(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return m0.f("ReversedPageInfo(hasPreviousPage=", ", startCursor=", this.b, ")", this.a);
    }
}
