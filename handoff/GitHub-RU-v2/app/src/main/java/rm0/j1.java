package rm0;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 extends c71.j implements j71.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int v;
    public Object w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(a71.c cVar, t00.r3Shadow r3Var, int i) {
        super(3, cVar);
        this.v = 12;
        this.A = r3Var;
        this.y = i;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        switch (this.v) {
            case 0:
                j1 j1Var = new j1((k71.w) this.A, (a71.c) obj3, 0);
                j1Var.z = (Throwable) obj2;
                j1Var.v(w61.a0.a);
                return b71.a.r;
            case 1:
                j1 j1Var2 = new j1((k71.w) this.A, (a71.c) obj3, 1);
                j1Var2.z = (Throwable) obj2;
                j1Var2.v(w61.a0.a);
                return b71.a.r;
            case 2:
                j1 j1Var3 = new j1((k71.w) this.A, (a71.c) obj3, 2);
                j1Var3.z = (Throwable) obj2;
                j1Var3.v(w61.a0.a);
                return b71.a.r;
            case 3:
                j1 j1Var4 = new j1((k71.w) this.A, (a71.c) obj3, 3);
                j1Var4.z = (Throwable) obj2;
                j1Var4.v(w61.a0.a);
                return b71.a.r;
            case 4:
                j1 j1Var5 = new j1((k71.w) this.A, (a71.c) obj3, 4);
                j1Var5.z = (Throwable) obj2;
                j1Var5.v(w61.a0.a);
                return b71.a.r;
            case 5:
                j1 j1Var6 = new j1((k71.w) this.A, (a71.c) obj3, 5);
                j1Var6.z = (Throwable) obj2;
                j1Var6.v(w61.a0.a);
                return b71.a.r;
            case 6:
                j1 j1Var7 = new j1((k71.w) this.A, (a71.c) obj3, 6);
                j1Var7.z = (Throwable) obj2;
                j1Var7.v(w61.a0.a);
                return b71.a.r;
            case 7:
                j1 j1Var8 = new j1((k71.w) this.A, (a71.c) obj3, 7);
                j1Var8.z = (Throwable) obj2;
                j1Var8.v(w61.a0.a);
                return b71.a.r;
            case 8:
                j1 j1Var9 = new j1((k71.w) this.A, (a71.c) obj3, 8);
                j1Var9.z = (Throwable) obj2;
                j1Var9.v(w61.a0.a);
                return b71.a.r;
            case 9:
                j1 j1Var10 = new j1((k71.w) this.A, (a71.c) obj3, 9);
                j1Var10.z = (Throwable) obj2;
                j1Var10.v(w61.a0.a);
                return b71.a.r;
            case 10:
                j1 j1Var11 = new j1((k71.w) this.A, (a71.c) obj3, 10);
                j1Var11.z = (Throwable) obj2;
                j1Var11.v(w61.a0.a);
                return b71.a.r;
            case 11:
                j1 j1Var12 = new j1((k71.w) this.A, (a71.c) obj3, 11);
                j1Var12.z = (Throwable) obj2;
                j1Var12.v(w61.a0.a);
                return b71.a.r;
            default:
                j1 j1Var13 = new j1((a71.c) obj3, (t00.r3) this.A, this.y);
                j1Var13.w = jVar;
                j1Var13.z = obj2;
                return j1Var13.v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        Iterator it;
        int i;
        Iterator it2;
        int i2;
        Iterator it3;
        int i3;
        Iterator it4;
        int i4;
        Iterator it5;
        int i5;
        Iterator it6;
        int i6;
        Iterator it7;
        int i7;
        Iterator it8;
        int i8;
        Iterator it9;
        int i9;
        Iterator it10;
        int i10;
        Iterator it11;
        int i12;
        Iterator it12;
        int i13;
        dw.e5 e5Var;
        dw.f5 f5Var;
        dw.e5 e5Var2;
        dw.g5 g5Var;
        switch (this.v) {
            case 0:
                Throwable th = (Throwable) this.z;
                b71.a aVar = b71.a.r;
                int i14 = this.y;
                if (i14 == 0) {
                    sy.y.j(obj);
                    it = ((Iterable) ((k71.w) this.A).r).iterator();
                    i = 0;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.x;
                    it = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it.hasNext()) {
                    j71.c cVar = (j71.c) it.next();
                    this.z = th;
                    this.w = it;
                    this.x = i;
                    this.y = 1;
                    if (cVar.k(this) == aVar) {
                        return aVar;
                    }
                }
                throw th;
            case 1:
                Throwable th2 = (Throwable) this.z;
                b71.a aVar2 = b71.a.r;
                int i15 = this.y;
                if (i15 == 0) {
                    sy.y.j(obj);
                    it2 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i2 = 0;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.x;
                    it2 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it2.hasNext()) {
                    j71.c cVar2 = (j71.c) it2.next();
                    this.z = th2;
                    this.w = it2;
                    this.x = i2;
                    this.y = 1;
                    if (cVar2.k(this) == aVar2) {
                        return aVar2;
                    }
                }
                throw th2;
            case 2:
                Throwable th3 = (Throwable) this.z;
                b71.a aVar3 = b71.a.r;
                int i16 = this.y;
                if (i16 == 0) {
                    sy.y.j(obj);
                    it3 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i3 = 0;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.x;
                    it3 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it3.hasNext()) {
                    j71.c cVar3 = (j71.c) it3.next();
                    this.z = th3;
                    this.w = it3;
                    this.x = i3;
                    this.y = 1;
                    if (cVar3.k(this) == aVar3) {
                        return aVar3;
                    }
                }
                throw th3;
            case 3:
                Throwable th4 = (Throwable) this.z;
                b71.a aVar4 = b71.a.r;
                int i17 = this.y;
                if (i17 == 0) {
                    sy.y.j(obj);
                    it4 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i4 = 0;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = this.x;
                    it4 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it4.hasNext()) {
                    j71.c cVar4 = (j71.c) it4.next();
                    this.z = th4;
                    this.w = it4;
                    this.x = i4;
                    this.y = 1;
                    if (cVar4.k(this) == aVar4) {
                        return aVar4;
                    }
                }
                throw th4;
            case 4:
                Throwable th5 = (Throwable) this.z;
                b71.a aVar5 = b71.a.r;
                int i18 = this.y;
                if (i18 == 0) {
                    sy.y.j(obj);
                    it5 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i5 = 0;
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.x;
                    it5 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it5.hasNext()) {
                    j71.c cVar5 = (j71.c) it5.next();
                    this.z = th5;
                    this.w = it5;
                    this.x = i5;
                    this.y = 1;
                    if (cVar5.k(this) == aVar5) {
                        return aVar5;
                    }
                }
                throw th5;
            case 5:
                Throwable th6 = (Throwable) this.z;
                b71.a aVar6 = b71.a.r;
                int i19 = this.y;
                if (i19 == 0) {
                    sy.y.j(obj);
                    it6 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i6 = 0;
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i6 = this.x;
                    it6 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it6.hasNext()) {
                    j71.c cVar6 = (j71.c) it6.next();
                    this.z = th6;
                    this.w = it6;
                    this.x = i6;
                    this.y = 1;
                    if (cVar6.k(this) == aVar6) {
                        return aVar6;
                    }
                }
                throw th6;
            case 6:
                Throwable th7 = (Throwable) this.z;
                b71.a aVar7 = b71.a.r;
                int i20 = this.y;
                if (i20 == 0) {
                    sy.y.j(obj);
                    it7 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i7 = 0;
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.x;
                    it7 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it7.hasNext()) {
                    j71.c cVar7 = (j71.c) it7.next();
                    this.z = th7;
                    this.w = it7;
                    this.x = i7;
                    this.y = 1;
                    if (cVar7.k(this) == aVar7) {
                        return aVar7;
                    }
                }
                throw th7;
            case 7:
                Throwable th8 = (Throwable) this.z;
                b71.a aVar8 = b71.a.r;
                int i22 = this.y;
                if (i22 == 0) {
                    sy.y.j(obj);
                    it8 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i8 = 0;
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = this.x;
                    it8 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it8.hasNext()) {
                    j71.c cVar8 = (j71.c) it8.next();
                    this.z = th8;
                    this.w = it8;
                    this.x = i8;
                    this.y = 1;
                    if (cVar8.k(this) == aVar8) {
                        return aVar8;
                    }
                }
                throw th8;
            case 8:
                Throwable th9 = (Throwable) this.z;
                b71.a aVar9 = b71.a.r;
                int i23 = this.y;
                if (i23 == 0) {
                    sy.y.j(obj);
                    it9 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i9 = 0;
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = this.x;
                    it9 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it9.hasNext()) {
                    j71.c cVar9 = (j71.c) it9.next();
                    this.z = th9;
                    this.w = it9;
                    this.x = i9;
                    this.y = 1;
                    if (cVar9.k(this) == aVar9) {
                        return aVar9;
                    }
                }
                throw th9;
            case 9:
                Throwable th10 = (Throwable) this.z;
                b71.a aVar10 = b71.a.r;
                int i24 = this.y;
                if (i24 == 0) {
                    sy.y.j(obj);
                    it10 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i10 = 0;
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.x;
                    it10 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it10.hasNext()) {
                    j71.c cVar10 = (j71.c) it10.next();
                    this.z = th10;
                    this.w = it10;
                    this.x = i10;
                    this.y = 1;
                    if (cVar10.k(this) == aVar10) {
                        return aVar10;
                    }
                }
                throw th10;
            case 10:
                Throwable th11 = (Throwable) this.z;
                b71.a aVar11 = b71.a.r;
                int i25 = this.y;
                if (i25 == 0) {
                    sy.y.j(obj);
                    it11 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i12 = 0;
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.x;
                    it11 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it11.hasNext()) {
                    j71.c cVar11 = (j71.c) it11.next();
                    this.z = th11;
                    this.w = it11;
                    this.x = i12;
                    this.y = 1;
                    if (cVar11.k(this) == aVar11) {
                        return aVar11;
                    }
                }
                throw th11;
            case 11:
                Throwable th12 = (Throwable) this.z;
                b71.a aVar12 = b71.a.r;
                int i26 = this.y;
                if (i26 == 0) {
                    sy.y.j(obj);
                    it12 = ((Iterable) ((k71.w) this.A).r).iterator();
                    i13 = 0;
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = this.x;
                    it12 = (Iterator) this.w;
                    sy.y.j(obj);
                }
                while (it12.hasNext()) {
                    j71.c cVar12 = (j71.c) it12.next();
                    this.z = th12;
                    this.w = it12;
                    this.x = i13;
                    this.y = 1;
                    if (cVar12.k(this) == aVar12) {
                        return aVar12;
                    }
                }
                throw th12;
            default:
                t00.r3Shadow r3Var = (t00.r3) this.A;
                b71.a aVar13 = b71.a.r;
                int i27 = this.x;
                if (i27 == 0) {
                    sy.y.j(obj);
                    y71.j jVar = (y71.j) this.w;
                    zx.h hVar = (zx.h) this.z;
                    zx.i iVar = hVar.b;
                    String str = hVar.a.c;
                    dw.h5 h5Var = iVar != null ? iVar.c : null;
                    String str2 = (h5Var == null || (e5Var2 = h5Var.c) == null || (g5Var = e5Var2.c) == null) ? null : g5Var.a;
                    String str3 = (h5Var == null || (e5Var = h5Var.c) == null || (f5Var = e5Var.b) == null) ? null : f5Var.a;
                    t00.m3 m3Var = str2 != null ? new t00.m3(com.github.service.wrapper.b.a(r3Var.s, new zx.i0(new aa.u0(Integer.valueOf(this.y)), str2), ga.h.t, false, null, 60), r3Var, str, h5Var, 1) : str3 != null ? new t00.m3(com.github.service.wrapper.b.a(r3Var.s, new zx.y(str3), ga.h.t, false, null, 60), r3Var, str, h5Var, 0) : y71.h.r;
                    this.w = null;
                    this.z = null;
                    this.x = 1;
                    if (y71.n1.q(jVar, m3Var, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k71.w wVar, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.A = wVar;
    }
}
