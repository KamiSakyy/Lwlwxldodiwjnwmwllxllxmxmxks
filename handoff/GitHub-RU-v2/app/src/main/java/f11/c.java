package f11;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final boolean a;
    public final b b;

    public c(boolean z, b bVar) {
        this.a = z;
        this.b = bVar;
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
        int hashCode = Boolean.hashCode(this.a) * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "MobileAuthRequestResponse(hasValidCert=" + this.a + ", mobileAuthRequest=" + this.b + ")";
    }
}
