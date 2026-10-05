package b6;

import android.content.Context;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.google.android.gms.internal.measurement.z3;
import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class v implements a71.g {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ v f3714r = new v();

    public static final x0 a(String str) {
        Object newInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (newInstance instanceof x0) {
            return (x0) newInstance;
        }
        return null;
    }

    public static void b(int i) {
        synchronized (UnmanagedSessionReceiver.f2682a) {
            if (UnmanagedSessionReceiver.f2683b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|14|(1:16)|17|(2:20|18)|21|22|23))|34|6|7|(0)(0)|12|13|14|(0)|17|(1:18)|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = e6.s.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        r9 = e6.s.q();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[LOOP:0: B:18:0x0076->B:20:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Context context, int i, c71.c cVar) {
        d1 d1Var;
        int i10;
        int s2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i11 = d1Var.f3520y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d1Var.f3520y = i11 - Integer.MIN_VALUE;
                Object obj = d1Var.f3518w;
                b71.a aVar = b71.a.r;
                i10 = d1Var.f3520y;
                if (i10 != 0) {
                    sy.y.j(obj);
                    l6.f fVar = l6.f.f28037a;
                    k1 k1Var = k1.f3604a;
                    String w10 = z3.w(i);
                    d1Var.f3516u = context;
                    d1Var.f3517v = i;
                    d1Var.f3520y = 1;
                    obj = fVar.c(context, k1Var, w10, d1Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = d1Var.f3517v;
                    context = d1Var.f3516u;
                    sy.y.j(obj);
                }
                e6.s q10 = (e6.s) obj;
                Context context2 = context;
                int i12 = i;
                androidx.glance.appwidget.protobuf.d0<e6.u> r10 = q10.r();
                s2 = x61.x.s(x61.n.F(r10, 10));
                if (s2 < 16) {
                    s2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(s2);
                for (e6.u uVar : r10) {
                    linkedHashMap.put(uVar.p(), new Integer(uVar.q()));
                }
                LinkedHashMap C = x61.x.C(linkedHashMap);
                return new e1(context2, C, q10.s(), i12, x61.m.J0(C.values()));
            }
        }
        d1Var = new d1(this, cVar);
        Object obj2 = d1Var.f3518w;
        b71.a aVar2 = b71.a.r;
        i10 = d1Var.f3520y;
        if (i10 != 0) {
        }
        e6.s q102 = (e6.s) obj2;
        Context context22 = context;
        int i122 = i;
        androidx.glance.appwidget.protobuf.d0<e6.u> r102 = q102.r();
        s2 = x61.x.s(x61.n.F(r102, 10));
        if (s2 < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(s2);
        while (r7.hasNext()) {
        }
        LinkedHashMap C2 = x61.x.C(linkedHashMap2);
        return new e1(context22, C2, q102.s(), i122, x61.m.J0(C2.values()));
    }
}
