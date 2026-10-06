package q81;

import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l extends y {
    public static final q c;
    public List a;
    public List b;

    static {
        t71.n nVar = q.d;
        c = i4.V("application/x-www-form-urlencoded");
    }

    public l(ArrayList arrayList, ArrayList arrayList2) {
        k71.k.g(arrayList, "encodedNames");
        k71.k.g(arrayList2, "encodedValues");
        this.a = r81.g.j(arrayList);
        this.b = r81.g.j(arrayList2);
    }

    @Override // q81.y
    public final long a() {
        return e(null, true);
    }

    @Override // q81.y
    public final q b() {
        return c;
    }

    @Override // q81.y
    public final void d(h91.i iVar) {
        e(iVar, false);
    }

    public final long e(h91.i iVar, boolean z) {
        h91.h a;
        if (z) {
            a = new h91.h();
        } else {
            k71.k.d(iVar);
            a = iVar.a();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a.J0(38);
            }
            a.P0((String) list.get(i));
            a.J0(61);
            a.P0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = a.s;
        a.r();
        return j;
    }
}
