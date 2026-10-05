package k6;

import androidx.glance.session.SessionWorker;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f27761a;

    /* renamed from: b, reason: collision with root package name */
    public final ie.d f27762b;

    /* renamed from: c, reason: collision with root package name */
    public final t f27763c;

    /* renamed from: d, reason: collision with root package name */
    public final e81.c f27764d;

    /* renamed from: e, reason: collision with root package name */
    public final k f27765e;

    public l() {
        ie.d dVar = new ie.d(25);
        this.f27761a = SessionWorker.class;
        this.f27762b = dVar;
        this.f27763c = y.f27808a;
        this.f27764d = e81.d.a();
        this.f27765e = new k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r9.m(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(l lVar, j71.e eVar, c71.c cVar) {
        g gVar;
        b71.a aVar;
        int i;
        e81.a aVar2;
        e81.a aVar3;
        Object s2;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i10 = gVar.f27747z;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    gVar.f27747z = i10 - Integer.MIN_VALUE;
                    Object obj = gVar.f27745x;
                    aVar = b71.a.r;
                    i = gVar.f27747z;
                    if (i != 0) {
                        sy.y.j(obj);
                        aVar2 = lVar.f27764d;
                        gVar.f27742u = lVar;
                        gVar.f27743v = (c71.j) eVar;
                        gVar.f27744w = aVar2;
                        gVar.f27747z = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (e81.a) gVar.f27742u;
                            try {
                                sy.y.j(obj);
                                aVar3.f((Object) null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                aVar3.f((Object) null);
                                throw th;
                            }
                        }
                        e81.a aVar4 = gVar.f27744w;
                        eVar = (j71.e) gVar.f27743v;
                        l lVar2 = (l) gVar.f27742u;
                        sy.y.j(obj);
                        aVar2 = aVar4;
                        lVar = lVar2;
                    }
                    k kVar = lVar.f27765e;
                    gVar.f27742u = aVar2;
                    gVar.f27743v = null;
                    gVar.f27744w = null;
                    gVar.f27747z = 2;
                    s2 = eVar.s(kVar, gVar);
                    if (s2 != aVar) {
                        e81.a aVar5 = aVar2;
                        obj = s2;
                        aVar3 = aVar5;
                        aVar3.f((Object) null);
                        return obj;
                    }
                    return aVar;
                }
            }
            k kVar2 = lVar.f27765e;
            gVar.f27742u = aVar2;
            gVar.f27743v = null;
            gVar.f27744w = null;
            gVar.f27747z = 2;
            s2 = eVar.s(kVar2, gVar);
            if (s2 != aVar) {
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            aVar3 = aVar2;
            aVar3.f((Object) null);
            throw th;
        }
        gVar = new g(lVar, cVar);
        Object obj2 = gVar.f27745x;
        aVar = b71.a.r;
        i = gVar.f27747z;
        if (i != 0) {
        }
    }








}
