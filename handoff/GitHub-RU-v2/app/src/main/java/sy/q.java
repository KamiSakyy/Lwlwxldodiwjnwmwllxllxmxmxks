package sy;

import androidx.compose.runtime.b2;
import androidx.lifecycle.k1;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.b4;
import e50.d1;
import ea0.z0;
import er.g1;
import er.h1;
import er.i1;
import er.j1;
import er.l1;
import f1.f4;
import gn0.yv;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import wy0.p4;
import xn.e1;
import xz.g0;
import xz.h0;
import xz.i0;
import yz0.e8;
import yz0.j4;
import yz0.m2;
import z70.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q {
    public static final void a(h6.b bVar, r1.d dVar, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(-1991437157);
        if (((i | 2) & 19) == 18 && sVar.C()) {
            sVar.V();
        } else {
            sVar.X();
            if ((i & 1) == 0 || sVar.A()) {
                bVar = (h6.b) sVar.j(z5.g.e);
            } else {
                sVar.V();
            }
            sVar.r();
            androidx.compose.runtime.t.a(z5.g.e.a(bVar), dVar, sVar, 48);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new f4(bVar, dVar, i, 19);
        }
    }

    public static boolean b(ArrayList arrayList, int i, int i2) {
        x91.a aVar = (x91.a) arrayList.get(i);
        x91.a aVar2 = (x91.a) arrayList.get(i2);
        if (i <= 0) {
            return false;
        }
        int i3 = i - 1;
        return ((x91.a) arrayList.get(i3)).g == aVar.g + 1 && ((x91.a) arrayList.get(i3)).f == aVar.f && ((x91.a) arrayList.get(i3)).b == aVar.b - 1 && ((x91.a) arrayList.get(aVar.g + 1)).b == aVar2.b + 1;
    }

    public static final b01.i c(e50.p pVar) {
        i50.f fVar;
        e50.m mVar = pVar.c;
        x61.r rVar = mVar.b;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList S = x61.m.S(rVar);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int i = 0;
        for (int size = S.size(); i < size; size = size) {
            Object obj = S.get(i);
            i++;
            e50.n nVar = (e50.n) obj;
            i50.h hVar = nVar.c;
            c40.c cVar = hVar.j;
            String str = hVar.c;
            i80.c cVar2 = nVar.d;
            y60.a aVar = hVar.l;
            i50.n nVar2 = nVar.e;
            boolean z = hVar.d;
            boolean z2 = hVar.e;
            boolean z3 = hVar.f;
            boolean z4 = hVar.g;
            ArrayList arrayList2 = S;
            i50.g gVar = hVar.i;
            String str2 = (gVar == null || (fVar = gVar.c) == null) ? null : fVar.b;
            boolean z5 = hVar.h != null;
            d1 d1Var = hVar.m;
            g70.a aVar2 = hVar.k;
            arrayList.add(r.c(cVar, str, cVar2, aVar, nVar2, z, z2, z3, z4, str2, z5, d1Var, aVar2.b, aVar2.c, r.A(hVar)));
            S = arrayList2;
        }
        n70.a aVar3 = mVar.a.b;
        boolean z6 = aVar3.a;
        String str3 = aVar3.b;
        if (str3 == null) {
            str3 = "";
        }
        return new b01.i(arrayList, new yz0.f4(str3, z6));
    }

    public static final List d(na0.m mVar) {
        List<na0.o> list;
        m2 b;
        k71.k.g(mVar, "<this>");
        na0.n nVar = mVar.a;
        ArrayList arrayList = null;
        if (nVar != null && (list = nVar.a) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (na0.o oVar : list) {
                w50.e0 e0Var = oVar.b;
                if (e0Var != null) {
                    b = va0.c.a(e0Var, true);
                } else {
                    t1 t1Var = oVar.c;
                    b = t1Var != null ? va0.c.b(t1Var, true) : null;
                }
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x61.r.r : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static k1 f(Class cls) {
        k71.k.g(cls, "modelClass");
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                k71.k.d(newInstance);
                return (k1) newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    public static x6.w g(x6.xShadow xVar) {
        Iterator it = s71.j.h0(xVar, new p4(20)).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (x6.w) next;
    }

    public static final List i(vz.b bVar) {
        vz.f fVar;
        vz.c cVar;
        List list;
        k71.k.g(bVar, "<this>");
        vz.e eVar = bVar.a;
        return (eVar == null || (fVar = eVar.c) == null || (cVar = fVar.b) == null || (list = cVar.c) == null) ? x61.r.r : list;
    }

    public static final ArrayList j(vz.d dVar) {
        List<xz.n> list = dVar.c.c.b.c;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (xz.n nVar : list) {
            arrayList.add(nVar != null ? nVar.b : null);
        }
        return arrayList;
    }

    public static final String l(i0 i0Var) {
        xz.a0 a0Var = i0Var.b;
        if ((a0Var != null ? a0Var.a : null) != null) {
            return x61.m.c0(a0Var.a, (String) null, (String) null, (String) null, 0, (j71.c) null, 63);
        }
        xz.e0 e0Var = i0Var.f;
        if ((e0Var != null ? e0Var.a : null) != null) {
            return String.valueOf(e0Var.a.doubleValue());
        }
        h0 h0Var = i0Var.i;
        if ((h0Var != null ? h0Var.a : null) != null) {
            return h0Var.a;
        }
        xz.d0 d0Var = i0Var.e;
        if ((d0Var != null ? d0Var.a : null) != null) {
            return d0Var.a;
        }
        xz.f0 f0Var = i0Var.g;
        if ((f0Var != null ? f0Var.a : null) != null) {
            return f0Var.a;
        }
        xz.b0 b0Var = i0Var.c;
        if ((b0Var != null ? b0Var.a : null) != null) {
            String localDate = b0Var.a.toString();
            k71.k.f(localDate, "toString(...)");
            return localDate;
        }
        xz.c0 c0Var = i0Var.d;
        if ((c0Var != null ? c0Var.a : null) != null) {
            return c0Var.a;
        }
        g0 g0Var = i0Var.h;
        return (g0Var != null ? g0Var.a : null) != null ? g0Var.a : "";
    }

    public static final int m(e1 e1Var) {
        k71.k.g(e1Var, "<this>");
        switch (e1Var.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final j4 n(l1 l1Var) {
        com.github.service.models.response.a aVar;
        String str;
        StatusState statusState;
        j1 j1Var;
        j1 j1Var2;
        String str2;
        String str3;
        er.k1 k1Var;
        g1 g1Var = l1Var.h;
        h1 h1Var = l1Var.g;
        String str4 = "";
        if (l1Var.e || l1Var.d) {
            aVar = null;
        } else {
            if (h1Var == null || (k1Var = h1Var.d) == null) {
                str2 = h1Var != null ? h1Var.c : null;
                if (str2 == null) {
                    str3 = "";
                    aVar = new com.github.service.models.response.a(str3, new Avatar(h1Var == null ? h1Var.b : "", h1Var == null ? h1Var.a : ""), (String) null, false, (String) null, 60);
                }
            } else {
                str2 = k1Var.a;
            }
            str3 = str2;
            aVar = new com.github.service.models.response.a(str3, new Avatar(h1Var == null ? h1Var.b : "", h1Var == null ? h1Var.a : ""), (String) null, false, (String) null, 60);
        }
        if (g1Var == null || (j1Var2 = g1Var.d) == null) {
            String str5 = g1Var != null ? g1Var.c : null;
            str = str5 == null ? "" : str5;
        } else {
            str = j1Var2.b;
        }
        String str6 = g1Var != null ? g1Var.b : "";
        if (g1Var != null && (j1Var = g1Var.d) != null) {
            str4 = j1Var.a;
        }
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(str, new Avatar(str6, str4), (String) null, false, (String) null, 60);
        String str7 = l1Var.a;
        String str8 = l1Var.c;
        ZonedDateTime zonedDateTime = l1Var.b;
        String str9 = l1Var.f;
        i1 i1Var = l1Var.i;
        if (i1Var == null || (statusState = b4.o0(i1Var.b)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        return new j4(str7, str8, zonedDateTime, str9, statusState, aVar, aVar2);
    }

    public static final StatusState o(yv yvVar) {
        k71.k.g(yvVar, "<this>");
        int ordinal = yvVar.ordinal();
        if (ordinal == 0) {
            return StatusState.ERROR;
        }
        if (ordinal == 1) {
            return StatusState.EXPECTED;
        }
        if (ordinal == 2) {
            return StatusState.FAILURE;
        }
        if (ordinal == 3) {
            return StatusState.PENDING;
        }
        if (ordinal == 4) {
            return StatusState.SUCCESS;
        }
        if (ordinal == 5) {
            return StatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final e8 p(z0 z0Var) {
        return new e8(z0Var.e.a, z0Var.a, z0Var.b, z0Var.f);
    }

    public abstract float h(u31.y yVar);

    public abstract void k(u31.y yVar, float f);

    public <T0> T0 pShadow(Object... a) {
        return null;
    }
    public static final Object a = null;
}
