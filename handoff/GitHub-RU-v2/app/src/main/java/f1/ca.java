package f1;

/* loaded from: /home/user/work/p/classes.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final e81.c f22629a = e81.d.a();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.runtime.p1 f22630b = androidx.compose.runtime.t.B(null);

    public static Object c(ca caVar, String str, String str2, v9 v9Var, a71.c cVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            v9Var = str2 == null ? v9.f23929r : v9.f23931t;
        }
        caVar.getClass();
        return caVar.b(new aa(str, str2, v9Var), cVar);
    }

    public final z9 a() {
        return (z9) this.f22630b.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r10.m(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(aa aaVar, a71.c cVar) {
        ba baVar;
        b71.a aVar;
        int i;
        androidx.compose.runtime.p1 p1Var;
        e81.a aVar2;
        Throwable th;
        Object s2;
        e81.a aVar3;
        try {
            try {
                if (cVar instanceof ba) {
                    baVar = (ba) cVar;
                    int i10 = baVar.f22557y;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        baVar.f22557y = i10 - Integer.MIN_VALUE;
                        Object obj = baVar.f22555w;
                        aVar = b71.a.r;
                        i = baVar.f22557y;
                        p1Var = this.f22630b;
                        if (i != 0) {
                            sy.y.j(obj);
                            baVar.f22553u = aaVar;
                            aVar2 = this.f22629a;
                            baVar.f22554v = aVar2;
                            baVar.f22557y = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar3 = baVar.f22554v;
                                try {
                                    sy.y.j(obj);
                                    p1Var.setValue(null);
                                    aVar3.f((Object) null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    p1Var.setValue(null);
                                    throw th;
                                }
                            }
                            e81.a aVar4 = baVar.f22554v;
                            aa aaVar2 = baVar.f22553u;
                            sy.y.j(obj);
                            aVar2 = aVar4;
                            aaVar = aaVar2;
                        }
                        baVar.f22553u = aaVar;
                        baVar.f22554v = aVar2;
                        baVar.f22557y = 2;
                        v71.l lVar = new v71.l(1, com.google.android.gms.internal.measurement.b4.T(baVar));
                        lVar.t();
                        p1Var.setValue(new z9(aaVar, lVar));
                        s2 = lVar.s();
                        if (s2 != aVar) {
                            e81.a aVar5 = aVar2;
                            obj = s2;
                            aVar3 = aVar5;
                            p1Var.setValue(null);
                            aVar3.f((Object) null);
                            return obj;
                        }
                        return aVar;
                    }
                }
                baVar.f22553u = aaVar;
                baVar.f22554v = aVar2;
                baVar.f22557y = 2;
                v71.l lVar2 = new v71.l(1, com.google.android.gms.internal.measurement.b4.T(baVar));
                lVar2.t();
                p1Var.setValue(new z9(aaVar, lVar2));
                s2 = lVar2.s();
                if (s2 != aVar) {
                }
                return aVar;
            } catch (Throwable th3) {
                th = th3;
                p1Var.setValue(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            aaVar.f((Object) null);
            throw th4;
        }
        baVar = new ba(this, cVar);
        Object obj2 = baVar.f22555w;
        aVar = b71.a.r;
        i = baVar.f22557y;
        p1Var = this.f22630b;
    }
}
