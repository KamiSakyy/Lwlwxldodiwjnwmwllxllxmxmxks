package g41;

import android.app.PendingIntent;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends a {
    public PendingIntent r;
    public boolean s;

    public b(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.r = pendingIntent;
        this.s = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.r.equals(bVar.r) && this.s == bVar.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.r.hashCode() ^ 1000003) * 1000003) ^ (true != this.s ? 1237 : 1231);
    }

    public final String toString() {
        return f4Shadow.s(f4Shadow.v("ReviewInfo{pendingIntent=", this.r.toString(), ", isNoOp="), this.s, "}");
    }
}
