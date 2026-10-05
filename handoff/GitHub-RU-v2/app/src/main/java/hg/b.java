package hg;

import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.markdown.components.v;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.google.android.gms.internal.measurement.i4;
import dc.p;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final void a(r rVar, j71.c cVar, ShortcutColor shortcutColor, s sVar, int i) {
        int i2;
        k71.k.g(cVar, "onColorClick");
        k71.k.g(shortcutColor, "selectedColor");
        sVar.e0(-496352);
        if ((i & 6) == 0) {
            i2 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.d(shortcutColor.ordinal()) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            String p0 = i4.p0(2131954126, sVar);
            androidx.compose.foundation.layout.b.c(p2.e(rVar, 1.0f), l.f, (androidx.compose.foundation.layout.k) null, (w1.i) null, ShortcutColor.getEntries().a(), 0, r1.i.d(-827161701, new p(shortcutColor, p0, cVar, 2), sVar), sVar, 1572912, 44);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(rVar, cVar, shortcutColor, i, 17);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
