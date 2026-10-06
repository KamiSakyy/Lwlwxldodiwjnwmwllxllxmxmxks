package sz0;

import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public boolean a;
    public String b;

    public c(String str, boolean z) {
        k.g(str, "message");
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return m0.f("InAppPurchaseResult(isSuccessful=", ", message=", this.b, ")", this.a);
    }
}
