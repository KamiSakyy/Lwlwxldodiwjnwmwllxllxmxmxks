package hg;

import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.google.android.gms.internal.measurement.i4;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public static final void a(r rVar, j71.c cVar, ShortcutIcon shortcutIcon, boolean z, s sVar, int i, int i2) {
        int i3;
        k71.k.g(cVar, "onIconClick");
        k71.k.g(shortcutIcon, "selectedIcon");
        sVar.e0(987560968);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.d(shortcutIcon.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.g(z) ? 2048 : 1024;
        }
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                rVar = o.a;
            }
            String p0 = i4.p0(2131954130, sVar);
            androidx.compose.foundation.layout.b.c(p2.e(rVar, 1.0f), l.f, (androidx.compose.foundation.layout.k) null, (w1.i) null, ShortcutColor.getEntries().a(), 0, r1.i.d(-320554387, new com.github.rudroid.agents.j(z, shortcutIcon, p0, cVar), sVar), sVar, 1572912, 44);
        } else {
            sVar.V();
        }
        r rVar2 = rVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.actions.shared.ui.c(rVar2, cVar, shortcutIcon, z, i, i2);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
