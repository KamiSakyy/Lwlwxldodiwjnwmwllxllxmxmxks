package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.m0 {
    public m a;

    public l(m mVar) {
        this.a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        m mVar = this.a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteProjectV2Item=" + this.a + ")";
    }
}
