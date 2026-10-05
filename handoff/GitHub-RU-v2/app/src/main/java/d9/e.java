package d9;

import android.graphics.drawable.Drawable;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.v6;
import com.google.android.gms.internal.measurement.y6;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements bm.k, x, a71.g {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e f21683s = new e(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ e f21684t = new e(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ e f21685u = new e(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ e f21686v = new e(6);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21687r;

    public /* synthetic */ e(int i) {
        this.f21687r = i;
    }

    public static ArrayList a(List list) {
        k71.k.g(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q81.v) obj) != q81.v.t) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((q81.v) obj2).r);
        }
        return arrayList2;
    }

    public static byte[] b(List list) {
        k71.k.g(list, "protocols");
        h91.h hVar = new h91.h();
        ArrayList a10 = a(list);
        int size = a10.size();
        int i = 0;
        while (i < size) {
            Object obj = a10.get(i);
            i++;
            String str = (String) obj;
            hVar.J0(str.length());
            hVar.P0(str);
        }
        return hVar.W(hVar.s);
    }

    public Object c() {
        switch (this.f21687r) {
            case 3:
                List list = c0.a;
                Boolean bool = (Boolean) y6.a.b();
                bool.getClass();
                return bool;
            case 4:
                List list2 = c0.a;
                z6.s.a();
                Long l = (Long) b7.g0.b();
                l.getClass();
                return l;
            case 5:
                List list3 = c0.a;
                z6.s.a();
                return (String) b7.k.b();
            default:
                List list4 = c0.a;
                Boolean bool2 = (Boolean) v6.a.b();
                bool2.getClass();
                return bool2;
        }
    }

    public void d(v2.t tVar, float f6) {
        w.b bVar = (w.b) ((Drawable) tVar.f32599s);
        w.a aVar = (w.a) tVar.f32600t;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f6 != bVar.f32911e || bVar.f32912f != useCompatPadding || bVar.f32913g != preventCornerOverlap) {
            bVar.f32911e = f6;
            bVar.f32912f = useCompatPadding;
            bVar.f32913g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            tVar.m(0, 0, 0, 0);
            return;
        }
        w.b bVar2 = (w.b) ((Drawable) tVar.f32599s);
        float f10 = bVar2.f32911e;
        float f11 = bVar2.f32907a;
        int ceil = (int) Math.ceil(w.c.a(f10, f11, aVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(w.c.b(f10, f11, aVar.getPreventCornerOverlap()));
        tVar.m(ceil, ceil2, ceil, ceil2);
    }

    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        boolean z10;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            z10 = ((Boolean) bVar.a(str, k81.g.a)).booleanValue();
        } else {
            z10 = false;
        }
        return new NotificationIsUnreadFilter(z10);
    }
}
