package lv;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public String b;
    public boolean c;
    public String d;

    public k(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && k71.k.b(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return m0.l(s0.o("OnBot(id=", this.a, ", displayName=", this.b, ", isCopilot="), this.c, ", url=", this.d, ")");
    }
}
