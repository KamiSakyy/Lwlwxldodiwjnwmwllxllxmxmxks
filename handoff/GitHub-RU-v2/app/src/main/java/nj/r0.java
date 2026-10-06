package nj;

import androidx.compose.runtime.f3;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 extends c71.j implements j71.e {
    public Object A;
    public w61.e B;
    public Object C;
    public k71.u D;
    public k71.s E;
    public k71.s F;
    public int G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ s0Shadow K;
    public final /* synthetic */ oa.j L;
    public final /* synthetic */ String M;
    public final /* synthetic */ j71.e N;
    public final /* synthetic */ k71.i O;
    public final /* synthetic */ j71.f P;
    public y0 v;
    public e81.a w;
    public Object x;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0Shadow s0Var, oa.j jVar, String str, j71.e eVar, j71.c cVar, j71.f fVar, a71.c cVar2) {
        super(2, cVar2);
        this.K = s0Var;
        this.L = jVar;
        this.M = str;
        this.N = eVar;
        this.O = (k71.i) cVar;
        this.P = fVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        r0 r0Var = new r0(this.K, this.L, this.M, this.N, this.O, this.P, cVar);
        r0Var.J = obj;
        return r0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01cf A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:10:0x01cb, B:12:0x01cf, B:13:0x01d8, B:23:0x0178, B:32:0x01be, B:33:0x01b7), top: B:9:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #3 {all -> 0x01eb, blocks: (B:16:0x0123, B:18:0x0127), top: B:15:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d7  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [e81.a] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01c4 -> B:9:0x01cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y0 y0Var;
        j71.e eVar;
        String str;
        s0Shadow s0Var;
        oa.j jVar;
        j71.f fVar;
        j71.c cVar;
        int i;
        Object putIfAbsent;
        int size;
        j71.c cVar2;
        String str2;
        k71.s sVar;
        int i2;
        j71.f fVar2;
        s0Shadow s0Var2;
        k71.u uVar;
        e81.a aVar;
        q0 q0Var;
        oa.j jVar2;
        y0 y0Var2;
        int i3;
        e81.a aVar2;
        e81.a aVar3;
        y71.j jVar3 = (y71.j) this.J;
        b71.a aVar4 = b71.a.r;
        int i4 = this.I;
        e81.a r13 = (e81.a) (1);
        try {
            try {
                if (i4 == 0) {
                    sy.y.j(obj);
                    y0Var = (y0) this.K.b.a(this.L);
                    ConcurrentHashMap concurrentHashMap = this.K.c;
                    String h = f1.e.h(this.L.a, "|", this.M);
                    Object obj2 = concurrentHashMap.get(h);
                    if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(h, (obj2 = e81.d.a()))) != null) {
                        obj2 = putIfAbsent;
                    }
                    e81.a aVar5 = (e81.a) obj2;
                    eVar = this.N;
                    str = this.M;
                    s0Var = this.K;
                    jVar = this.L;
                    j71.c cVar3 = this.O;
                    fVar = this.P;
                    this.J = jVar3;
                    this.v = y0Var;
                    this.w = aVar5;
                    this.x = eVar;
                    this.y = str;
                    this.z = s0Var;
                    this.A = jVar;
                    this.B = cVar3;
                    this.C = fVar;
                    this.G = 0;
                    this.I = 1;
                    if (aVar5.m(this) == aVar4) {
                        return aVar4;
                    }
                    r13 = aVar5;
                    cVar = cVar3;
                    i = 0;
                } else if (i4 == 1) {
                    i = this.G;
                    fVar = (j71.f) this.C;
                    cVar = (j71.c) this.B;
                    jVar = (oa.j) this.A;
                    s0Var = (s0Shadow) this.z;
                    str = (String) this.y;
                    eVar = (j71.e) this.x;
                    e81.a aVar6 = this.w;
                    y0Var = this.v;
                    sy.y.j(obj);
                    r13 = aVar6;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.H;
                    int i6 = this.G;
                    k71.s sVar2 = this.F;
                    k71.s sVar3 = this.E;
                    uVar = this.D;
                    q0 q0Var2 = (q0) this.C;
                    j71.f fVar3 = (j71.f) this.B;
                    j71.c cVar4 = (j71.c) this.A;
                    oa.j jVar4 = (oa.j) this.z;
                    s0Shadow s0Var3 = (s0Shadow) this.y;
                    String str3 = (String) this.x;
                    e81.a aVar7 = this.w;
                    y0 y0Var3 = this.v;
                    sy.y.j(obj);
                    j71.f fVar4 = fVar3;
                    jVar2 = jVar4;
                    str2 = str3;
                    aVar2 = aVar7;
                    q0Var = q0Var2;
                    sVar = sVar3;
                    y0Var2 = y0Var3;
                    i2 = i6;
                    s0Var2 = s0Var3;
                    cVar2 = cVar4;
                    int i7 = i5;
                    b71.a aVar8 = aVar4;
                    try {
                        if (sVar2.r) {
                            sVar.r = false;
                        }
                        uVar.r++;
                        aVar4 = aVar8;
                        aVar = aVar2;
                        fVar2 = fVar4;
                        i3 = i7;
                        if (sVar.r) {
                            try {
                                k71.s sVar4 = new k71.s();
                                w wVar = s0Var2.a;
                                s0Shadow s0Var4 = s0Var2;
                                int i8 = uVar.r;
                                j71.f fVar5 = fVar2;
                                int i9 = q0Var.b;
                                wVar.getClass();
                                y0 y0Var4 = y0Var2;
                                k71.k.g(jVar2, "user");
                                k71.k.g(str2, "taskId");
                                k71.k.g(cVar2, "onError");
                                y71.y J = b31.b.J(((z01.l) wVar.a.a(jVar2)).e(i8, str2, i9), jVar2, cVar2);
                                oa.j jVar5 = jVar2;
                                b71.a aVar9 = aVar4;
                                int i11 = i3;
                                aVar2 = aVar3;
                                int i12 = i2;
                                y0Var2 = y0Var4;
                                f3 f3Var = new f3(sVar4, fVar5, y0Var2, uVar, jVar3, sVar, (a71.c) null, 9);
                                this.J = jVar3;
                                this.v = y0Var2;
                                this.w = aVar2;
                                this.x = str2;
                                this.y = s0Var4;
                                this.z = jVar5;
                                this.A = cVar2;
                                this.B = fVar5;
                                this.C = q0Var;
                                this.D = uVar;
                                this.E = sVar;
                                this.F = sVar4;
                                this.G = i12;
                                i7 = i11;
                                this.H = i7;
                                this.I = 2;
                                fVar4 = fVar5;
                                Object b = J.b(new y71.k0(z71.t.r, f3Var, 2), this);
                                b71.a aVar10 = b71.a.r;
                                if (b != aVar10) {
                                    b = w61.a0.a;
                                }
                                if (b != aVar10) {
                                    b = w61.a0.a;
                                }
                                aVar8 = aVar9;
                                if (b == aVar8) {
                                    return aVar8;
                                }
                                i2 = i12;
                                jVar2 = jVar5;
                                s0Var2 = s0Var4;
                                sVar2 = sVar4;
                                if (sVar2.r) {
                                }
                                uVar.r++;
                                aVar4 = aVar8;
                                aVar = aVar2;
                                fVar2 = fVar4;
                                i3 = i7;
                                if (sVar.r) {
                                    aVar.f((Object) null);
                                    return w61.a0.a;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar3;
                                r13 = aVar2;
                                r13.f((Object) null);
                                throw th;
                            }
                            aVar3 = aVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = aVar2;
                        r13.f((Object) null);
                        throw th;
                    }
                }
                if (sVar.r) {
                }
            } catch (Throwable th4) {
                th = th4;
                aVar2 = aVar;
            }
            v0 b2 = y0Var.b(str);
            synchronized (y0Var.b) {
                u0 u0Var = (u0) y0Var.b.h(str);
                size = u0Var != null ? u0Var.a.size() : 0;
            }
            q0 q0Var3 = (q0) eVar.s(b2, new Integer(size));
            k71.u uVar2 = new k71.u();
            uVar2.r = q0Var3.a;
            k71.s sVar5 = new k71.s();
            sVar5.r = true;
            cVar2 = cVar;
            str2 = str;
            sVar = sVar5;
            i2 = i;
            fVar2 = fVar;
            s0Var2 = s0Var;
            uVar = uVar2;
            aVar = r13;
            q0Var = q0Var3;
            jVar2 = jVar;
            y0Var2 = y0Var;
            i3 = 0;
        } catch (Throwable th5) {
            th = th5;
            r13.f((Object) null);
            throw th;
        }
    }
}
