package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p extends c71.j implements j71.f {
    public final /* synthetic */ j71.c A;
    public final /* synthetic */ i B;
    public k71.w v;
    public k71.v w;
    public int x;
    public /* synthetic */ Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j71.c cVar, i iVar, a71.c cVar2) {
        super(3, cVar2);
        this.A = cVar;
        this.B = iVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.A, this.B, (a71.c) obj3);
        pVar.y = (v71.z) obj;
        pVar.z = (j) obj2;
        return pVar.v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x012e, code lost:
    
        if (r12.c(r19) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x001d, code lost:
    
        if (r12.d(r19) == r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0071  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, x71.v] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9, types: [x71.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        k71.w wVar;
        j jVar;
        Object obj2;
        k71.v vVar;
        k71.w wVar2;
        x71.v r7;
        j jVar2;
        d81.e eVar;
        k71.v vVar2;
        Object obj3;
        b71.a aVar = b71.a.r;
        int i = this.x;
        if (i == 0) {
            sy.y.j(obj);
            v71.z zVar = (v71.z) this.y;
            j jVar3 = (j) this.z;
            j71.e pVar = new androidx.lifecycle.p(this.B, (a71.c) null, 1);
            x71.a aVar2 = x71.a.r;
            v71.a0Shadow a0Var = v71.a0Shadow.r;
            v71.a sVar = new x71.s(v71.b0.A(zVar, a71.i.r), t.e.a(0, 4, aVar2));
            sVar.q0(a0Var, sVar, pVar);
            wVar = new k71.w();
            jVar = jVar3;
            obj2 = sVar;
            wVar2 = wVar;
            obj3 = wVar2.r;
            if (obj3 == z71.b.d) {
            }
        } else if (i == 1) {
            vVar2 = this.w;
            wVar2 = this.v;
            obj2 = (x71.v) this.z;
            jVar = (j) this.y;
            sy.y.j(obj);
            wVar2.r = null;
            vVar = vVar2;
            wVar = wVar2;
            r7 = obj2;
            jVar2 = jVar;
            a71.h hVar = ((c71.c) this).s;
            k71.k.d(hVar);
            eVar = new d81.e(hVar);
            if (wVar.r != null) {
            }
            b1.m b = r7.b();
            eVar.f(new d81.c(eVar, (x71.hShadow) b.s, x71.d.z, x71.e.z, null, new m7.x(wVar, jVar2, (a71.c) null, 22), (j71.f) b.t), false);
            this.y = jVar2;
            this.z = r7;
            this.v = wVar;
            this.w = null;
            this.x = 2;
            if (!(d81.e.w.get(eVar) instanceof d81.c)) {
            }
            jVar = jVar2;
            obj2 = r7;
            wVar2 = wVar;
            obj3 = wVar2.r;
            if (obj3 == z71.b.d) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = this.v;
            r7 = (x71.v) this.z;
            jVar2 = (j) this.y;
            sy.y.j(obj);
            jVar = jVar2;
            obj2 = r7;
            wVar2 = wVar;
            obj3 = wVar2.r;
            if (obj3 == z71.b.d) {
                vVar = new k71.v();
                if (obj3 != null) {
                    a81.t tVar = z71.b.b;
                    if (obj3 == tVar) {
                        obj3 = null;
                    }
                    long longValue = ((Number) this.A.k(obj3)).longValue();
                    vVar.r = longValue;
                    if (longValue < 0) {
                        throw new IllegalArgumentException("Debounce timeout should not be negative");
                    }
                    if (longValue == 0) {
                        Object obj4 = wVar2.r;
                        if (obj4 == tVar) {
                            obj4 = null;
                        }
                        this.y = jVar;
                        this.z = obj2;
                        this.v = wVar2;
                        this.w = vVar;
                        this.x = 1;
                        if (jVar.c(obj4, this) != aVar) {
                            vVar2 = vVar;
                            wVar2.r = null;
                            vVar = vVar2;
                        }
                        return aVar;
                    }
                }
                wVar = wVar2;
                r7 = obj2;
                jVar2 = jVar;
                a71.h hVar2 = ((c71.c) this).s;
                k71.k.d(hVar2);
                eVar = new d81.e(hVar2);
                if (wVar.r != null) {
                    long j = vVar.r;
                    a10.b bVar = new a10.b(jVar2, wVar, (a71.c) null, 17);
                    d81.b bVar2 = new d81.b(j);
                    d81.a aVar3 = d81.a.z;
                    k71.z.c(3, aVar3);
                    eVar.f(new d81.c(eVar, bVar2, aVar3, d81.g.r, d81.h.e, bVar, null), false);
                }
                b1.m b2 = r7.b();
                eVar.f(new d81.c(eVar, (x71.hShadow) b2.s, x71.d.z, x71.e.z, null, new m7.x(wVar, jVar2, (a71.c) null, 22), (j71.f) b2.t), false);
                this.y = jVar2;
                this.z = r7;
                this.v = wVar;
                this.w = null;
                this.x = 2;
                if (!(d81.e.w.get(eVar) instanceof d81.c)) {
                }
                jVar = jVar2;
                obj2 = r7;
                wVar2 = wVar;
                obj3 = wVar2.r;
                if (obj3 == z71.b.d) {
                    return w61.a0.a;
                }
            }
        }
    }
}
