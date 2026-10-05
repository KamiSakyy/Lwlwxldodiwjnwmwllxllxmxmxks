package b21;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final a a;
    public final z11.d b;

    public /* synthetic */ k(a aVar, z11.d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (c21.u.j(this.a, kVar.a) && c21.u.j(this.b, kVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        b1.m mVar = new b1.m(this);
        mVar.a(this.a, "key");
        mVar.a(this.b, "feature");
        return mVar.toString();
    }





















}
