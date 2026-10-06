package a61;

import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z {
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(6:29|30|31|32|(1:34)|27)|23|24|25))|40|6|7|(0)(0)|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [q51.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q51.d dVar, c71.c cVar) {
        y yVar;
        int i;
        q51.c cVar2;
        String str;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i2 = yVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.x = i2 - Integer.MIN_VALUE;
                Object obj = yVar.v;
                b71.a aVar = b71.a.r;
                i = yVar.x;
                String str2 = "";
                if (i != 0) {
                    sy.y.j(obj);
                    q51.c cVar3 = (q51.c) dVar;
                    w21.o d = cVar3.d();
                    try {
                        k71.k.f(d, "firebaseInstallations.getToken(false)");
                        yVar.u = cVar3;
                        yVar.x = 1;
                        Object R = i4.R(d, yVar);
                        if (R != aVar) {
                            obj = R;
                            dVar = cVar3;
                        }
                    } catch (Exception unused) {
                        dVar = cVar3;
                        cVar2 = dVar;
                        str = "";
                        w21.o c = cVar2.c();
                        k71.k.f(c, "firebaseInstallations.id");
                        yVar.u = str;
                        yVar.x = 2;
                        obj = i4.R(c, yVar);
                        dVar = str;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) yVar.u;
                    sy.y.j(obj);
                    dVar = str3;
                    k71.k.f(obj, "{\n          firebaseInst…ions.id.await()\n        }");
                    str2 = (String) obj;
                    return new a0Shadow(str2, dVar);
                }
                q51.d dVar2 = (q51.d) yVar.u;
                sy.y.j(obj);
                dVar = dVar2;
                String str4 = ((q51.a) obj).a;
                k71.k.f(str4, "{\n          firebaseInst…).await().token\n        }");
                cVar2 = dVar;
                str = str4;
                w21.o c2 = cVar2.c();
                k71.k.f(c2, "firebaseInstallations.id");
                yVar.u = str;
                yVar.x = 2;
                obj = i4.R(c2, yVar);
                dVar = str;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.v;
        b71.a aVar2 = b71.a.r;
        i = yVar.x;
        String str22 = "";
        if (i != 0) {
        }
        String str42 = ((q51.a) obj2).a;
        k71.k.f(str42, "{\n          firebaseInst…).await().token\n        }");
        cVar2 = dVar;
        str = str42;
        w21.o c22 = cVar2.c();
        k71.k.f(c22, "firebaseInstallations.id");
        yVar.u = str;
        yVar.x = 2;
        obj2 = i4.R(c22, yVar);
        dVar = str;
    }
}
