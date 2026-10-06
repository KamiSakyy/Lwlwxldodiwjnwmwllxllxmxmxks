package qm;

import h1.u;
import in.r;
import java.util.Iterator;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import oa.j;
import sy.y;
import v71.v;
import y71.i;
import y71.n1;
import z01.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public g a;
    public oa.g b;
    public v c;

    public d(g gVar, oa.g gVar2, v vVar) {
        k.g(gVar, "mobilePushNotificationSettingsStore");
        k.g(gVar2, "pushNotificationService");
        k.g(vVar, "ioDispatcher");
        this.a = gVar;
        this.b = gVar2;
        this.c = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, c71.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.x = i2 - Integer.MIN_VALUE;
                Object obj = aVar.v;
                b71.a aVar2 = b71.a.r;
                i = aVar.x;
                if (i != 0) {
                    y.j(obj);
                    u0 u0Var = (u0) this.b.a(jVar);
                    aVar.u = jVar;
                    aVar.x = 1;
                    obj = u0Var.n();
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = aVar.u;
                    y.j(obj);
                }
                return n1.y(r.l(new y71.y((i) obj, new u(this, jVar, (a71.c) null, 20), 6)), this.c);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.v;
        b71.a aVar22 = b71.a.r;
        i = aVar.x;
        if (i != 0) {
        }
        return n1.y(r.l(new y71.y((i) obj2, new u(this, jVar, (a71.c) null, 20), 6)), this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x006a, code lost:
    
        if (r1 == r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, ak.a aVar, boolean z, c71.c cVar) {
        b bVar;
        b71.a aVar2;
        int i;
        ak.a aVar3;
        boolean z2;
        List list;
        int i2;
        j71.f fVar;
        Object f;
        int i3;
        boolean z3;
        j jVar2;
        Object obj;
        j jVar3 = jVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i4 = bVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.A = i4 - Integer.MIN_VALUE;
                Object obj2 = bVar.y;
                aVar2 = b71.a.r;
                i = bVar.A;
                if (i != 0) {
                    y.j(obj2);
                    i a = this.a.a(jVar3);
                    bVar.u = jVar3;
                    aVar3 = aVar;
                    bVar.v = aVar3;
                    z2 = z;
                    bVar.w = z2;
                    bVar.A = 1;
                    obj2 = n1.v(a, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = bVar.x;
                        boolean z4 = bVar.w;
                        aVar3 = bVar.v;
                        j jVar4 = bVar.u;
                        y.j(obj2);
                        jVar2 = jVar4;
                        z3 = z4;
                        i3 = i5;
                        i iVar = (i) obj2;
                        ak.a aVar4 = aVar3;
                        return n1.y(r.l(new y71.y(new y71.y(new androidx.compose.foundation.lazy.layout.y(aVar4, z3, this, jVar2, (a71.c) null, 3), iVar), new c(aVar4, i3 == 0, this, jVar2, null))), this.c);
                    }
                    boolean z5 = bVar.w;
                    aVar3 = bVar.v;
                    j jVar5 = bVar.u;
                    y.j(obj2);
                    z2 = z5;
                    jVar3 = jVar5;
                }
                list = (List) obj2;
                a71.c cVar2 = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((ak.e) obj).a == aVar3) {
                            break;
                        }
                    }
                    ak.e eVar = (ak.e) obj;
                    if (eVar != null && eVar.b) {
                        i2 = 1;
                        int i6 = 3;
                        switch (aVar3.ordinal()) {
                            case 0:
                                fVar = new f(i6, cVar2, 0);
                                break;
                            case 1:
                                fVar = new f(i6, cVar2, 1);
                                break;
                            case 2:
                                fVar = new f(i6, cVar2, 2);
                                break;
                            case 3:
                                fVar = new f(i6, cVar2, 3);
                                break;
                            case 4:
                                fVar = new f(i6, cVar2, 4);
                                break;
                            case 5:
                                fVar = new f(i6, cVar2, 5);
                                break;
                            case 6:
                                fVar = new cn.f(i6, cVar2, 4);
                                break;
                            case 7:
                                fVar = new e(i6, cVar2, 2);
                                break;
                            case 8:
                                fVar = new e(i6, cVar2, 3);
                                break;
                            case 9:
                                fVar = new e(i6, cVar2, 0);
                                break;
                            case 10:
                                fVar = new e(i6, cVar2, 1);
                                break;
                            case 11:
                                throw new IllegalStateException("Setting unknown");
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        Object a2 = this.b.a(jVar3);
                        Boolean valueOf = Boolean.valueOf(z2);
                        bVar.u = jVar3;
                        bVar.v = aVar3;
                        bVar.w = z2;
                        bVar.x = i2;
                        bVar.A = 2;
                        f = fVar.f(a2, valueOf, bVar);
                        if (f != aVar2) {
                            boolean z6 = z2;
                            i3 = i2;
                            obj2 = f;
                            z3 = z6;
                            jVar2 = jVar3;
                            i iVar2 = (i) obj2;
                            ak.a aVar42 = aVar3;
                            return n1.y(r.l(new y71.y(new y71.y(new androidx.compose.foundation.lazy.layout.y(aVar42, z3, this, jVar2, (a71.c) null, 3), iVar2), new c(aVar42, i3 == 0, this, jVar2, null))), this.c);
                        }
                        return aVar2;
                    }
                }
                i2 = 0;
                int i62 = 3;
                switch (aVar3.ordinal()) {
                }
                Object a22 = this.b.a(jVar3);
                Boolean valueOf2 = Boolean.valueOf(z2);
                bVar.u = jVar3;
                bVar.v = aVar3;
                bVar.w = z2;
                bVar.x = i2;
                bVar.A = 2;
                f = fVar.f(a22, valueOf2, bVar);
                if (f != aVar2) {
                }
                return aVar2;
            }
        }
        bVar = new b(this, cVar);
        Object obj22 = bVar.y;
        aVar2 = b71.a.r;
        i = bVar.A;
        if (i != 0) {
        }
        list = (List) obj22;
        a71.c cVar22 = null;
        if (list != null) {
        }
        i2 = 0;
        int i622 = 3;
        switch (aVar3.ordinal()) {
        }
        Object a222 = this.b.a(jVar3);
        Boolean valueOf22 = Boolean.valueOf(z2);
        bVar.u = jVar3;
        bVar.v = aVar3;
        bVar.w = z2;
        bVar.x = i2;
        bVar.A = 2;
        f = fVar.f(a222, valueOf22, bVar);
        if (f != aVar2) {
        }
        return aVar2;
    }

    public Object a = null;
}
