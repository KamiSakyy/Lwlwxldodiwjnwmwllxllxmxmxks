package rh;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.r1;
import com.github.rudroid.utilities.ui.f0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kShadow {
    public static final void a(int i, int i2, s sVar, j71.a aVar, boolean z) {
        sVar.e0(-330787736);
        int i3 = (sVar.g(z) ? 4 : 2) | i2 | (sVar.d(i) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (!sVar.S(i3 & 1, (i3 & 147) != 146)) {
            sVar.V();
        } else if (z) {
            sVar.c0(-1842333253);
            com.github.rudroid.utilities.ui.f.b(null, null, null, Integer.valueOf(i), null, 2131954905, aVar, sVar, ((i3 << 6) & 7168) | ((i3 << 12) & 3670016), 23);
            sVar.q(false);
        } else {
            sVar.c0(-1842172890);
            f0.b(i, i3 & 112, sVar, null);
            sVar.q(false);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.searchandfilter.filterbar.b(z, i, aVar, i2);
        }
    }

    public static final void b(boolean z, String str, j71.a aVar, s sVar, int i) {
        sVar.e0(-82432324);
        int i2 = (sVar.g(z) ? 4 : 2) | i | (sVar.f(str) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (!sVar.S(i2 & 1, (i2 & 147) != 146)) {
            sVar.V();
        } else if (z) {
            sVar.c0(980053991);
            com.github.rudroid.utilities.ui.f.c(null, null, null, str, null, 2131954905, aVar, sVar, ((i2 << 6) & 7168) | ((i2 << 12) & 3670016), 23);
            sVar.q(false);
        } else {
            sVar.c0(980214354);
            f0.a(i2 & 112, 1, sVar, str, null);
            sVar.q(false);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new r1(z, str, aVar, i);
        }
    }
}
