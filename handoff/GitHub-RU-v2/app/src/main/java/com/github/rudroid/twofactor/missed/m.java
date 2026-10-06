package com.github.rudroid.twofactor.missed;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public Long a;
    public boolean b;

    public m(Long l, boolean z) {
        this.a = l;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "TwoFactorRequestPreferencesData(lastRequestTimestamp=" + this.a + ", eventHandled=" + this.b + ")";
    }
}
