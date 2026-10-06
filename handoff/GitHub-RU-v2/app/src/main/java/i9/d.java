package i9;

import f0.b2;
import v71.b0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public y f26091a;

    /* renamed from: b, reason: collision with root package name */
    public r9.n f26092b;

    /* renamed from: c, reason: collision with root package name */
    public e81.e f26093c;

    /* renamed from: d, reason: collision with root package name */
    public l f26094d;

    public d(y yVar, r9.n nVar, e81.i iVar, l lVar) {
        this.f26091a = yVar;
        this.f26092b = nVar;
        this.f26093c = iVar;
        this.f26094d = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // i9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a71.c cVar) {
        c cVar2;
        b71.a aVar;
        int i;
        e81.e eVar;
        d dVar;
        e81.e eVar2;
        Throwable th;
        Object F;
        try {
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i10 = cVar2.f26090y;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar2.f26090y = i10 - Integer.MIN_VALUE;
                    Object obj = cVar2.f26088w;
                    aVar = b71.a.r;
                    i = cVar2.f26090y;
                    if (i != 0) {
                        sy.y.j(obj);
                        cVar2.f26086u = this;
                        eVar = this.f26093c;
                        cVar2.f26087v = eVar;
                        cVar2.f26090y = 1;
                        if (((e81.h) eVar).a(cVar2) != aVar) {
                            dVar = this;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        eVar2 = (e81.e) cVar2.f26086u;
                        try {
                            sy.y.j(obj);
                            g gVar = (g) obj;
                            ((e81.h) eVar2).c();
                            return gVar;
                        } catch (Throwable th2) {
                            th = th2;
                            ((e81.h) eVar2).c();
                            throw th;
                        }
                    }
                    e81.e eVar3 = cVar2.f26087v;
                    dVar = (d) cVar2.f26086u;
                    sy.y.j(obj);
                    eVar = eVar3;
                    b2 b2Var = new b2(18, dVar);
                    cVar2.f26086u = eVar;
                    cVar2.f26087v = null;
                    cVar2.f26090y = 2;
                    F = b0.F(b2Var, cVar2);
                    if (F != aVar) {
                        eVar2 = eVar;
                        obj = F;
                        g gVar2 = (g) obj;
                        ((e81.h) eVar2).c();
                        return gVar2;
                    }
                    return aVar;
                }
            }
            b2 b2Var2 = new b2(18, dVar);
            cVar2.f26086u = eVar;
            cVar2.f26087v = null;
            cVar2.f26090y = 2;
            F = b0.F(b2Var2, cVar2);
            if (F != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            eVar2 = eVar;
            th = th3;
            ((e81.h) eVar2).c();
            throw th;
        }
        cVar2 = new c(this, (c71.c) cVar);
        Object obj2 = cVar2.f26088w;
        aVar = b71.a.r;
        i = cVar2.f26090y;
        if (i != 0) {
        }
    }
}
