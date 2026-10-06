package e51;

import a5.c1;
import a5.l1;
import a5.r0;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.v2;
import androidx.compose.ui.layout.o0;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import b01.p;
import c21.h0;
import com.google.android.gms.measurement.internal.x3;
import e7.k;
import f0.j1;
import f1.b3;
import f1.t9;
import fa1.g;
import fa1.h;
import fa1.n;
import fa1.o;
import fa1.q0;
import fa1.x0;
import fa1.z;
import g3.g0;
import g3.p0;
import h0.g1;
import h0.y0;
import h91.e0;
import h91.i0Shadow;
import h91.j0;
import h91.k0;
import i0Shadow.j;
import i3.d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k1.l0;
import k81.a1;
import k81.b1;
import k81.m0;
import k81.m1;
import kotlinx.serialization.KSerializer;
import l3.v;
import l7.r1;
import l7.s1;
import l7.z1;
import m0.l;
import m0.m;
import m0.s;
import o0.q;
import o0.x;
import q81.c0;
import q81.e;
import r71.f;
import sy.d0;
import sy.w;
import sy.y;
import w21.c;
import w61.i;
import w80.a0;
import x.r;
import y41.t1;

/* loaded from: /home/user/work/p/classes4.dex */
public class a implements b, k, g, h, e, n, g1, c, i0Shadow.k, d, o.a, l0, m1, b1, s1 {
    public final /* synthetic */ int r;
    public Object s;
    public Object t;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }

    public static int C(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public k91.b A(h0 h0Var, ArrayList arrayList) {
        k71.k.g(h0Var, "type");
        ((s91.a) this.t).getClass();
        if (!(h0Var.equals(j91.a.b) ? true : h0Var.equals(j91.a.c))) {
            h0 h0Var2 = j91.a.d;
            return h0Var.equals(h0Var2) ? new l91.a(h0Var2, arrayList) : new k91.b(h0Var, arrayList);
        }
        l91.a aVar = new l91.a(h0Var, arrayList);
        w.s(i.s, new o0(8, aVar));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[EDGE_INSN: B:20:0x0054->B:21:0x0054 BREAK  A[LOOP:0: B:4:0x0012->B:18:0x0046], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List B(h0 h0Var, int i, int i2) {
        int i3;
        k71.k.g(h0Var, "type");
        j91.b bVar = j91.a.q0;
        if (!h0Var.equals(bVar)) {
            return d0.n(new k91.c(h0Var, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            ((s91.a) this.t).getClass();
            CharSequence charSequence = (CharSequence) this.s;
            k71.k.g(charSequence, "s");
            int i4 = i2 - 1;
            if (i <= i4) {
                i3 = i;
                while (charSequence.charAt(i3) != '\n') {
                    if (i3 != i4) {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    break;
                }
                if (i3 > i) {
                    arrayList.add(new k91.c(bVar, i, i3));
                }
                int i5 = i3 + 1;
                arrayList.add(new k91.c(j91.a.T, i3, i5));
                i = i5;
            }
            i3 = -1;
            if (i3 != -1) {
            }
        }
        if (i2 > i) {
            arrayList.add(new k91.c(bVar, i, i2));
        }
        return arrayList;
    }

    public void D() {
        ((SparseIntArray) this.s).clear();
    }

    public ArrayList E(List list) {
        k71.k.g(list, "serverPinnedDiscussions");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            kk.i iVar = (kk.i) this.t;
            iVar.getClass();
            k71.k.g(pVar, "serverPinnedDiscussion");
            String str = pVar.a;
            int i = pVar.b;
            mj.a aVar = iVar.a;
            com.github.service.models.response.a aVar2 = pVar.c;
            aVar.getClass();
            arrayList.add(new jk.i(str, i, mj.a.a(aVar2), pVar.d, pVar.e, pVar.f));
        }
        return arrayList;
    }

    public void F() {
        if (((n2.b) this.t) != null) {
            this.t = null;
            ((f0.h) this.s).V0(true);
        }
    }

    public Object a(r71.b bVar, ArrayList arrayList) {
        KSerializer d;
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.t;
        Class x = v8.l0.x(bVar);
        Object obj = concurrentHashMap.get(x);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(x, (obj = new a1()))) != null) {
            obj = putIfAbsent;
        }
        a1 a1Var = (a1) obj;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new m0((f) obj2));
        }
        ConcurrentHashMap concurrentHashMap2 = a1Var.a;
        Object obj3 = concurrentHashMap2.get(arrayList2);
        if (obj3 == null) {
            try {
                d = (KSerializer) ((j71.e) this.s).s(bVar, arrayList);
            } catch (Throwable th) {
                d = y.d(th);
            }
            w61.n nVar = new w61.n(d);
            Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, nVar);
            obj3 = putIfAbsent2 == null ? nVar : putIfAbsent2;
        }
        return ((w61.n) obj3).r;
    }

    public boolean b(o.b bVar, MenuItem menuItem) {
        return ((o.a) this.s).b(bVar, menuItem);
    }

    public Object c(z zVar) {
        Executor executor = (Executor) this.t;
        return executor == null ? zVar : new o(executor, zVar);
    }

    public Object d(Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(c0Var, "value");
        x3 x3Var = (x3) this.t;
        KSerializer kSerializer = (KSerializer) this.s;
        String t = c0Var.t();
        k71.k.f(t, "body.string()");
        return ((l81.n) x3Var.s).a(t, kSerializer);
    }

    public Type e() {
        return (Type) this.s;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public float f(float f, float f2) {
        switch (this.r) {
            case 13:
                float abs = Math.abs(f2);
                l h = ((s) this.s).h();
                int i = 0;
                if (!h.k.isEmpty()) {
                    java.util.List r0 = (java.util.List) (h.k);
                    int size = r0.size();
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        i += ((m) it.next()).p;
                    }
                    i /= size;
                }
                float f3 = abs - i;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                return Math.signum(f2) * f3;
            default:
                x xVar = (x) this.s;
                int n = xVar.n();
                p1 p1Var = xVar.p;
                int i2 = ((q) p1Var.getValue()).c + n;
                if (i2 == 0) {
                    return 0.0f;
                }
                int i3 = f < 0.0f ? xVar.e + 1 : xVar.e;
                int v = aa1.b.v(((int) (f2 / i2)) + i3, 0, xVar.m());
                xVar.n();
                int i4 = ((q) p1Var.getValue()).c;
                long j = i3;
                long j2 = 1;
                long j3 = j - j2;
                if (j3 < 0) {
                    j3 = 0;
                }
                int i5 = (int) j3;
                long j4 = j + j2;
                if (j4 > 2147483647L) {
                    j4 = 2147483647L;
                }
                int abs2 = Math.abs((aa1.b.v(aa1.b.v(v, i5, (int) j4), 0, xVar.m()) - i3) * i2) - i2;
                int i6 = abs2 >= 0 ? abs2 : 0;
                if (i6 == 0) {
                    return i6;
                }
                return Math.signum(f) * i6;
        }
    }

    public boolean g(o.b bVar, Menu menu) {
        ViewGroup viewGroup = ((k.z) this.t).R;
        WeakHashMap weakHashMap = c1.a;
        r0.c(viewGroup);
        return ((o.a) this.s).g(bVar, menu);
    }

    public KSerializer h(r71.b bVar) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.t;
        Class x = v8.l0.x(bVar);
        Object obj = concurrentHashMap.get(x);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(x, (obj = new k81.k((KSerializer) ((j71.c) this.s).k(bVar))))) != null) {
            obj = putIfAbsent;
        }
        return ((k81.k) obj).a;
    }

    public void i(fa1.e eVar, q0 q0Var) {
        ((o) this.t).r.execute(new androidx.fragment.app.e(this, (h) this.s, q0Var, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
    
        if (java.lang.Math.abs(r11) <= java.lang.Math.abs(r10)) goto L87;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float j(float f) {
        switch (this.r) {
            case 13:
                s sVar = (s) this.s;
                java.util.List r3 = (java.util.List) (sVar.h().k);
                i0Shadow.m mVar = (i0Shadow.m) this.t;
                int size = r3.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    androidx.compose.foundation.lazy.layout.r0 r0Var = (m) r3.get(i);
                    androidx.compose.foundation.lazy.layout.r0 r0Var2 = r0Var instanceof androidx.compose.foundation.lazy.layout.r0 ? r0Var : null;
                    if (r0Var2 == null || !r0Var2.e()) {
                        int D = aa1.b.D(sVar.h());
                        int i2 = -sVar.h().l;
                        int i3 = sVar.h().p;
                        int i4 = ((m) r0Var).p;
                        int i5 = ((m) r0Var).o;
                        int i6 = sVar.h().n;
                        float c = i5 - mVar.c(D, i4, i2, i3);
                        if (c <= 0.0f && c > f2) {
                            f2 = c;
                        }
                        if (c >= 0.0f && c < f3) {
                            f3 = c;
                        }
                    }
                }
                char c2 = Math.abs(f) < ((l) sVar.f.getValue()).i.W(j.a) ? (char) 0 : f > 0.0f ? (char) 1 : (char) 2;
                if (c2 == 0) {
                    break;
                } else {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            f2 = 0.0f;
                        }
                    }
                    f2 = f3;
                }
                if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return f2;
            default:
                x xVar = (x) this.s;
                i0Shadow.m mVar2 = xVar.l().n;
                List list = xVar.l().a;
                int size2 = list.size();
                float f4 = Float.POSITIVE_INFINITY;
                float f5 = Float.NEGATIVE_INFINITY;
                for (int i7 = 0; i7 < size2; i7++) {
                    o0.f fVar = (o0.f) list.get(i7);
                    int A = t1.A(xVar.l());
                    int i8 = -xVar.l().f;
                    int i9 = xVar.l().d;
                    int i10 = xVar.l().b;
                    int i12 = fVar.j;
                    xVar.m();
                    float c3 = i12 - mVar2.c(A, i10, i8, i9);
                    if (c3 <= 0.0f && c3 > f5) {
                        f5 = c3;
                    }
                    if (c3 >= 0.0f && c3 < f4) {
                        f4 = c3;
                    }
                }
                if (f5 == Float.NEGATIVE_INFINITY) {
                    f5 = f4;
                }
                if (f4 == Float.POSITIVE_INFINITY) {
                    f4 = f5;
                }
                if (!xVar.c()) {
                    if (b41.b.C(xVar, f)) {
                        f5 = 0.0f;
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                }
                if (!xVar.b()) {
                    f5 = 0.0f;
                    if (!b41.b.C(xVar, f)) {
                        f4 = 0.0f;
                    }
                }
                Float valueOf = Float.valueOf(f5);
                Float valueOf2 = Float.valueOf(f4);
                float floatValue = valueOf.floatValue();
                float floatValue2 = valueOf2.floatValue();
                float floatValue3 = ((Number) ((com.github.rudroid.settings.codeoptions.g) this.t).f(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
                    k0.b.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
                }
                if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return floatValue3;
        }
    }

    @Override // e51.b
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        b[] bVarArr = (b[]) this.s;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            b bVar = bVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = bVar.k(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((a0) this.t).k(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public int l(int i) {
        CharSequence charSequence = (CharSequence) this.s;
        do {
            i = ((i3.e) this.t).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    public int m(int i) {
        do {
            i = ((i3.e) this.t).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.s).charAt(i - 1)));
        return i;
    }

    public long n(long j) {
        r rVar = (r) this.s;
        Long l = (Long) rVar.b(j);
        if (l == null) {
            r1 r1Var = (r1) this.t;
            long j2 = r1Var.r;
            r1Var.r = 1 + j2;
            l = Long.valueOf(j2);
            rVar.g(j, l);
        }
        return l.longValue();
    }

    public boolean o(o.b bVar, Menu menu) {
        return ((o.a) this.s).o(bVar, menu);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        r9 = r3;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fd, code lost:
    
        if (r13 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(u81.m mVar, q81.a0 a0Var) {
        k0 a;
        i0Shadow c;
        int intValue;
        int i;
        int i2;
        boolean z;
        String str;
        switch (this.r) {
            case 5:
                h hVar = (h) this.s;
                z zVar = (z) this.t;
                try {
                    try {
                        hVar.i(zVar, zVar.c(a0Var));
                        return;
                    } catch (Throwable th) {
                        x0.r(th);
                        th.printStackTrace();
                        return;
                    }
                } catch (Throwable th2) {
                    x0.r(th2);
                    try {
                        hVar.s(zVar, th2);
                        return;
                    } catch (Throwable th3) {
                        x0.r(th3);
                        th3.printStackTrace();
                        return;
                    }
                }
            default:
                try {
                    j0 a2 = ((g91.f) this.s).a(a0Var);
                    q81.n nVar = a0Var.w;
                    int size = nVar.size();
                    int i3 = 0;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    Integer num = null;
                    Integer num2 = null;
                    while (i4 < size) {
                        if (nVar.b(i4).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                            String e = nVar.e(i4);
                            int i5 = i3;
                            while (i5 < e.length()) {
                                q81.n nVar2 = nVar;
                                int e2 = r81.e.e(e, ',', i5, i3, 4);
                                int d = r81.e.d(e, ';', i5, e2);
                                String o = r81.e.o(i5, e, d);
                                int i6 = d + 1;
                                boolean z6 = true;
                                if (o.equalsIgnoreCase("permessage-deflate")) {
                                    if (z2) {
                                        z5 = true;
                                    }
                                    i5 = i6;
                                    while (i5 < e2) {
                                        int d2 = r81.e.d(e, ';', i5, e2);
                                        int d3 = r81.e.d(e, '=', i5, d2);
                                        String o2 = r81.e.o(i5, e, d3);
                                        if (d3 < d2) {
                                            str = r81.e.o(d3 + 1, e, d2);
                                            i = e2;
                                            i2 = size;
                                            if (str.length() >= 2 && t71.p.i0(str, "\"") && t71.p.L(str, "\"")) {
                                                z = z6;
                                                str = str.substring(z ? 1 : 0, str.length() - 1);
                                                k71.k.f(str, "substring(...)");
                                            } else {
                                                z = z6;
                                            }
                                        } else {
                                            i = e2;
                                            i2 = size;
                                            z = z6;
                                            str = null;
                                        }
                                        int i7 = d2 + 1;
                                        if (o2.equalsIgnoreCase("client_max_window_bits")) {
                                            if (num != null) {
                                                z5 = z;
                                            }
                                            if (str == null) {
                                                num = null;
                                                break;
                                            } else {
                                                num = t71.w.G(str);
                                                break;
                                            }
                                        } else if (o2.equalsIgnoreCase("client_no_context_takeover")) {
                                            if (z3) {
                                                z5 = z;
                                            }
                                            if (str != null) {
                                                z5 = z;
                                            }
                                            i5 = i7;
                                            z3 = z;
                                            z6 = z3;
                                        } else {
                                            if (o2.equalsIgnoreCase("server_max_window_bits")) {
                                                if (num2 != null) {
                                                    z5 = z;
                                                }
                                                if (str == null) {
                                                    num2 = null;
                                                    break;
                                                } else {
                                                    num2 = t71.w.G(str);
                                                    break;
                                                }
                                            } else if (o2.equalsIgnoreCase("server_no_context_takeover")) {
                                                if (z4) {
                                                    z5 = z;
                                                }
                                                if (str != null) {
                                                    z5 = z;
                                                }
                                                i5 = i7;
                                                z4 = z;
                                                z6 = z4;
                                            }
                                            i5 = i7;
                                            z5 = z;
                                            z6 = z5;
                                        }
                                        e2 = i;
                                        size = i2;
                                    }
                                    z2 = z6;
                                } else {
                                    z5 = true;
                                    i5 = i6;
                                }
                                nVar = nVar2;
                                i3 = 0;
                            }
                        }
                        i4++;
                        nVar = nVar;
                        size = size;
                        i3 = 0;
                    }
                    ((g91.f) this.s).d = new g91.g(z2, num, z3, num2, z4, z5);
                    if (z5 || num != null || (num2 != null && (8 > (intValue = num2.intValue()) || intValue >= 16))) {
                        g91.f fVar = (g91.f) this.s;
                        synchronized (fVar) {
                            fVar.p.clear();
                            fVar.b("unexpected Sec-WebSocket-Extensions in response header", 1010);
                        }
                    }
                    String str2 = r81.g.b + " WebSocket " + ((q81.o) ((androidx.lifecycle.b) this.t).b).g();
                    g91.f fVar2 = (g91.f) this.s;
                    l51.h hVar2 = new l51.h(a2);
                    k71.k.g(str2, "name");
                    g91.g gVar = fVar2.d;
                    k71.k.d(gVar);
                    synchronized (fVar2) {
                        try {
                            fVar2.m = str2;
                            fVar2.n = hVar2;
                            fVar2.k = new g91.j((h91.d0) hVar2.u, fVar2.b, gVar.a, gVar.c, fVar2.e);
                            fVar2.i = new g91.e(fVar2);
                            long j = fVar2.c;
                            if (j != 0) {
                                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                                t81.c cVar = fVar2.l;
                                String concat = str2.concat(" ping");
                                b3 b3Var = new b3(1, nanos, fVar2);
                                cVar.getClass();
                                k71.k.g(concat, "name");
                                cVar.c(new t81.b(concat, b3Var), nanos);
                            }
                            if (!fVar2.p.isEmpty()) {
                                fVar2.e();
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    fVar2.j = new g91.i((e0) hVar2.t, fVar2, gVar.a, gVar.e);
                    q81.h0 h0Var = (g91.f) this.s;
                    try {
                        try {
                            ((g91.f) h0Var).a.L(h0Var, a0Var);
                            while (((g91.f) h0Var).s == -1) {
                                g91.i iVar = ((g91.f) h0Var).j;
                                k71.k.d(iVar);
                                iVar.f();
                            }
                        } catch (Exception e3) {
                            g91.f.c(h0Var, e3, (q81.a0) null, 6);
                        }
                        return;
                    } finally {
                        h0Var.d();
                    }
                } catch (IOException e4) {
                    g91.f.c((g91.f) this.s, e4, a0Var, 4);
                    r81.e.b(a0Var);
                    j0 j0Var = a0Var.y;
                    if (j0Var != null && (c = j0Var.c()) != null) {
                        r81.e.b(c);
                    }
                    j0 j0Var2 = a0Var.y;
                    if (j0Var2 == null || (a = j0Var2.a()) == null) {
                        return;
                    }
                    r81.e.b(a);
                    return;
                }
        }
    }

    public void q(o.b bVar) {
        ((o.a) this.s).q(bVar);
        k.z zVar = (k.z) this.t;
        if (zVar.N != null) {
            zVar.C.getDecorView().removeCallbacks(zVar.O);
        }
        if (zVar.M != null) {
            l1 l1Var = zVar.P;
            if (l1Var != null) {
                l1Var.b();
            }
            l1 b = c1.b(zVar.M);
            b.a(0.0f);
            zVar.P = b;
            b.d(new k.q(2, this));
        }
        zVar.L = null;
        ViewGroup viewGroup = zVar.R;
        WeakHashMap weakHashMap = c1.a;
        r0.c(viewGroup);
        zVar.N();
    }

    public void r(u81.m mVar, IOException iOException) {
        switch (this.r) {
            case 5:
                try {
                    ((h) this.s).s((z) this.t, iOException);
                    break;
                } catch (Throwable th) {
                    x0.r(th);
                    th.printStackTrace();
                    return;
                }
            default:
                g91.f.c((g91.f) this.s, iOException, (q81.a0) null, 6);
                break;
        }
    }

    public void s(fa1.e eVar, Throwable th) {
        ((o) this.t).r.execute(new androidx.fragment.app.e(this, (h) this.s, th, 2));
    }

    public void t(Preference preference) {
        ((PreferenceGroup) this.s).l0 = Integer.MAX_VALUE;
        e7.r rVar = (e7.r) this.t;
        Handler handler = rVar.h;
        androidx.fragment.app.o oVar = rVar.i;
        handler.removeCallbacks(oVar);
        handler.post(oVar);
    }

    public List u(Integer num) {
        List u = ((l0) this.s).u((Integer) null);
        v2 v2Var = (v2) this.t;
        int i = v2Var.v;
        return i < 0 ? u : x61.m.l0(b91.g.k(v2Var, num, i, Integer.valueOf(v2Var.G(v2Var.b, i))), u);
    }

    public int v(int i) {
        do {
            i = ((i3.e) this.t).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.s).charAt(i)));
        return i;
    }

    public int w(int i) {
        do {
            i = ((i3.e) this.t).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.s).charAt(i - 1)));
        return i;
    }

    @Override // w21.c
    public void x(w21.o oVar) {
        h41.h hVar = (h41.h) this.s;
        w21.g gVar = (w21.g) this.t;
        synchronized (hVar.f) {
            hVar.e.remove(gVar);
        }
    }

    public Object y(a61.o oVar, y0 y0Var) {
        Object a = ((h1.o) this.t).a(j1.s, new di.e(this, oVar, (a71.c) null, 1), y0Var);
        return a == b71.a.r ? a : w61.a0.a;
    }

    public v z(List list) {
        l3.g gVar;
        Exception e;
        l3.g gVar2;
        try {
            int size = list.size();
            int i = 0;
            gVar = null;
            while (i < size) {
                try {
                    gVar2 = (l3.g) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    gVar2.a((com.google.android.material.datepicker.l) this.t);
                    i++;
                    gVar = gVar2;
                } catch (Exception e3) {
                    e = e3;
                    gVar = gVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((i3.e) ((com.google.android.material.datepicker.l) this.t).w).b());
                    sb2.append(", composition=");
                    sb2.append(((com.google.android.material.datepicker.l) this.t).c());
                    sb2.append(", selection=");
                    com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) this.t;
                    sb2.append((Object) p0.h(g0.b(lVar.s, lVar.t)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    x61.m.b0(list, sb, new h1.r(7, gVar, this), 60);
                    String sb3 = sb.toString();
                    k71.k.f(sb3, "toString(...)");
                    throw new RuntimeException(sb3, e);
                }
            }
            com.google.android.material.datepicker.l lVar2 = (com.google.android.material.datepicker.l) this.t;
            lVar2.getClass();
            g3.g gVar3 = new g3.g(((i3.e) lVar2.w).toString());
            com.google.android.material.datepicker.l lVar3 = (com.google.android.material.datepicker.l) this.t;
            long b = g0.b(lVar3.s, lVar3.t);
            p0 p0Var = p0.g(((v) this.s).b) ? null : new p0(b);
            v vVar = new v(gVar3, p0Var != null ? p0Var.a : g0.b(p0.e(b), p0.f(b)), ((com.google.android.material.datepicker.l) this.t).c());
            this.s = vVar;
            return vVar;
        } catch (Exception e4) {
            gVar = null;
            e = e4;
        }
    }

    public /* synthetic */ a(int i, boolean z) {
        this.r = i;
    }

    public /* synthetic */ a(Object obj, Object obj2, boolean z, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    public a(g41.f fVar) {
        this.r = 6;
        this.t = new Handler(Looper.getMainLooper());
        this.s = fVar;
    }

    public a(int i, CharSequence charSequence) {
        this.r = 24;
        k71.k.g(charSequence, "text");
        this.s = charSequence;
        this.t = s91.a.a;
    }

    public a(kk.g gVar, kk.i iVar) {
        this.r = 25;
        k71.k.g(gVar, "discussionDataMapper");
        k71.k.g(iVar, "pinnedDiscussionDataMapper");
        this.s = gVar;
        this.t = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(CharSequence charSequence) {
        this(0, charSequence);
        this.r = 24;
        k71.k.g(charSequence, "text");
    }

    public a(b[] bVarArr) {
        this.r = 0;
        this.s = bVarArr;
        this.t = new a0(6);
    }

    public a(x xVar, com.github.rudroid.settings.codeoptions.g gVar, o0.s sVar) {
        this.r = 14;
        this.s = xVar;
        this.t = gVar;
    }

    public a(y51.c cVar) {
        this.r = 17;
        this.s = cVar;
        this.t = new ArrayList();
    }

    public a(r1 r1Var) {
        this.r = 29;
        this.t = r1Var;
        this.s = new r((Object) null);
    }

    public a(j71.c cVar) {
        this.r = 22;
        this.s = cVar;
        this.t = new ConcurrentHashMap();
    }

    public a(j71.e eVar) {
        this.r = 23;
        this.s = eVar;
        this.t = new ConcurrentHashMap();
    }

    public a(h1.o oVar) {
        this.r = 10;
        this.t = oVar;
        this.s = new t9(1, oVar);
    }

    public a(i8.d dVar, androidx.fragment.app.a0 a0Var, FrameLayout frameLayout) {
        this.r = 16;
        this.s = a0Var;
        this.t = frameLayout;
    }

    public a(int i) {
        this.r = i;
        switch (i) {
            case 21:
                this.s = new c30.d(8);
                this.t = new z1(16);
                break;
            case 28:
                this.s = new SparseIntArray();
                this.t = new SparseIntArray();
                break;
            default:
                this.s = new r2.c(0);
                this.t = new r2.c(0);
                break;
        }
    }

    public a(f0.h hVar) {
        this.r = 2;
        this.s = hVar;
    }




    public a(Object... a) {
    }
    public Object b(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object o(Object, Object) { return null; }
    public Object q(Object) { return null; }
}
