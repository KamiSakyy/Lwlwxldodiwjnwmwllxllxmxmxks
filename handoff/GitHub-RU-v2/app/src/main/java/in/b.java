package in;

import com.apollographql.apollo.exception.CacheMissException;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Set t;
    public final /* synthetic */ Set u;
    public final /* synthetic */ j71.c v;
    public final /* synthetic */ j71.e w;
    public final /* synthetic */ com.github.service.wrapper.i x;

    public b(y71.j jVar, boolean z, Set set, Set set2, j71.c cVar, j71.e eVar, com.github.service.wrapper.i iVar) {
        this.r = jVar;
        this.s = z;
        this.t = set;
        this.u = set2;
        this.v = cVar;
        this.w = eVar;
        this.x = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if (r6.c(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        p0 a;
        int i2;
        y71.j jVar;
        aa.r0 r0Var;
        int i3;
        y71.j jVar2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i4 = aVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.v = i4 - Integer.MIN_VALUE;
                Object obj2 = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    aa.f fVar = (aa.f) obj;
                    a = r.a(fVar, this.s, this.t, this.u, this.v, this.w);
                    ga.e a2 = fVar.g.a(ga.e.b);
                    i2 = 0;
                    jVar = this.r;
                    if ((a2 == null || !a2.a) && !(fVar.e instanceof CacheMissException) && a != null && (r0Var = (aa.r0) a.a) != null) {
                        aa.s0 s0Var = fVar.b;
                        aVar.x = jVar;
                        aVar.y = a;
                        aVar.z = 0;
                        aVar.v = 1;
                        if (this.x.j(s0Var, r0Var, aVar) != aVar2) {
                            i3 = 0;
                            jVar2 = jVar;
                        }
                        return aVar2;
                    }
                    if (a != null) {
                        aVar.x = null;
                        aVar.y = null;
                        aVar.z = i2;
                        aVar.v = 2;
                    }
                    return w61.a0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return w61.a0.a;
                }
                i3 = aVar.z;
                a = aVar.y;
                jVar2 = aVar.x;
                sy.y.j(obj2);
                i2 = i3;
                jVar = jVar2;
                if (a != null) {
                }
                return w61.a0.a;
            }
        }
        aVar = new a(this, cVar);
        Object obj22 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        i2 = i3;
        jVar = jVar2;
        if (a != null) {
        }
        return w61.a0.a;
    }
    public Object L(Object p1) { return null; }
}
