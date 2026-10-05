package m90;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import bm.k;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import ea.f;
import hc0.av;
import java.util.List;
import k81.u0;
import k81.z;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements i0, k, x {
    public static final /* synthetic */ c s = new c(3);
    public static final /* synthetic */ c t = new c(4);
    public static final /* synthetic */ c u = new c(5);
    public final /* synthetic */ int r;

    public /* synthetic */ c(int i) {
        this.r = i;
    }

    public static ShortcutColor a(String str) {
        ShortcutColor shortcutColor;
        k71.k.g(str, "value");
        ShortcutColor.Companion.getClass();
        ShortcutColor[] values = ShortcutColor.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                shortcutColor = null;
                break;
            }
            shortcutColor = values[i];
            if (k71.k.b(shortcutColor.getValue(), str)) {
                break;
            }
            i++;
        }
        return shortcutColor == null ? ShortcutColor.GRAY : shortcutColor;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                Long l = (Long) b7.T.b();
                l.getClass();
                return l;
            case 4:
                List list2 = c0.a;
                j8.s.a();
                Boolean bool = (Boolean) l8.a.b();
                bool.getClass();
                return bool;
            default:
                List list3 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.B.b()).longValue());
        }
    }

    public m d() {
        av.Companion.getClass();
        j0 j0Var = av.a;
        k71.k.g(j0Var, "type");
        List list = n90.a.a;
        List list2 = n90.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == c.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(e.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(c.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            w61.k kVar = (w61.k) bVar.a(str, new u0(new k81.d(SimpleRepository.Companion.serializer(), 0), new z("com.github.rudroid.common.RepositoryFilter", com.github.rudroid.common.i0.values()), 1));
            if (kVar != null) {
                return new RepositoriesFilter((List) kVar.r, (com.github.rudroid.common.i0) kVar.s);
            }
        }
        return new RepositoriesFilter(3);
    }

    public void o(f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
