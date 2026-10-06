package i10;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public boolean a;
    public boolean b;
    public r c;

    public u(boolean z, boolean z2, r rVar) {
        this.a = z;
        this.b = z2;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        int e = x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        r rVar = this.c;
        return e + (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        StringBuilder u = h1.u("MobileAuthStatus(hasValidDeviceAuthKey=", this.a, ", hasExpiredAuthRequest=", this.b, ", activeAuthRequest=");
        u.append(this.c);
        u.append(")");
        return u.toString();
    }
}
