package k21;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends x {
    public final j21.a P(j21.b bVar, String str, int i, j21.b bVar2) {
        Parcel g = g();
        o21.g.b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        o21.g.b(g, bVar2);
        Parcel e = e(g, 2);
        j21.a M = j21.b.M(e.readStrongBinder());
        e.recycle();
        return M;
    }

    public final j21.a Q(j21.b bVar, String str, int i, j21.b bVar2) {
        Parcel g = g();
        o21.g.b(g, bVar);
        g.writeString(str);
        g.writeInt(i);
        o21.g.b(g, bVar2);
        Parcel e = e(g, 3);
        j21.a M = j21.b.M(e.readStrongBinder());
        e.recycle();
        return M;
    }
}
