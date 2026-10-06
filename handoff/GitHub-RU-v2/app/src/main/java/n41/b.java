package n41;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.d2;
import com.google.common.collect.f;
import java.util.HashSet;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements d2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                x1 x1Var = (x1) obj;
                if (((HashSet) x1Var.r).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    f fVar = a.a;
                    String g = c2.g(str2, c2.c, c2.a);
                    if (g != null) {
                        str2 = g;
                    }
                    bundle2.putString("events", str2);
                    ((x1) x1Var.s).B(bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((x1) ((kk.a) obj).s).B(bundle3);
                    break;
                }
                break;
        }
    }
}
