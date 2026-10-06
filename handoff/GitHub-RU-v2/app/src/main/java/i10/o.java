package i10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public boolean a;
    public boolean b;

    public o(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && this.b == oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MobileAuthStatus(hasValidDeviceAuthKey=" + this.a + ", hasExpiredAuthRequest=" + this.b + ")";
    }
}
