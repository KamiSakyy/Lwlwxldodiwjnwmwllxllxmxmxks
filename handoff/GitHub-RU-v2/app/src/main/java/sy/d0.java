package sy;

import a0.s0;
import android.content.Context;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.type.MilestoneState;
import gn0.e10;
import gn0.og;
import is.i1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.f4;
import kotlin.NoWhenBranchMatchedException;
import m10.ka;
import qx.z0;
import yz0.b8;
import yz0.e8;
import yz0.p0;
import yz0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 {
    public static final MilestoneState A(og ogVar) {
        int ordinal = ogVar.ordinal();
        if (ordinal == 0) {
            return MilestoneState.CLOSED;
        }
        if (ordinal == 1) {
            return MilestoneState.OPEN;
        }
        if (ordinal == 2) {
            return MilestoneState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final e10 B(NavLinkIdentifier navLinkIdentifier) {
        k71.k.g(navLinkIdentifier, "<this>");
        switch (tl0.a.a[navLinkIdentifier.ordinal()]) {
            case 1:
                return e10.t;
            case 2:
                return e10.u;
            case 3:
                return e10.v;
            case 4:
                return e10.w;
            case 5:
                return e10.x;
            case 6:
                return e10.y;
            case 7:
                return e10.z;
            case 8:
                return e10.A;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final t10.g C(ka kaVar) {
        switch (kaVar.ordinal()) {
            case 0:
                return t10.g.r;
            case 1:
            case 7:
            case 9:
            case 11:
                return t10.g.z;
            case 2:
                return t10.g.w;
            case 3:
                return t10.g.y;
            case 4:
                return t10.g.x;
            case 5:
                return t10.g.s;
            case 6:
                return t10.g.v;
            case 8:
                return t10.g.t;
            case 10:
                return t10.g.u;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final e8 D(z0 z0Var) {
        return new e8(z0Var.e.a, z0Var.a, z0Var.b, z0Var.f);
    }

    public static final boolean E(ms.i iVar) {
        ms.h hVar = iVar.i;
        return (hVar != null ? hVar.b : false) && iVar.h == null;
    }

    public static final x1.e a(String str) {
        return new x1.e(f0.r(str));
    }

    public static ArrayList b(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new x61.j(objArr, true));
    }

    public static final b01.g c(ar.c cVar, String str, pv.c cVar2, ju.a aVar, Integer num, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, List list, i1 i1Var, boolean z6, boolean z7, boolean z8) {
        x2 x2Var;
        fz.b bVar = new fz.b(cVar, str, p0.s);
        String str3 = cVar.b;
        ArrayList h = w8.s.h(str3, cVar2);
        boolean z9 = cVar2.c;
        if (aVar != null) {
            x2Var = k41.b.f(aVar);
        } else {
            x2.Companion.getClass();
            x2Var = x2.e;
        }
        return new b01.g(bVar, h, z9, num, z, z2, z3, z4, str2, z5, x2Var, list, new b8(i1Var.d, str3, z8, i1Var.c), z6, z7);
    }

    public static final b01.g d(ar.c cVar, String str, pv.c cVar2, ju.a aVar, ms.o oVar, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, i1 i1Var, boolean z6, boolean z7, boolean z8) {
        ms.t tVar;
        ms.n nVar = oVar.b;
        fz.b bVar = new fz.b(cVar, str, p0.s);
        String str3 = cVar.b;
        ArrayList h = w8.s.h(str3, cVar2);
        boolean z9 = cVar2.c;
        Integer valueOf = Integer.valueOf(nVar.a);
        x2 f = k41.b.f(aVar);
        x61.r rVar = nVar.b;
        if (rVar == null) {
            rVar = x61.r.r;
        }
        ArrayList S = x61.m.S(rVar);
        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i = 0;
        while (i < size) {
            Object obj = S.get(i);
            i++;
            ms.v vVar = ((ms.m) obj).c;
            ar.c cVar3 = vVar.h;
            String str4 = vVar.b;
            pv.c cVar4 = vVar.i;
            Integer num = valueOf;
            ju.a aVar2 = vVar.k;
            pu.a aVar3 = vVar.j;
            ArrayList arrayList2 = S;
            boolean z11 = aVar3.b;
            boolean z12 = aVar3.c;
            mx.a aVar4 = cVar3.l;
            boolean z13 = aVar4 != null ? aVar4.b : false;
            boolean z14 = vVar.c;
            boolean z15 = vVar.d;
            boolean z16 = vVar.e;
            ms.u uVar = vVar.f;
            arrayList.add(e(cVar3, str4, cVar4, aVar2, z11, z12, z13, z14, z15, z16, (uVar == null || (tVar = uVar.c) == null) ? null : tVar.b));
            valueOf = num;
            S = arrayList2;
        }
        return new b01.g(bVar, h, z9, valueOf, z, z2, z3, z4, str2, z5, f, arrayList, new b8(i1Var.d, str3, z8, i1Var.c), z6, z7);
    }

    public static final b01.g e(ar.c cVar, String str, pv.c cVar2, ju.a aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2) {
        return new b01.g(new fz.b(cVar, str, p0.s), w8.s.h(cVar.b, cVar2), cVar2.c, (Integer) null, z3, z4, z5, z6, str2, false, k41.b.f(aVar), (List) null, (b8) null, z, z2);
    }

    public static int g(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        k71.k.g(arrayList, "<this>");
        v(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int g = t.g((Comparable) arrayList.get(i3), comparable);
            if (g < 0) {
                i2 = i3 + 1;
            } else {
                if (g <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static y61.b h(y61.b bVar) {
        bVar.g();
        bVar.t = true;
        return bVar.s > 0 ? bVar : y61.b.u;
    }

    public static y61.b i() {
        return new y61.b(10);
    }

    public static final String j(yz0.f fVar) {
        k71.k.g(fVar, "<this>");
        return fVar.q() ? fVar.getName() : fVar.d();
    }

    public static final String[] k(x1.n nVar) {
        k71.k.e(nVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((x1.e) nVar).b.toArray(new String[0]);
    }

    public static q71.g l(Collection collection) {
        k71.k.g(collection, "<this>");
        return new q71.g(0, collection.size() - 1, 1);
    }

    public static int m(List list) {
        k71.k.g(list, "<this>");
        return list.size() - 1;
    }

    public static List n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        k71.k.f(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List o(Object... objArr) {
        return objArr.length > 0 ? x61.l.r(objArr) : x61.r.r;
    }

    public static final void p(Context context) {
        k71.k.g(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        k71.k.f(databasePath, "getDatabasePath(...)");
        if (databasePath.exists()) {
            v8.x a = v8.x.a();
            String[] strArr = w8.m.a;
            a.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            k71.k.f(databasePath2, "getDatabasePath(...)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            k71.k.f(noBackupFilesDir, "getNoBackupFilesDir(...)");
            String[] strArr2 = w8.m.a;
            int s = x61.x.s(strArr2.length);
            if (s < 16) {
                s = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(s);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            for (Map.Entry entry : x61.x.y(linkedHashMap, new w61.k(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        v8.x a2 = v8.x.a();
                        String[] strArr3 = w8.m.a;
                        file2.toString();
                        a2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    v8.x a3 = v8.x.a();
                    String[] strArr4 = w8.m.a;
                    a3.getClass();
                }
            }
        }
    }

    public static ArrayList q(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new x61.j(objArr, true));
    }

    public static final List t(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : n(list.get(0)) : x61.r.r;
    }

    public static final boolean u(String str) {
        k71.k.g(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final void v(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(s0.i("fromIndex (0) is greater than toIndex (", i2, ")."));
        }
        if (i2 > i) {
            throw new IndexOutOfBoundsException(f4.h(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final NavLinkIdentifier y(e10 e10Var) {
        switch (e10Var.ordinal()) {
            case 0:
                return NavLinkIdentifier.DISCUSSIONS;
            case 1:
                return NavLinkIdentifier.ISSUES;
            case 2:
                return NavLinkIdentifier.ORGANIZATIONS;
            case 3:
                return NavLinkIdentifier.PROJECTS;
            case 4:
                return NavLinkIdentifier.PULL_REQUESTS;
            case 5:
                return NavLinkIdentifier.REPOSITORIES;
            case 6:
                return NavLinkIdentifier.STARRED;
            case 7:
                return NavLinkIdentifier.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final yz0.j z(u80.c cVar, boolean z) {
        u80.b bVar = cVar.c;
        if (bVar == null) {
            throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "A Ref should contain a target Oid", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
        }
        String str = bVar.b;
        return new yz0.j(cVar.d.a, cVar.a, str, cVar.b, z);
    }

    public abstract void r(Throwable th2);

    public abstract void s(w51.r rVar);
}
