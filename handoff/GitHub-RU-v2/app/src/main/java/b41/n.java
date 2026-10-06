package b41;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public final int a;

    public n(int i) {
        this.a = i;
    }

    public static m a(int i) {
        m mVar = new m();
        mVar.a = i;
        mVar.b = (byte) (((byte) (mVar.b | 1)) | 2);
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return s0.i("AppUpdateOptions{appUpdateType=", this.a, ", allowAssetPackDeletion=false}");
    }
    public static final Object a = null;
}
