package ga;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.DefaultApolloException;
import java.util.Set;
import k71.w;
import sy.y;
import w61.a0;
import y71.b0;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24830r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f24831s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y71.j f24832t;

    public l(w wVar, y71.j jVar) {
        this.f24830r = 1;
        this.f24831s = wVar;
        this.f24832t = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r7.c(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(aa.f fVar, a71.c cVar) {
        q qVar;
        int i;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f24848w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f24848w = i10 - Integer.MIN_VALUE;
                Object obj = qVar.f24846u;
                b71.a aVar = b71.a.r;
                i = qVar.f24848w;
                a0 a0Var = a0.a;
                w wVar = this.f24831s;
                if (i != 0) {
                    y.j(obj);
                    ApolloException apolloException = fVar.f647e;
                    DefaultApolloException defaultApolloException = ja.p.f27374a;
                    y71.j jVar = this.f24832t;
                    if (apolloException != defaultApolloException) {
                        qVar.f24848w = 2;
                        return jVar.c(fVar, qVar) == aVar ? aVar : a0Var;
                    }
                    Object obj2 = wVar.r;
                    if (obj2 != null) {
                        qVar.f24848w = 1;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                wVar.r = null;
                return a0Var;
            }
        }
        qVar = new q(this, cVar);
        Object obj3 = qVar.f24846u;
        b71.a aVar2 = b71.a.r;
        i = qVar.f24848w;
        a0 a0Var2 = a0.a;
        w wVar2 = this.f24831s;
        if (i != 0) {
        }
        wVar2.r = null;
        return a0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object th = null;
        k kVar;
        int i;
        ja.m mVar;
        int i10;
        Object obj2;
        y71.f fVar;
        int i11;
        b0 b0Var;
        int i12;
        l lVar;
        switch (this.f24830r) {
            case k5.f.J:
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i13 = kVar.f24828v;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        kVar.f24828v = i13 - Integer.MIN_VALUE;
                        Object obj3 = kVar.f24827u;
                        b71.a aVar = b71.a.r;
                        i = kVar.f24828v;
                        if (i != 0) {
                            y.j(obj3);
                            aa.f fVar2 = (aa.f) obj;
                            if (this.f24831s.r != null) {
                                aa.e a10 = fVar2.a();
                                a10.f635a = false;
                                fVar2 = a10.d();
                            }
                            kVar.f24828v = 1;
                            if (this.f24832t.c(fVar2, kVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                kVar = new k(this, cVar);
                Object obj32 = kVar.f24827u;
                b71.a aVar2 = b71.a.r;
                i = kVar.f24828v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                return a((aa.f) obj, cVar);
            case 2:
                if (cVar instanceof ja.m) {
                    mVar = (ja.m) cVar;
                    int i14 = mVar.f27368v;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        mVar.f27368v = i14 - Integer.MIN_VALUE;
                        Object obj4 = mVar.f27367u;
                        b71.a aVar3 = b71.a.r;
                        i10 = mVar.f27368v;
                        if (i10 != 0) {
                            y.j(obj4);
                            if (!(obj instanceof Set) || obj == b.f24811a || (obj2 = this.f24831s.r) == null || !x61.m.Z((Iterable) obj, (Iterable) obj2).isEmpty()) {
                                mVar.f27368v = 1;
                                if (this.f24832t.c(obj, mVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0.a;
                    }
                }
                mVar = new ja.m(this, cVar);
                Object obj42 = mVar.f27367u;
                b71.a aVar32 = b71.a.r;
                i10 = mVar.f27368v;
                if (i10 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof y71.f) {
                    fVar = (y71.f) cVar;
                    int i15 = fVar.w;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        fVar.w = i15 - Integer.MIN_VALUE;
                        Object obj5 = fVar.u;
                        b71.a aVar4 = b71.a.r;
                        i11 = fVar.w;
                        a0 a0Var = a0.a;
                        if (i11 != 0) {
                            y.j(obj5);
                            w wVar = this.f24831s;
                            Object obj6 = wVar.r;
                            if (obj6 == z71.b.b || !k71.k.b(obj6, obj)) {
                                wVar.r = obj;
                                fVar.w = 1;
                                if (this.f24832t.c(obj, fVar) == aVar4) {
                                    return aVar4;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return a0Var;
                    }
                }
                fVar = new y71.f(this, cVar);
                Object obj52 = fVar.u;
                b71.a aVar42 = b71.a.r;
                i11 = fVar.w;
                a0 a0Var2 = a0.a;
                if (i11 != 0) {
                }
                return a0Var2;
            default:
                if (cVar instanceof b0) {
                    b0Var = (b0) cVar;
                    int i16 = b0Var.x;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        b0Var.x = i16 - Integer.MIN_VALUE;
                        Object obj7 = b0Var.v;
                        b71.a aVar5 = b71.a.r;
                        i12 = b0Var.x;
                        if (i12 != 0) {
                            y.j(obj7);
                            try {
                                y71.j jVar = this.f24832t;
                                b0Var.u = this;
                                b0Var.x = 1;
                                if (jVar.c(obj, b0Var) == aVar5) {
                                    return aVar5;
                                }
                            } catch (Throwable th) {
                                th = th;
                                lVar = this;
                                lVar.f24831s.r = th;
                                throw th;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar = b0Var.u;
                            try {
                                y.j(obj7);
                            } catch (Throwable th2) {
                                th = th2;
                                lVar.f24831s.r = th;
                                throw th;
                            }
                        }
                        return a0.a;
                    }
                }
                b0Var = new b0(this, cVar);
                Object obj72 = b0Var.v;
                b71.a aVar52 = b71.a.r;
                i12 = b0Var.x;
                if (i12 != 0) {
                }
                return a0.a;
        }
    }

    public l(y71.g gVar, w wVar, y71.j jVar) {
        this.f24830r = 3;
        this.f24831s = wVar;
        this.f24832t = jVar;
    }

    public /* synthetic */ l(y71.j jVar, w wVar, int i) {
        this.f24830r = i;
        this.f24832t = jVar;
        this.f24831s = wVar;
    }
}
