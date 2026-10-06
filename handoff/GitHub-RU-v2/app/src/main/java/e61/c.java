package e61;

import a61.z;
import android.os.Build;
import androidx.compose.runtime.f2;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import k71.k;
import sy.y;
import v71.b0;
import w61.a0;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements j {
    public final q51.d a;
    public final a61.b b;
    public final d c;
    public final c61.a d;
    public final e81.c e;

    public c(a71.h hVar, q51.d dVar, a61.b bVar, d dVar2, c61.a aVar) {
        k.g(hVar, "backgroundDispatcher");
        k.g(dVar, "firebaseInstallationsApi");
        k.g(bVar, "appInfo");
        k.g(dVar2, "configsFetcher");
        k.g(aVar, "lazySettingsCache");
        this.a = dVar;
        this.b = bVar;
        this.c = dVar2;
        this.d = aVar;
        this.e = e81.d.a();
    }

    public static String f(String str) {
        Pattern compile = Pattern.compile("/");
        k.f(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        k.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // e61.j
    public final Boolean a() {
        e eVar = e().b;
        if (eVar != null) {
            return eVar.a;
        }
        k.m("sessionConfigs");
        throw null;
    }

    @Override // e61.j
    public final kotlin.time.a b() {
        e eVar = e().b;
        if (eVar == null) {
            k.m("sessionConfigs");
            throw null;
        }
        Integer num = eVar.c;
        if (num == null) {
            return null;
        }
        int i = kotlin.time.a.u;
        return new kotlin.time.a(kotlin.time.e.n(num.intValue(), kotlin.time.c.u));
    }

    @Override // e61.j
    public final Double c() {
        e eVar = e().b;
        if (eVar != null) {
            return eVar.b;
        }
        k.m("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a4, B:30:0x00b4, B:38:0x0084, B:42:0x0092), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x00a4, B:30:0x00b4, B:38:0x0084, B:42:0x0092), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [e81.a, java.lang.Object] */
    @Override // e61.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(a71.c cVar) {
        b bVar;
        java.lang.Object r4;
        e81.a aVar;
        e81.a aVar2;
        c cVar2;
        String str;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i = bVar.y;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.y = i - Integer.MIN_VALUE;
                    Object obj = bVar.w;
                    b71.a aVar3 = b71.a.r;
                    r4 = bVar.y;
                    a0 a0Var = a0.a;
                    if (r4 != 0) {
                        y.j(obj);
                        e81.a aVar4 = this.e;
                        if (!aVar4.d() && !e().b()) {
                            return a0Var;
                        }
                        bVar.u = this;
                        bVar.v = aVar4;
                        bVar.y = 1;
                        if (aVar4.m(bVar) != aVar3) {
                            aVar2 = aVar4;
                            cVar2 = this;
                        }
                        return aVar3;
                    }
                    if (r4 != 1) {
                        if (r4 != 2) {
                            if (r4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (e81.a) bVar.u;
                            try {
                                y.j(obj);
                                aVar.f((Object) null);
                                return a0Var;
                            } catch (Throwable th) {
                                th = th;
                                aVar.f((Object) null);
                                throw th;
                            }
                        }
                        e81.a aVar5 = bVar.v;
                        cVar2 = (c) bVar.u;
                        y.j(obj);
                        r4 = aVar5;
                        str = ((a61.a0Shadow) obj).a;
                        if (!str.equals("")) {
                            r4.f((Object) null);
                            return a0Var;
                        }
                        w61.k kVar = new w61.k("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        cVar2.getClass();
                        w61.k kVar2 = new w61.k("X-Crashlytics-Device-Model", f(format));
                        String str2 = Build.VERSION.INCREMENTAL;
                        k.f(str2, "INCREMENTAL");
                        w61.k kVar3 = new w61.k("X-Crashlytics-OS-Build-Version", f(str2));
                        String str3 = Build.VERSION.RELEASE;
                        k.f(str3, "RELEASE");
                        w61.k kVar4 = new w61.k("X-Crashlytics-OS-Display-Version", f(str3));
                        cVar2.b.getClass();
                        Map u = x.u(kVar, kVar2, kVar3, kVar4, new w61.k("X-Crashlytics-API-Client-Version", "2.1.2"));
                        d dVar = cVar2.c;
                        a0.h hVar = new a0.h(cVar2, (a71.c) null, 13);
                        f2 f2Var = new f2(2, (a71.c) null, 2);
                        bVar.u = r4;
                        bVar.v = null;
                        bVar.y = 3;
                        Object L = b0.L(dVar.b, new a0.h(dVar, u, hVar, f2Var, (a71.c) null), bVar);
                        if (L != aVar3) {
                            L = a0Var;
                        }
                        if (L != aVar3) {
                            aVar = r4;
                            aVar.f((Object) null);
                            return a0Var;
                        }
                        return aVar3;
                    }
                    e81.a aVar6 = bVar.v;
                    cVar2 = (c) bVar.u;
                    y.j(obj);
                    aVar2 = aVar6;
                    if (cVar2.e().b()) {
                        aVar2.f((Object) null);
                        return a0Var;
                    }
                    z zVar = a61.a0Shadow.c;
                    q51.d dVar2 = cVar2.a;
                    bVar.u = cVar2;
                    bVar.v = aVar2;
                    bVar.y = 2;
                    obj = zVar.a(dVar2, bVar);
                    r4 = aVar2;
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    str = ((a61.a0Shadow) obj).a;
                    if (!str.equals("")) {
                    }
                }
            }
            if (r4 != 0) {
            }
            if (cVar2.e().b()) {
            }
        } catch (Throwable th2) {
            th = th2;
            aVar = r4;
        }
        bVar = new b(this, (c71.c) cVar);
        Object obj2 = bVar.w;
        b71.a aVar32 = b71.a.r;
        r4 = bVar.y;
        a0 a0Var2 = a0.a;
    }

    public final i e() {
        Object obj = this.d.get();
        k.f(obj, "lazySettingsCache.get()");
        return (i) obj;
    }
}
