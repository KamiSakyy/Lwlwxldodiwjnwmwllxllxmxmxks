package um;

import com.github.domain.database.GitHubDatabase;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.d5;
import d1.e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rm0.r3Shadow;
import sy.y;
import t00.z1;
import y71.n1;
import z01.j1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public static final b Companion = new b();
    public final s a;
    public final oa.g b;
    public final vm.b c;
    public final com.github.rudroid.common.k d;

    public r(s sVar, oa.g gVar, vm.b bVar, com.github.rudroid.common.k kVar) {
        k71.k.g(sVar, "shortcutsStore");
        k71.k.g(gVar, "shortcutsService");
        k71.k.g(bVar, "shortcutsFilterMapper");
        k71.k.g(kVar, "featureManager");
        this.a = sVar;
        this.b = gVar;
        this.c = bVar;
        this.d = kVar;
    }

    public static final ArrayList a(r rVar, List list) {
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = c.a[((StoredShortcutModel) obj).y.ordinal()];
            boolean z = true;
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z = rVar.d.e();
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final r3 b(oa.j jVar, String str) {
        k71.k.g(jVar, "user");
        k71.k.g(str, "id");
        s sVar = this.a;
        sVar.getClass();
        ek.d F = ((GitHubDatabase) sVar.a.a(jVar)).F();
        F.getClass();
        return new r3Shadow(9, new y00.l(d5.B(F.a, new String[]{"shortcuts"}, new e0(15, str, F)), 10), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(oa.j jVar, c71.c cVar) {
        l lVar;
        int i;
        List list;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.w = i2 - Integer.MIN_VALUE;
                Object obj = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.w;
                if (i != 0) {
                    y.j(obj);
                    if (!this.d.e()) {
                        c00.g b = this.a.b(jVar);
                        lVar.w = 1;
                        obj = n1.v(b, lVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return x61.r.r;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                list = (List) obj;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((ek.e) obj2).f == ShortcutType.REPOSITORIES) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        this.c.getClass();
                        arrayList2.add(vm.b.d((ek.e) obj3));
                    }
                    return arrayList2;
                }
                return x61.r.r;
            }
        }
        lVar = new l(this, cVar);
        Object obj4 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.w;
        if (i != 0) {
        }
        list = (List) obj4;
        if (list != null) {
        }
        return x61.r.r;
    }

    public final gl.f d(oa.j jVar) {
        k71.k.g(jVar, "user");
        return in.r.l(new y71.y(((j1) this.b.a(jVar)).b(), new z1(this, jVar, null, 9), 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(oa.j jVar, String str, c71.c cVar) {
        n nVar;
        int i;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i2 = nVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.y = i2 - Integer.MIN_VALUE;
                Object obj = nVar.w;
                b71.a aVar = b71.a.r;
                i = nVar.y;
                if (i != 0) {
                    y.j(obj);
                    j1 j1Var = (j1) this.b.a(jVar);
                    nVar.u = jVar;
                    nVar.v = str;
                    nVar.y = 1;
                    obj = j1Var.d(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = nVar.v;
                    jVar = nVar.u;
                    y.j(obj);
                }
                return new do0.r((y71.i) obj, this, jVar, str, 6);
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.w;
        b71.a aVar2 = b71.a.r;
        i = nVar.y;
        if (i != 0) {
        }
        return new do0.r((y71.i) obj2, this, jVar, str, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[LOOP:0: B:18:0x006f->B:19:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(oa.j jVar, List list, c71.c cVar) {
        p pVar;
        int i;
        int size;
        int i2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i3 = pVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.y = i3 - Integer.MIN_VALUE;
                Object obj = pVar.w;
                Object obj2 = b71.a.r;
                i = pVar.y;
                if (i != 0) {
                    y.j(obj);
                    pVar.u = jVar;
                    pVar.v = list;
                    pVar.y = 1;
                    obj = c(jVar, pVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = pVar.u;
                        y.j(obj);
                        return new f((y71.i) obj, this, jVar, 1);
                    }
                    list = pVar.v;
                    jVar = pVar.u;
                    y.j(obj);
                }
                ArrayList l0 = x61.m.l0(list, (Iterable) obj);
                j1 j1Var = (j1) this.b.a(jVar);
                this.c.getClass();
                ArrayList arrayList = new ArrayList(x61.n.F(l0, 10));
                size = l0.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj3 = l0.get(i2);
                    i2++;
                    arrayList.add(vm.b.a((wm.b) obj3));
                }
                pVar.u = jVar;
                pVar.v = null;
                pVar.y = 2;
                obj = j1Var.e(arrayList);
            }
        }
        pVar = new p(this, cVar);
        Object obj4 = pVar.w;
        Object obj22 = b71.a.r;
        i = pVar.y;
        if (i != 0) {
        }
        ArrayList l02 = x61.m.l0(list, (Iterable) obj4);
        j1 j1Var2 = (j1) this.b.a(jVar);
        this.c.getClass();
        ArrayList arrayList2 = new ArrayList(x61.n.F(l02, 10));
        size = l02.size();
        i2 = 0;
        while (i2 < size) {
        }
        pVar.u = jVar;
        pVar.v = null;
        pVar.y = 2;
        obj4 = j1Var2.e(arrayList2);
    }
}
