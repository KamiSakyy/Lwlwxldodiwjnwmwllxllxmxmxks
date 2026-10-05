package nm;

import a0.q0;
import com.github.domain.database.GitHubDatabase;
import com.github.service.models.response.SimpleRepository;
import d1.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s0.z0;
import sy.y;
import um.s;
import w61.a0;
import x61.n;
import xk.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends c71.j implements j71.c {
    public final /* synthetic */ Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int v;
    public Object w;
    public int x;
    public int y;
    public final /* synthetic */ oa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, oa.j jVar, ArrayList arrayList, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.D = obj;
        this.z = jVar;
        this.A = arrayList;
    }

    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                a71.c cVar = (a71.c) obj;
                return new j((k) this.D, this.z, (ArrayList) this.A, cVar, 0).v(a0.a);
            case 1:
                a71.c cVar2 = (a71.c) obj;
                return new j((s) this.D, this.z, (ArrayList) this.A, cVar2, 1).v(a0.a);
            default:
                l lVar = (l) this.A;
                List list = (List) this.D;
                return new j(lVar, this.z, list, (a71.c) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        zj.b B;
        ArrayList arrayList;
        int i;
        zj.b bVar;
        ek.d F;
        ArrayList arrayList2;
        int i2;
        ek.d dVar;
        bk.b C;
        List<SimpleRepository> list;
        int i3;
        bk.b bVar2;
        switch (this.v) {
            case 0:
                Object obj2 = b71.a.r;
                int i4 = this.y;
                Object obj3 = a0.a;
                if (i4 == 0) {
                    y.j(obj);
                    B = ((GitHubDatabase) ((k) this.D).a.a(this.z)).B();
                    arrayList = (ArrayList) this.A;
                    this.B = B;
                    this.w = arrayList;
                    this.C = B;
                    this.x = 0;
                    this.y = 1;
                    Object M = m71.a.M(this, B.a, false, true, new ze.a(6));
                    if (M != obj2) {
                        M = obj3;
                    }
                    if (M == obj2) {
                        return obj2;
                    }
                    i = 0;
                    bVar = B;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zj.b bVar3 = (zj.b) this.B;
                        y.j(obj);
                        return bVar3;
                    }
                    i = this.x;
                    B = (zj.b) this.C;
                    arrayList = (ArrayList) this.w;
                    bVar = (zj.b) this.B;
                    y.j(obj);
                }
                zj.d[] dVarArr = (zj.d[]) arrayList.toArray(new zj.d[0]);
                zj.d[] dVarArr2 = (zj.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                this.B = bVar;
                this.w = null;
                this.C = null;
                this.x = i;
                this.y = 2;
                Object M2 = m71.a.M(this, B.a, false, true, new z0(17, B, dVarArr2));
                if (M2 == obj2) {
                    obj3 = M2;
                }
                return obj3 == obj2 ? obj2 : bVar;
            case 1:
                Object obj4 = b71.a.r;
                int i5 = this.y;
                Object obj5 = a0.a;
                if (i5 == 0) {
                    y.j(obj);
                    F = ((GitHubDatabase) ((s) this.D).a.a(this.z)).F();
                    arrayList2 = (ArrayList) this.A;
                    this.B = F;
                    this.w = arrayList2;
                    this.C = F;
                    this.x = 0;
                    this.y = 1;
                    Object M3 = m71.a.M(this, F.a, false, true, new ef.b(9));
                    if (M3 != obj4) {
                        M3 = obj5;
                    }
                    if (M3 == obj4) {
                        return obj4;
                    }
                    i2 = 0;
                    dVar = F;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ek.d dVar2 = (ek.d) this.B;
                        y.j(obj);
                        return dVar2;
                    }
                    i2 = this.x;
                    F = (ek.d) this.C;
                    arrayList2 = (ArrayList) this.w;
                    dVar = (ek.d) this.B;
                    y.j(obj);
                }
                ek.e[] eVarArr = (ek.e[]) arrayList2.toArray(new ek.e[0]);
                ek.e[] eVarArr2 = (ek.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                this.B = dVar;
                this.w = null;
                this.C = null;
                this.x = i2;
                this.y = 2;
                Object M4 = m71.a.M(this, F.a, false, true, new e0(18, F, eVarArr2));
                if (M4 == obj4) {
                    obj5 = M4;
                }
                return obj5 == obj4 ? obj4 : dVar;
            default:
                Object obj6 = b71.a.r;
                int i6 = this.y;
                Object obj7 = a0.a;
                if (i6 == 0) {
                    y.j(obj);
                    C = ((GitHubDatabase) ((l) this.A).a.a(this.z)).C();
                    list = (List) this.D;
                    this.B = C;
                    this.C = list;
                    this.w = C;
                    this.x = 0;
                    this.y = 1;
                    Object M5 = m71.a.M(this, C.a, false, true, new bf.c(6));
                    if (M5 != obj6) {
                        M5 = obj7;
                    }
                    if (M5 == obj6) {
                        return obj6;
                    }
                    i3 = 0;
                    bVar2 = C;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bk.b bVar4 = (bk.b) this.B;
                        y.j(obj);
                        return bVar4;
                    }
                    i3 = this.x;
                    C = (bk.b) this.w;
                    list = (List) this.C;
                    bVar2 = (bk.b) this.B;
                    y.j(obj);
                }
                ArrayList arrayList3 = new ArrayList(n.F(list, 10));
                for (SimpleRepository simpleRepository : list) {
                    arrayList3.add(new bk.c(simpleRepository.u, simpleRepository.r, simpleRepository.s, simpleRepository.t, simpleRepository.v));
                }
                bk.c[] cVarArr = (bk.c[]) arrayList3.toArray(new bk.c[0]);
                bk.c[] cVarArr2 = (bk.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
                this.B = bVar2;
                this.C = null;
                this.w = null;
                this.x = i3;
                this.y = 2;
                Object M6 = m71.a.M(this, C.a, false, true, new q0(18, C, cVarArr2));
                if (M6 == b71.a.r) {
                    obj7 = M6;
                }
                return obj7 == obj6 ? obj6 : bVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, oa.j jVar, List list, a71.c cVar) {
        super(1, cVar);
        this.v = 2;
        this.A = lVar;
        this.z = jVar;
        this.D = list;
    }
}
