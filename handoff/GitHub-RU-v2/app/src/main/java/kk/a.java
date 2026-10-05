package kk;

import a5.c1;
import a5.m2;
import a5.p2;
import a5.q1;
import a5.t;
import a5.z;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.lazy.layout.a1;
import androidx.compose.foundation.lazy.layout.z0;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.p1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.l1;
import b21.v;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.t0;
import f0.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l7.s1;
import l7.t1;
import l7.x1;
import m0.l;
import m0.s;
import p.d0;
import p.j;
import p.n;
import p.w;
import q.b3;
import q.f3;
import q.u0;
import q.z1;
import q2.u;
import q81.g0;
import r9.k;
import r9.q;
import sy.e0;
import sy.y;
import v1.r;
import v71.b0;
import v71.f0;
import w61.p;
import w80.n3;
import w80.w3;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public class a implements z, t1, o31.h, z1, p9.f, w, j, u0, r9.e {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ a(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public static q v(m9.i iVar, k kVar, p9.a aVar, p9.b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(kVar.a.getResources(), bVar.a);
        i9.f fVar = i9.f.r;
        Map map = bVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = w9.f.a;
        if (iVar != null && iVar.a) {
            z = true;
        }
        return new q(bitmapDrawable, kVar, fVar, aVar, str, booleanValue, z);
    }

    public static z0 z(a aVar, int i) {
        s sVar = (s) aVar.s;
        v1.g e = r.e();
        j71.c e2 = e != null ? e.e() : null;
        v1.g h = r.h(e);
        try {
            l lVar = (l) sVar.f.getValue();
            r.k(e, h, e2);
            return sVar.p.a(i, lVar.j, sVar.d, new lm0.g(i, lVar));
        } catch (Throwable th2) {
            r.k(e, h, e2);
            throw th2;
        }
    }

    public void a() {
        f0 f0Var = (f0) this.s;
        if (f0Var.f()) {
            f0Var.m((CancellationException) null);
        }
    }

    public void b(p.l lVar, boolean z) {
        if (lVar instanceof d0) {
            ((d0) lVar).A.k().c(false);
        }
        w wVar = ((q.j) this.s).v;
        if (wVar != null) {
            wVar.b(lVar, z);
        }
    }

    public void c(p9.a aVar, Bitmap bitmap, Map map) {
        ((v) this.s).v(aVar, bitmap, map, e0.j(bitmap));
    }

    public p9.b d(p9.a aVar) {
        return null;
    }

    public boolean e(p.l lVar, MenuItem menuItem) {
        boolean onMenuItemClick;
        b3 b3Var = ((ActionMenuView) this.s).R;
        if (b3Var != null) {
            Toolbar toolbar = b3Var.r;
            Iterator it = ((CopyOnWriteArrayList) toolbar.a0.u).iterator();
            while (true) {
                if (!it.hasNext()) {
                    f3 f3Var = toolbar.c0;
                    onMenuItemClick = f3Var != null ? f3Var.onMenuItemClick(menuItem) : false;
                } else if (((t) it.next()).a0(menuItem)) {
                    onMenuItemClick = true;
                    break;
                }
            }
            if (onMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    public void f(p.l lVar, MenuItem menuItem) {
        ((p.f) this.s).w.removeCallbacksAndMessages(lVar);
    }

    public s1 g() {
        switch (this.r) {
            case 4:
                return (n3) this.s;
            default:
                return (w3) this.s;
        }
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public void j(p.l lVar) {
        j jVar = ((ActionMenuView) this.s).M;
        if (jVar != null) {
            jVar.j(lVar);
        }
    }

    public void k(int i) {
    }

    public p2 l(View view, p2 p2Var) {
        m2 m2Var = p2Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.s;
        if (!Objects.equals(coordinatorLayout.E, p2Var)) {
            coordinatorLayout.E = p2Var;
            boolean z = p2Var.d() > 0;
            coordinatorLayout.F = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!m2Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = c1.a;
                    if (childAt.getFitsSystemWindows() && childAt.getLayoutParams().a != null && m2Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return p2Var;
    }

    public void m(int i, float f) {
    }

    public void n() {
    }

    public void o(p.l lVar, n nVar) {
        p.f fVar = (p.f) this.s;
        Handler handler = fVar.w;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.y;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((p.e) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new q1(this, i2 < arrayList.size() ? (p.e) arrayList.get(i2) : null, nVar, lVar, 10, false), lVar, SystemClock.uptimeMillis() + 200);
    }

    public boolean p(p.l lVar) {
        q.j jVar = (q.j) this.s;
        if (lVar == jVar.t) {
            return false;
        }
        ((d0) lVar).B.getClass();
        jVar.getClass();
        w wVar = jVar.v;
        if (wVar != null) {
            return wVar.p(lVar);
        }
        return false;
    }

    public long q(long j) {
        m mVar = (m) this.s;
        mVar.getClass();
        if (s3.q.b(j) <= 0.0f || s3.q.c(j) <= 0.0f) {
            t2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) s3.q.g(j)));
        }
        return y9.a.b(((r2.c) mVar.a).b(s3.q.b(j)), ((r2.c) mVar.c).b(s3.q.c(j)));
    }

    public Object r(SerialDescriptor serialDescriptor, m81.j jVar) {
        k71.k.g(serialDescriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.s).get(serialDescriptor);
        Object obj = map != null ? map.get(jVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
    
        if (r0 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014a, code lost:
    
        if (r7 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012f, code lost:
    
        if (r1 <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013b, code lost:
    
        if (java.lang.Math.abs(r2 - r5) <= r9) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p9.b s(k kVar, p9.a aVar, s9.h hVar, s9.g gVar) {
        p9.b bVar;
        Object r9;
        boolean equals;
        p9.b bVar2;
        if (kVar.p.r) {
            p9.c cVar = (p9.c) ((g9.h) this.s).c.getValue();
            if (cVar != null) {
                bVar = cVar.a.d(aVar);
                if (bVar == null) {
                    v vVar = cVar.b;
                    synchronized (vVar) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) vVar.t).get(aVar);
                            bVar2 = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    }
                                    p9.e eVar = (p9.e) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) eVar.b.get();
                                    p9.b bVar3 = bitmap != null ? new p9.b(bitmap, eVar.c) : null;
                                    if (bVar3 != null) {
                                        bVar2 = bVar3;
                                        break;
                                    }
                                    i++;
                                }
                                int i2 = vVar.s;
                                vVar.s = i2 + 1;
                                if (i2 >= 10) {
                                    vVar.e();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    bVar = bVar2;
                }
            } else {
                bVar = null;
            }
            if (bVar != null) {
                Bitmap bitmap2 = bVar.a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (l51.h.x(kVar, config)) {
                    Object obj = bVar.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!k71.k.b(hVar, s9.h.c)) {
                        String str = (String) aVar.s.get("coil#transformation_size");
                        if (str != null) {
                            equals = str.equals(hVar.toString());
                            if (equals) {
                                return bVar;
                            }
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            s9.a aVar2 = hVar.a;
                            int i3 = aVar2 instanceof s9.a ? aVar2.a : Integer.MAX_VALUE;
                            s9.a aVar3 = hVar.b;
                            int i4 = aVar3 instanceof s9.a ? aVar3.a : Integer.MAX_VALUE;
                            double f = a.a.f(width, height, i3, i4, gVar);
                            boolean a = w9.d.a(kVar);
                            if (a) {
                                double d = f > 1.0d ? 1.0d : f;
                                if (Math.abs(i3 - (d * width)) > 1.0d && Math.abs(i4 - (d * height)) > 1.0d) {
                                    r9 = 1;
                                }
                                r9 = 1;
                                equals = r9;
                                if (equals) {
                                }
                            } else {
                                if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
                                    r9 = 1;
                                } else {
                                    int abs = Math.abs(i3 - width);
                                    r9 = 1;
                                    r9 = 1;
                                }
                                if (i4 != Integer.MIN_VALUE && i4 != Integer.MAX_VALUE) {
                                    r9 = r9;
                                }
                                equals = r9;
                                if (equals) {
                                }
                            }
                            if (f != 1.0d) {
                            }
                            if (f > 1.0d) {
                            }
                            equals = r9;
                            if (equals) {
                            }
                        }
                    }
                }
                equals = false;
                if (equals) {
                }
            }
        }
        return null;
    }

    public i3 t() {
        u5.i a = u5.i.a();
        if (a.c() == 1) {
            return new o3.k(true);
        }
        p1 B = androidx.compose.runtime.t.B(Boolean.FALSE);
        a.i(new o3.g(B, this));
        return B;
    }

    public p9.a u(k kVar, Object obj, r9.n nVar, g9.c cVar) {
        String str;
        x61.s sVar;
        p9.a aVar = kVar.e;
        List list = kVar.h;
        if (aVar != null) {
            return aVar;
        }
        List list2 = ((g9.h) this.s).i.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            w61.k kVar2 = (w61.k) list2.get(i);
            n9.b bVar = (n9.b) kVar2.r;
            if (((Class) kVar2.s).isAssignableFrom(obj.getClass())) {
                k71.k.e(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                str = bVar.a(obj, nVar);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map = kVar.z.r;
        if (map.isEmpty()) {
            sVar = x61.s.r;
        } else {
            x61.s linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
            sVar = linkedHashMap;
        }
        if (list.isEmpty() && sVar.isEmpty()) {
            return new p9.a(str);
        }
        LinkedHashMap C = x.C(sVar);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C.put(no.a.k("coil#transformation_", i2), ((u9.d) list.get(i2)).b());
            }
            C.put("coil#transformation_size", nVar.d.toString());
        }
        return new p9.a(str, C);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(String str, List list, c71.c cVar) {
        ma.b bVar;
        int i;
        g91.f c;
        x71.h hVar;
        if (cVar instanceof ma.b) {
            bVar = (ma.b) cVar;
            int i2 = bVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.y = i2 - Integer.MIN_VALUE;
                Object obj = bVar.w;
                b71.a aVar = b71.a.r;
                i = bVar.y;
                if (i != 0) {
                    y.j(obj);
                    x71.h a = t.e.a(Integer.MAX_VALUE, 6, (x71.a) null);
                    v71.r b = b0.b();
                    l1 l1Var = new l1(11);
                    l1Var.I(str);
                    l1Var.t = ka.b.b(list).d();
                    androidx.lifecycle.b bVar2 = new androidx.lifecycle.b(l1Var);
                    c = ((g0) ((p) this.s).getValue()).c(bVar2, new ma.d(b, a));
                    bVar.u = a;
                    bVar.v = c;
                    bVar.y = 1;
                    if (b.s(bVar) == aVar) {
                        return aVar;
                    }
                    hVar = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c = bVar.v;
                    hVar = bVar.u;
                    y.j(obj);
                }
                hVar.d(new h1.r(11, c));
                return new ma.c(hVar, c);
            }
        }
        bVar = new ma.b(this, cVar);
        Object obj2 = bVar.w;
        b71.a aVar2 = b71.a.r;
        i = bVar.y;
        if (i != 0) {
        }
        hVar.d(new h1.r(11, c));
        return new ma.c(hVar, c);
    }

    public h4 x(x1 x1Var, w2.t tVar) {
        int i;
        long L;
        long j;
        boolean z;
        x.r rVar = (x.r) this.s;
        List list = (List) x1Var.r;
        x.r rVar2 = new x.r(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            q2.w wVar = (q2.w) list.get(i2);
            long j2 = wVar.a;
            q2.v vVar = (q2.v) rVar.b(j2);
            if (vVar == null) {
                i = i2;
                j = wVar.b;
                L = wVar.d;
                z = false;
            } else {
                long j3 = vVar.a;
                boolean z2 = vVar.c;
                i = i2;
                L = tVar.L(vVar.b);
                j = j3;
                z = z2;
            }
            long j4 = wVar.a;
            List list2 = list;
            int i3 = size;
            rVar2.g(j4, new u(j4, wVar.b, wVar.d, wVar.e, wVar.f, j, L, z, wVar.g, wVar.i, wVar.j, wVar.k));
            boolean z3 = wVar.e;
            if (z3) {
                rVar.g(j2, new q2.v(wVar.b, wVar.c, z3));
            } else {
                rVar.h(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        h4 h4Var = new h4();
        h4Var.b = rVar2;
        h4Var.c = x1Var;
        return h4Var;
    }

    public ArrayList y(int i) {
        ArrayList arrayList = new ArrayList();
        n0.z zVar = (n0.z) this.s;
        v1.g e = r.e();
        j71.c e2 = e != null ? e.e() : null;
        v1.g h = r.h(e);
        try {
            n0.p pVar = zVar.b ? zVar.c : (n0.p) zVar.e.getValue();
            if (pVar != null) {
                k71.u uVar = new k71.u();
                uVar.r = 1;
                List list = (List) pVar.k.k(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    w61.k kVar = (w61.k) list.get(i2);
                    a1 a1Var = zVar.o;
                    int intValue = ((Number) kVar.r).intValue();
                    long j = ((s3.a) kVar.s).a;
                    x1 x1Var = n0.z.w;
                    uVar = uVar;
                    arrayList.add(a1Var.a(intValue, j, false, new a0.a((ArrayList) null, uVar, list, i, pVar)));
                }
            }
            r.k(e, h, e2);
            return arrayList;
        } catch (Throwable th2) {
            r.k(e, h, e2);
            throw th2;
        }
    }

    public a(s21.a aVar, x1 x1Var) {
        this.r = 12;
        this.s = x1Var;
        aVar.t(new n41.b(1, this));
    }

    public a(e eVar) {
        this.r = 0;
        k71.k.g(eVar, "discussionCommentMapper");
        this.s = eVar;
    }

    public a(g9.h hVar, l51.h hVar2) {
        this.r = 19;
        this.s = hVar;
    }

    public a(q81.u uVar) {
        this.r = 9;
        k71.k.g(uVar, "webSocketFactory");
        this.s = sy.w.t(new ma.a(0, new b2(29, uVar)));
    }

    public a(int i) {
        this.r = i;
        switch (i) {
            case 5:
                this.s = new w3(7);
                break;
            case 8:
                this.s = new ConcurrentHashMap(16);
                break;
            case 13:
                this.s = new AtomicInteger(0);
                break;
            case 23:
                this.s = new x.r((Object) null);
                break;
            case 25:
                k71.k.g(TimeUnit.MINUTES, "timeUnit");
                t81.e eVar = t81.e.l;
                k71.k.g(eVar, "taskRunner");
                this.s = new t0(eVar);
                break;
            case 26:
                this.s = new m(3);
                break;
            default:
                this.s = new n3(7);
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class k<T1,T2,T3,T4> {
        public k() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p2<T1,T2,T3,T4> {
        public p2() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q<T1,T2,T3,T4> {
        public q() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x1<T1,T2,T3,T4> {
        public x1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout<T1,T2,T3,T4> {
        public CoordinatorLayout() {
        }
    }
}
