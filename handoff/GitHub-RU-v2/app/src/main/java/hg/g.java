package hg;

import android.content.Context;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.fragments.ui.comment.ui.m;
import com.github.rudroid.m0;
import com.github.rudroid.searchandfilter.filterbar.p;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.uitoolkit.markdown.components.v;
import com.github.rudroid.uitoolkit.menu.d;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.i4;
import d2.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sy.d0;
import w1.o;
import w1.r;
import w2.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final void a(r rVar, String str, ShortcutType shortcutType, ShortcutIcon shortcutIcon, ShortcutColor shortcutColor, com.github.service.models.response.shortcuts.a aVar, boolean z, List list, j71.a aVar2, j71.c cVar, j71.c cVar2, j71.c cVar3, j71.c cVar4, j71.c cVar5, List list2, j71.a aVar3, s sVar, int i, int i2, int i3) {
        r rVar2;
        int i4;
        int i5;
        ShortcutType shortcutType2;
        j71.a aVar4;
        r rVar3;
        boolean z2;
        s sVar2 = sVar;
        k71.k.g(str, "title");
        k71.k.g(shortcutType, "type");
        k71.k.g(shortcutIcon, "icon");
        k71.k.g(shortcutColor, "color");
        k71.k.g(aVar, "scope");
        k71.k.g(aVar2, "launchRepoChooserAction");
        k71.k.g(cVar, "onScopeChange");
        k71.k.g(cVar2, "onNameChange");
        k71.k.g(cVar3, "onTypeChange");
        k71.k.g(cVar4, "onColorChange");
        k71.k.g(cVar5, "onIconChange");
        k71.k.g(aVar3, "resetFilters");
        sVar2.e0(-1705009744);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i | (sVar2.f(rVar2) ? 4 : 2);
        }
        if ((i & 48) == 0) {
            i4 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= sVar2.d(shortcutType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= sVar2.d(shortcutIcon.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= sVar2.d(shortcutColor.ordinal()) ? 16384 : 8192;
        }
        int i7 = i4 | (sVar2.h(aVar) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            i7 |= sVar2.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i7 |= sVar2.h(list) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i7 |= sVar2.h(aVar2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= sVar2.h(cVar) ? 536870912 : 268435456;
        }
        int i8 = i7;
        if ((i2 & 6) == 0) {
            i5 = i2 | (sVar2.h(cVar2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= sVar2.h(cVar3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= sVar2.h(cVar4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= sVar2.h(cVar5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= sVar2.h(list2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= sVar2.h(aVar3) ? 131072 : 65536;
        }
        int i9 = i5;
        if (sVar2.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 74899) == 74898) ? false : true)) {
            r rVar4 = o.a;
            r rVar5 = i6 != 0 ? rVar4 : rVar2;
            r w = f0.o.w(f0.o.f(rVar5, ih.d.b(sVar2).b, a0.b), f0.o.v(sVar2), true);
            e0 a = c0.a(l.c, w1.c.D, sVar2, 0);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, w);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, v2.g.f, a);
            t.I(sVar2, v2.g.e, l);
            t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
            t.E(sVar2, v2.g.h);
            t.I(sVar2, v2.g.d, c);
            int i11 = i9 << 3;
            int i12 = i8 << 3;
            r rVar6 = rVar5;
            aVar4 = aVar3;
            j.a(null, cVar2, str, shortcutType, shortcutIcon, shortcutColor, sVar2, (i11 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            shortcutType2 = shortcutType;
            if (z) {
                z2 = false;
                sVar2.c0(1941657116);
            } else {
                sVar2.c0(1944260031);
                k0.a(null, 0L, 0L, 0.0f, false, sVar2, 0, 31);
                int i13 = i8 >> 18;
                b(aVar, cVar, aVar2, sVar2, ((i8 >> 15) & 14) | ((i8 >> 24) & 112) | (i13 & 896));
                c(shortcutType2, list, cVar3, sVar2, ((i8 >> 6) & 14) | (i13 & 112) | (i11 & 896));
                r y = androidx.compose.foundation.layout.b.y(rVar4, ih.a.n, ih.a.l);
                String p0 = i4.p0(2131954253, sVar2);
                boolean z3 = (i9 & 458752) == 131072;
                Object N = sVar2.N();
                if (z3 || N == n.a) {
                    N = new com.github.rudroid.uitoolkit.markdown.components.c(16, aVar4);
                    sVar2.n0(N);
                }
                p.d(y, 0L, list2, true, 0, d0.n(new com.github.rudroid.searchandfilter.filterbar.e(p0, (j71.a) N)), sVar2, ((i9 >> 6) & 896) | 3072, 18);
                z2 = false;
            }
            sVar2.q(z2);
            k0.a(null, 0L, 0L, 0.0f, false, sVar2, 0, 31);
            float f = ih.a.l;
            b.a(androidx.compose.foundation.layout.b.y(rVar4, f, f), cVar4, shortcutColor, sVar2, ((i9 >> 3) & 112) | ((i8 >> 6) & 896));
            sVar2 = sVar2;
            k.a(androidx.compose.foundation.layout.b.B(rVar4, f, 0.0f, f, f, 2), cVar5, shortcutIcon, list.contains(ShortcutType.REPOSITORIES), sVar2, ((i9 >> 6) & 112) | ((i8 >> 3) & 896), 0);
            sVar2.q(true);
            rVar3 = rVar6;
        } else {
            shortcutType2 = shortcutType;
            aVar4 = aVar3;
            sVar2.V();
            rVar3 = rVar2;
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new m(rVar3, str, shortcutType2, shortcutIcon, shortcutColor, aVar, z, list, aVar2, cVar, cVar2, cVar3, cVar4, cVar5, list2, aVar4, i, i2, i3);
        }
    }

    public static final void b(com.github.service.models.response.shortcuts.a aVar, j71.c cVar, j71.a aVar2, s sVar, int i) {
        int i2;
        String d;
        boolean z;
        d.C0009d c0009d;
        sVar.e0(1800321854);
        if ((i & 6) == 0) {
            i2 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(aVar2) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            ShortcutScope.AllRepositories allRepositories = ShortcutScope.AllRepositories.INSTANCE;
            String obj = allRepositories.toString();
            Context context = (Context) sVar.j(j0.b);
            d.C0009d c0009d2 = new d.C0009d(obj, com.github.rudroid.shortcuts.r.g(allRepositories, context), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092);
            boolean z2 = aVar instanceof ShortcutScope.SpecificRepository;
            String specificRepository = z2 ? ((ShortcutScope.SpecificRepository) aVar).toString() : "choose_repo";
            if (z2) {
                sVar.c0(2132394980);
                sVar.q(false);
                d = com.github.rudroid.shortcuts.r.g(aVar, context);
            } else {
                d = m0.d(sVar, 2132465412, 2131954634, sVar, false);
            }
            List r = x61.l.r(new d.C0009d[]{c0009d2, new d.C0009d(specificRepository, d, (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092)});
            if (aVar instanceof ShortcutScope.AllRepositories) {
                d.C0009d c0009d3 = (d.C0009d) r.get(0);
                String upperCase = ((d.C0009d) r.get(0)).b.toUpperCase(Locale.ROOT);
                k71.k.f(upperCase, "toUpperCase(...)");
                String str = c0009d3.a;
                String str2 = c0009d3.c;
                com.github.rudroid.uitoolkit.text.l lVar = c0009d3.d;
                String str3 = c0009d3.e;
                long j = c0009d3.f;
                long j2 = c0009d3.g;
                long j3 = c0009d3.h;
                boolean z3 = c0009d3.i;
                boolean z4 = c0009d3.j;
                String str4 = c0009d3.k;
                int i3 = c0009d3.l;
                k71.k.g(str, "id");
                k71.k.g(lVar, "compoundDrawables");
                k71.k.g(str3, "contentDescription");
                c0009d = new d.C0009d(str, upperCase, str2, lVar, str3, j, j2, j3, z3, z4, str4, i3);
                z = true;
            } else {
                z = true;
                c0009d = (d.C0009d) r.get(1);
            }
            String p0 = i4.p0(2131954632, sVar);
            boolean f = ((i2 & 896) == 256 ? z : false) | sVar.f(obj) | ((i2 & 112) == 32 ? z : false) | sVar.h(aVar);
            Object N = sVar.N();
            if (f || N == n.a) {
                a0.a aVar3 = new a0.a(aVar2, obj, cVar, aVar, 15);
                sVar.n0(aVar3);
                N = aVar3;
            }
            h.a(null, 2131954127, p0, c0009d, (j71.c) N, r, sVar, 266240);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(aVar, cVar, aVar2, i, 18);
        }
    }

    public static final void c(ShortcutType shortcutType, List list, j71.c cVar, s sVar, int i) {
        int i2;
        sVar.e0(713540652);
        if ((i & 6) == 0) {
            i2 = (sVar.d(shortcutType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) sVar.j(j0.b);
            String name = shortcutType.name();
            String upperCase = com.github.rudroid.shortcuts.r.h(shortcutType, context).toUpperCase(Locale.ROOT);
            k71.k.f(upperCase, "toUpperCase(...)");
            d.C0009d c0009d = new d.C0009d(name, upperCase, (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092);
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ShortcutType shortcutType2 = (ShortcutType) it.next();
                arrayList.add(new d.C0009d(shortcutType2.name(), com.github.rudroid.shortcuts.r.h(shortcutType2, context), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, 0L, 0L, 0L, false, false, 0, 4092));
            }
            String p0 = i4.p0(2131954636, sVar);
            boolean h = sVar.h(list) | ((i2 & 896) == 256);
            Object N = sVar.N();
            if (h || N == n.a) {
                N = new com.github.rudroid.uitoolkit.copilot.d(list, cVar, 1);
                sVar.n0(N);
            }
            h.a(null, 2131954128, p0, c0009d, (j71.c) N, arrayList, sVar, 4096);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(shortcutType, list, cVar, i, 19);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
